package com.bolotin;

public class Metods {


    public static void findBestStudentGryffindor(Hogwarts[] students) {
        int maxResult = 0;
        int result = 0;
        String resultNameOfStudent = null;
        for (int i = 0; i < students.length; i++) {
            if (students[i] instanceof Gryffindor)
                result = ((Gryffindor) students[i]).getChivalry() + ((Gryffindor) students[i]).getHonor() + ((Gryffindor) students[i]).getBravery();
            if (maxResult < result) {
                maxResult = result;
                resultNameOfStudent = ((Gryffindor) students[i]).getNameOfStudent();

            }
        }
        System.out.println(resultNameOfStudent + " лучший стутент на факультете Гриффиндор с количеством баллов: " + maxResult);
    }


    public static void printInformationOfStudent(Hogwarts[] students) {

            for (int i = 0; i < students.length; i++) {

                System.out.println(students[i]);
            }





    }

    public static void findBestStudentHufflepuff(Hogwarts[] students) {
        int maxResult = 0;
        int result = 0;
        String resultNameOfStudent = null;
        for (int i = 0; i < students.length; i++) {
            if (students[i] instanceof Hufflepuff)
                result = ((Hufflepuff) students[i]).getHardWork() + ((Hufflepuff) students[i]).getLoyalty() + ((Hufflepuff) students[i]).getHonesty();
            if (maxResult < result) {
                maxResult = result;
                resultNameOfStudent = ((Hufflepuff) students[i]).getNameOfStudent();

            }
        }
        System.out.println(resultNameOfStudent + " лучший стутент на факультете Пуффендуй с количеством баллов: " + maxResult);
    }
    public static void findBestStudentRavenclaw(Hogwarts[] students) {
        int maxResult = 0;
        int result = 0;
        String resultNameOfStudent = null;
        for (int i = 0; i < students.length; i++) {
            if (students[i] instanceof Ravenclaw)
                result = ((Ravenclaw) students[i]).getIntelligence() + ((Ravenclaw) students[i]).getWisdom()
                        + ((Ravenclaw) students[i]).getWit() + ((Ravenclaw) students[i]).getCreation();
            if (maxResult < result) {
                maxResult = result;
                resultNameOfStudent = ((Ravenclaw) students[i]).getNameOfStudent();

            }
        }
        System.out.println(resultNameOfStudent + " лучший стутент на факультете Когтевран с количеством баллов: " + maxResult);
    }
    public static void findBestStudentSlytherin(Hogwarts[] students) {
        int maxResult = 0;
        int result = 0;
        String resultNameOfStudent = null;
        for (int i = 0; i < students.length; i++) {
            if (students[i] instanceof Slytherin)
                result = ((Slytherin) students[i]).getCunning() + ((Slytherin) students[i]).getDetermination()
                        + ((Slytherin) students[i]).getAmbition() + ((Slytherin) students[i]).getResourcefulness()
                        + ((Slytherin) students[i]).getLeadership();
            if (maxResult < result) {
                maxResult = result;
                resultNameOfStudent = ((Slytherin) students[i]).getNameOfStudent();

            }
        }
        System.out.println(resultNameOfStudent + " лучший стутент на факультете Когтевран с количеством баллов: " + maxResult);
    }

    public static void compareTwoStudent(Hogwarts student1, Hogwarts student2) {
        int resultStudent1 = student1.getMagicPower() + student1.getTransgressionDistance();
        int resultStudent2 = student2.getMagicPower() + student2.getTransgressionDistance();
        if (resultStudent1 > resultStudent2) {
            System.out.println(student1.getNameOfStudent() + " имеет бульшую сумму силы магии и расстояния трансгрессии чем " + student2.getNameOfStudent());
        } else  if (resultStudent1 == resultStudent2) {

            System.out.println(student1.getNameOfStudent() + " имеет такую же сумму силы магии и расстояния трансгрессии как и " + student2.getNameOfStudent());
        } else {
            System.out.println(student2.getNameOfStudent() + " имеет бульшую сумму силы магии и расстояния трансгрессии чем " + student1.getNameOfStudent());

        }


    }
}



