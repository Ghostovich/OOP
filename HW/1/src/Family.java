class Family {
    public int id;
    public String name;
    public String dayOfBirth;
    public String status;

    public Family(int id, String name, String dayOfBirth, String status) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.status = status;
    }

    @Override
    public String toString() {
        return " id - " + id + ", name - " + name + ", dayOfBirth - " + dayOfBirth + ", status - " + status;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}