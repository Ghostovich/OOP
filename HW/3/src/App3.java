import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Проделать код ревью своих работ. Продумать, какие компоненты можно и нужно

public class App3 {
        public static void main(String[] args) throws IOException {
                List<Family> familyMembers = new ArrayList<>();
                Family f = FamilyCreator
                                .getInstance()
                                .setName("Сергей")
                                .setStatus("Отец")
                                .setDay(10, 7, 1969)
                                .Create();
                familyMembers.add(f);

                f = FamilyCreator
                                .getInstance()
                                .setName("Лидия")
                                .setStatus("Мать")
                                .setDay(03, 03, 1969)
                                .Create();
                familyMembers.add(f);

                f = FamilyCreator
                                .getInstance()
                                .setName("Филипп")
                                .setStatus("Сын")
                                .setDay(21, 8, 1991)
                                .Create();
                familyMembers.add(f);

                f = FamilyCreator
                                .getInstance()
                                .setName("Константин")
                                .setStatus("Сын")
                                .setDay(9, 10, 1993)
                                .Create();
                familyMembers.add(f);

                f = FamilyCreator
                                .getInstance()
                                .setName("Елена")
                                .setStatus("Невестка")
                                .setDay(12, 06, 1993)
                                .Create();
                familyMembers.add(f);

                f = FamilyCreator
                                .getInstance()
                                .setName("Татьяна")
                                .setStatus("Невестка")
                                .setDay(23, 02, 1990)
                                .Create();
                familyMembers.add(f);

                f = FamilyCreator
                                .getInstance()
                                .setName("Вера")
                                .setStatus("Внучка")
                                .setDay(14, 05, 2019)
                                .Create();
                familyMembers.add(f);

                f = FamilyCreator
                                .getInstance()
                                .setName("Николай")
                                .setStatus("Внук")
                                .setDay(10, 9, 2020)
                                .Create();
                familyMembers.add(f);

                f = FamilyCreator
                                .getInstance()
                                .setName("Галина")
                                .setStatus("Сестра")
                                .setDay(22, 2, 1958)
                                .Create();
                familyMembers.add(f);

                f = FamilyCreator
                                .getInstance()
                                .setName("Надежда")
                                .setStatus("Сестра")
                                .setDay(14, 4, 1962)
                                .Create();
                familyMembers.add(f);

                f = FamilyCreator
                                .getInstance()
                                .setName("Сергей")
                                .setStatus("Отец")
                                .setDay(10, 7, 1969)
                                .Create();
                familyMembers.add(f);

                f = FamilyCreator
                                .getInstance()
                                .setName("Алексей")
                                .setStatus("Племянник")
                                .setDay(9, 5, 1982)
                                .Create();
                familyMembers.add(f);

                f = FamilyCreator
                                .getInstance()
                                .setName("Наталья")
                                .setStatus("Сноха")
                                .setDay(14, 9, 1986)
                                .Create();
                familyMembers.add(f);

                f = FamilyCreator
                                .getInstance()
                                .setName("Анастасия")
                                .setStatus("Внучка")
                                .setDay(28, 8, 1995)
                                .Create();
                familyMembers.add(f);

                f = FamilyCreator
                                .getInstance()
                                .setName("Анна")
                                .setStatus("Внучка")
                                .setDay(17, 6, 1997)
                                .Create();
                familyMembers.add(f);

                FamilyScanner.familyScanner("Выберите действие: \n 1 - добавить элемент дерева\n" +
                                " 2 - показать все \n 3 - импортировать в файл\n 4 - экспортировать в файл\n",
                                familyMembers);

        }
}