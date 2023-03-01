import java.util.List;
import java.util.ArrayList;

// Реализовать, с учетом ооп подхода, приложение для проведения исследований с генеалогическим древом. 
// Идея: описать некоторое количество компонент, например: модель человека компонента хранения связей 
// и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат, свекровь, сестра и т. д. 
// компонент для проведения исследований дополнительные компоненты, например отвечающие за вывод данных в консоль, 
// загрузку и сохранения в файл, получение\построение отдельных моделей человека под “проведением исследования” можно 
// понимать получение всех детей выбранного человека. Описать с ООП стиле, логику взаимодействия объектов реального мира между собой: 
// шкаф-человек. Какие члены должны быть у каждого из классов (у меня на семинаре студенты пришли к тому, 
// чтобы продумать логику взаимодействия жена разрешает открыть дверцу шкафа мужу, после чего эту дверцу можно открыть)

public class h1 {
    public static void main(String[] args) {

        List<Family> family = new ArrayList<>();

        Family familyMember = new Family(0, "Сергей", "10 07 1967", "Отец");
        family.add(familyMember);

        familyMember = new Family(1, "Лидия", "03 03 1969", "Мать");
        family.add(familyMember);

        familyMember = new Family(2, "Филипп", "21 08 1991", "Сын");
        family.add(familyMember);

        familyMember = new Family(3, "Константин", "09 07 1993", "Сын");
        family.add(familyMember);

        familyMember = new Family(4, "Елена", "12 06 1993", "Невестка");
        family.add(familyMember);

        familyMember = new Family(5, "Татьяна", "23 02 1990", "Невестка");
        family.add(familyMember);

        familyMember = new Family(6, "Вера", "14 05 2019", "Внучка");
        family.add(familyMember);

        familyMember = new Family(7, "Николай", "10 09 2020", "Внук");
        family.add(familyMember);

        for (Family fm : family) {
            System.out.println(fm);
        }
    }
}
