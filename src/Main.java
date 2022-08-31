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

    //Задание №6
        System.out.println(" ");
        System.out.println("Задание №6:");

        short weghtBanana = 80;
        short volumeMilk = 200;
        short weghtIcecream = 100;
        short egg = 70;

        // переведем молоко в вес
        double weghtMilk = volumeMilk * 1.05;

        //считаем общий вес завтрака
        int weightBreakfastGrams =  (int) (weghtBanana * 5 + weghtMilk + weghtIcecream * 2 + egg * 4);

        //переводим вес завтрака в килограммы
        float weightBreakfastKilograms = (float)weightBreakfastGrams / 1000;

        System.out.println("Общий вес завтрака в граммах - " + weightBreakfastGrams);
        System.out.println("Общий вес завтрака в килограммах - " + weightBreakfastKilograms);

    //Задание №7
        System.out.println(" ");
        System.out.println("Задание №7:");

        byte weightLostKg = 7; // вес в килограммах
        int weightLostGr = weightLostKg * 1000; // вес в граммах
        short gramsMin = 250;
        short gramsMax = 500;
        int gramsAverage = (gramsMax + gramsMin) / 2;

        int daysMax = weightLostGr / gramsMin;
        int daysMin = weightLostGr / gramsMax;
        int daysAverageFull = weightLostGr / gramsAverage;
        float hoursRemainder = ((weightLostGr / (float)gramsAverage) % daysAverageFull) * 24;

        System.out.println("Максимальное время похудения Боксера №1 (по 250 гр. в день) - " + daysMax + " дней");
        System.out.println("Минимальное время похудения Боксера №1 (по 500 гр. в день) - " + daysMin + " дней");
        System.out.println("Среднее время похудения Боксера №1 (по " + gramsAverage + " гр. в день) - " +
                (byte)daysAverageFull + " дней, " +
                (byte)(hoursRemainder + 0.5) + " часов");

//Задание №8
        System.out.println(" ");
        System.out.println("Задание №8:");

        // иницииализируем переменные для текущей месячной зарплаты сотрудников
        int pastSalaryMonthMaria = 67_760;
        int pastSalaryMonthDenis = 83_690;
        int pastSalaryMonthKristina = 76_230;

        // иницииализируем переменные и рассчитаем текущий годовой доход сотрудников
        int pastSalaryYearMaria = pastSalaryMonthMaria * 12;
        int pastSalaryYearDenis = pastSalaryMonthDenis * 12;
        int pastSalaryYearKristina = pastSalaryMonthKristina * 12;

        float indexPercent = 0.1f;

        // иницииализируем переменные и рассчитаем новый размер месячной зарплаты сотрудников
        float nowSalaryMonthMaria = pastSalaryMonthMaria * indexPercent + pastSalaryMonthMaria;
        float nowSalaryMonthDenis = pastSalaryMonthDenis * indexPercent + pastSalaryMonthDenis;
        float nowSalaryMonthKristina = pastSalaryMonthKristina * indexPercent + pastSalaryMonthKristina;

        // иницииализируем переменные и рассчитаем новый годовой доход сотрудников
        int nowSalaryYearMaria = (int)nowSalaryMonthMaria * 12;
        int nowSalaryYearDenis = (int)nowSalaryMonthDenis * 12;
        int nowSalaryYearKristina = (int)nowSalaryMonthKristina * 12;

        // иницииализируем переменные и расчитываем разницу в годовом доходе
        int distinctionSalaryYearMaria    = nowSalaryYearMaria - pastSalaryYearMaria;
        int distinctionSalaryYearDenis    = nowSalaryYearDenis - pastSalaryYearDenis;
        int distinctionSalaryYearKristina = nowSalaryYearKristina - pastSalaryYearKristina;

        System.out.println("Маша теперь получает - " + (int)nowSalaryMonthMaria + " рублей. " +
                "Годовой доход вырос на - " + distinctionSalaryYearMaria + " рублей");
        System.out.println("Денис теперь получает - " + (int)nowSalaryMonthDenis + " рублей. " +
                "Годовой доход вырос на - " + distinctionSalaryYearDenis + " рублей");
        System.out.println("Кристина теперь получает - " + (int)nowSalaryMonthKristina + " рублей. " +
                "Годовой доход вырос на - " + distinctionSalaryYearKristina + " рублей");

    }
}