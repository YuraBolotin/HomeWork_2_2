package com.bolotin;

import static com.bolotin.Metods.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hogwarts[] students = {
            new Gryffindor("Гарри Поттер", 15, 25, 35, 45,55),
            new Gryffindor("Гермиона Грейнджер", 16, 26, 36, 44,56),
            new Gryffindor("Рон Уизли", 17, 27, 37, 43,57),
            new Hufflepuff("Захария Смит", 18, 28, 38, 42,58),
            new Hufflepuff("Седрин Диггори", 19, 29, 39, 41,59),
            new Hufflepuff("Джастин Финч-Флетчли", 20, 30, 40, 40,60),
            new Ravenclaw("Чжоу Чанг", 21, 31, 41, 39,61, 15),
            new Ravenclaw("Падма Патил", 22, 32, 42, 38,62, 15),
            new Ravenclaw("Маркус Белби", 23, 33, 43, 37,63, 15),
            new Slytherin("Драко Малфой", 24, 34, 44, 36,64, 15 ,30),
            new Slytherin("Грэхэм Монтегю", 25, 35, 45, 35,65, 15 ,31),
            new Slytherin("Грегори Гойл", 26, 36, 46, 34,66, 15 ,32),
        };

        printInformationOfStudent(students);
        System.out.println();

        findBestStudentGryffindor(students);
        System.out.println();

        findBestStudentHufflepuff(students);
        System.out.println();

        findBestStudentRavenclaw(students);
        System.out.println();

        findBestStudentSlytherin(students);
        System.out.println();

      compareTwoStudent(students[0], students[1]);
    }


}
