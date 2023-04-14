import hw14.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Griffindor garry = new Griffindor("Гарри", "Поттер", "Гриффиндор", 85, 75, 90, 70, 65);
        Griffindor germiona = new Griffindor("Гермиона", "Грейнджер ", "Гриффиндор", 65, 50, 65, 70, 90);
        Griffindor ron = new Griffindor("Рон", "Уизли", "Гриффиндор", 40, 40, 70, 63, 55);
        Hufflepuff zahariya = new Hufflepuff("Захария", "Смит", "Пуффендуй", 44, 85, 20, 40, 60);
        Hufflepuff sedric = new Hufflepuff("Седрик", "Диггори", "Пуффендуй", 76, 30, 30, 50, 70);
        Hufflepuff jastin = new Hufflepuff("Джастин", "Финч-Флетчли", "Пуффендуй", 22, 45, 40, 50, 55);
        Ravenclaw chgou = new Ravenclaw("Чжоу", "Чанг", "Когтевран", 82, 73, 50, 80, 46);
        Ravenclaw padma = new Ravenclaw("Падма", "Патил", "Когтевран", 91, 50, 90, 43, 75);
        Ravenclaw marcus = new Ravenclaw("Маркус", "Белби", "Когтевран", 61, 83, 89, 52, 47);
        Slytherin draco = new Slytherin("Драко", "Малфой", "Слизерин", 73, 82, 66, 55, 77, 84, 99);
        Slytherin grahem = new Slytherin("Грэхэм", "Монтегю", "Слизерин", 46, 86, 48, 62, 75, 98, 42);
        Slytherin gregory = new Slytherin("Грегори", "Гойл", "Слизерин", 34, 45, 95, 42, 15, 78, 68);

        descriptionOfTheStudent(draco); //Описание учеников
        System.out.println();
        grahem.printHogwarts(draco); //Сравнение всех учеников Хогвардса
        System.out.println();
        zahariya.printHufflepuff(sedric); //Сравнение учеников Пуффендуй
        System.out.println();
        ron.printGriffindor(germiona); //Сравнение учеников Гриффиндор
        System.out.println();
        chgou.printRavenclaw(marcus); //Сравнение учеников Когтерван
        System.out.println();
        draco.printSlytherin(gregory); //Сравнение учеников Слизерин

    }

    public static void descriptionOfTheStudent(Hogwarts student) {
        System.out.println(student.toString());
    }
}