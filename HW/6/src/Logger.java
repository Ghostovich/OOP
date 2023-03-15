import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

class Logger implements ILogger {
  @Override
  public void log(IDataLogger model) {

    try (FileWriter writer = new FileWriter("HW/6/src/log.csv", true)) {

      writer.write(LocalDate.now() + ";");
      writer.write(model.getMessage() + ";");
      writer.write(model.getErrorCode() + ";");
      writer.write(model.getTag() == null ? "-;" : model.getTag() + ";");
      writer.append('\n');

    } catch (IOException ex) {
    }
  }
}

interface IDataLogger {
  String getMessage();

  Integer getErrorCode();

  Object getTag();
}

class DataLogger implements IDataLogger {

  String message;
  int errorCode;
  Object tag;

  public DataLogger(String message, int errorCode, Object tag) {
    this.message = message;
    this.errorCode = errorCode;
    this.tag = tag;
  }

  public DataLogger(String message, int errorCode) {
    this(message, errorCode, null);
  }

  public DataLogger(String message) {
    this(message, 0, null);
  }

  @Override
  public String getMessage() {
    return message;
  }

  @Override
  public Integer getErrorCode() {
    return errorCode;
  }

  @Override
  public Object getTag() {
    return tag;
  }
}

interface ILogger {
  void log(IDataLogger model);
}
