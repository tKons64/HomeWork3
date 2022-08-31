public class Main {
    public static void main(String[] args) {

    //Задание №1
        System.out.println(" ");
        System.out.println("Задание №1:");
        byte varTypeByte = 1;
        short varTypeShort = 200;
        int varTypeInt = 3000;
        long varTypeLong = 4 ;

        float varTypeFloat = 1.5f;
        double varTypeDouble = 2.5;

        System.out.println("Значение переменной varTypeByte, с типом byte, равно - " + varTypeByte);
        System.out.println("Значение переменной varTypeShort, с типом short, равно - " + varTypeShort);
        System.out.println("Значение переменной varTypeInt, с типом int, равно - " + varTypeInt);
        System.out.println("Значение переменной varTypeLong, с типом long, равно - " + varTypeLong);
        System.out.println("Значение переменной varTypeFloat, с типом float, равно - " + varTypeFloat);
        System.out.println("Значение переменной varTypeDouble, с типом double, равно - " + varTypeDouble);

    //Задание №2
        System.out.println(" ");
        System.out.println("Задание №2:");
        float var1 = 27.12f;
        long var2 = 987_678_965_549L;
        float var3 = 2.786f;
        boolean var4 = false;
        short var5 = 569;
        short var6 = -159;
        short var7 = 27897;
        byte var8 = 67;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8);

    //Задание №3
        System.out.println(" ");
        System.out.println("Задание №3:");

        byte studentsTeacher1 = 23;
        byte studentsTeacher2 = 27;
        byte studentsTeacher3 = 30;
        short sheetsPaper = 480;

        short studentsTotal = (short)(studentsTeacher1 + studentsTeacher2 + studentsTeacher3);
        int sheetsPaperForStudent = sheetsPaper / studentsTotal;

        System.out.println("На каждого ученика рассчитано - " + sheetsPaperForStudent + " листов бумаги");

    //Задание №4
        System.out.println(" ");
        System.out.println("Задание №4:");

        byte exampleBottles = 16;
        byte exampleTime = 2;

        int performanceMachineInMinute = exampleBottles / exampleTime;

        byte Period1_Minutes = 20;
        byte Period2_Days = 1;
        byte Period3_Days = 3;
        byte Period4_Month = 1;

        // Приведем все периоды к минутам
        int Period2_Minutes = Period2_Days * 24 * 60;
        int Period3_Minutes = Period3_Days * 24 * 60;
        int Period4_Minutes = Period4_Month * 30 * 24 * 60;

        int performanceMachineInPeriod1 = performanceMachineInMinute * Period1_Minutes;
        int performanceMachineInPeriod2 = performanceMachineInMinute * Period2_Minutes;
        int performanceMachineInPeriod3 = performanceMachineInMinute * Period3_Minutes;
        int performanceMachineInPeriod4 = performanceMachineInMinute * Period4_Minutes;

        System.out.println("За " + Period1_Minutes + " минут, машина произвела бутылок - " + performanceMachineInPeriod1 + " штук.");
        System.out.println("За " + Period2_Days + " день, машина произвела бутылок - " + performanceMachineInPeriod2 + " штук.");
        System.out.println("За " + Period3_Days + " дня, машина произвела бутылок - " + performanceMachineInPeriod3 + " штук.");
        System.out.println("За " + Period4_Month + " месяц, машина произвела бутылок - " + performanceMachineInPeriod4 + " штук.");

    //Задание №5
        System.out.println(" ");
        System.out.println("Задание №5:");

        byte totalJars = 120;
        byte oneClassJarsWhiteColor = 2;
        byte oneClassJarsBrownColor = 4;
        int totalClassesInSchool = totalJars / (oneClassJarsWhiteColor + oneClassJarsBrownColor);

        float proportionOfWhiteColor = (float)oneClassJarsWhiteColor / (oneClassJarsWhiteColor + oneClassJarsBrownColor);

        int totalJarsWhiteColor = (int) (totalJars * proportionOfWhiteColor);
        int totalJarsBrownColor = totalJars - totalJarsWhiteColor;

        System.out.println("В школе, где " + totalClassesInSchool + " классов, нужно "
                + totalJarsWhiteColor + " банок белой краски и "
                + totalJarsBrownColor + " банок коричневой краски");


    }
}