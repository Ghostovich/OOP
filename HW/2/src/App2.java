import java.util.ArrayList;
import java.util.List;

// Используйте предыдущие задачи из прошлого домашнего задания. 
// Необходимо гарантированно продумать иерархию компонент и взаимодействия их между собой.
// Обеспечить переход от использования явных классов в сторону использования абстрактных типов. 
// Т е работаем не с: конкретным экземпляром генеалогического древа, 
// а с интерфейсом “ генеалогическое древо”

public class App2 {
    public static void main(String[] args) {
        List<Family> familyMembers = new ArrayList<>();
        Family f = FamilyCreator
                .getInstance()
                .setName("Сергей")
                .setStatus("Отец")
                .setDay("10.07.1967")
                .Create();
        familyMembers.add(f);

        f = FamilyCreator
                .getInstance()
                .setName("Лидия")
                .setStatus("Мать")
                .setDay("03.03.1969")
                .Create();
        familyMembers.add(f);

        f = FamilyCreator
                .getInstance()
                .setName("Филипп")
                .setStatus("Сын")
                .setDay("21.08.1991")
                .Create();
        familyMembers.add(f);

        f = FamilyCreator
                .getInstance()
                .setName("Константин")
                .setStatus("Сын")
                .setDay("09.10.1993")
                .Create();
        familyMembers.add(f);

        f = FamilyCreator
                .getInstance()
                .setName("Елена")
                .setStatus("Невестка")
                .setDay("12.06.1993")
                .Create();
        familyMembers.add(f);

        f = FamilyCreator
                .getInstance()
                .setName("Татьяна")
                .setStatus("Невестка")
                .setDay("23.02.1990")
                .Create();
        familyMembers.add(f);

        f = FamilyCreator
                .getInstance()
                .setName("Вера")
                .setStatus("Внучка")
                .setDay("14.05.2019")
                .Create();
        familyMembers.add(f);

        f = FamilyCreator
                .getInstance()
                .setName("Николай")
                .setStatus("Внук")
                .setDay("10.09.2020")
                .Create();
        familyMembers.add(f);

        FamilyScanner.familyScanner("Выберите действие: \n 1 - добавить элемент дерева\n" +
                " 2 - показать все", familyMembers);
    }

}
