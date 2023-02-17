package lesson1;

import java.util.concurrent.ThreadLocalRandom;

public class MainForLessonOne {
    public static void main(String[] args) {
//        printHello();
//        testVars();
        checkAppraisal();
    }


//    static void printHello() {
////        System.out.println("Привет!");
////        System.out.println("Выведи хоть что то");
//    }
//
//    private static void testVars() {
//        int varA;
//        varA = 9;
//        int varB = 5;
//
//        System.out.println(1.0 * varB / varA);
//
//        double varDoubleA = 9.0;
//        double varDoubleB = 5.0;
//
//        System.out.println(varDoubleB / varDoubleA);
//        System.out.println(1.3 / 3);
//        int result1 = (int) (varA / varDoubleB);
//        double result2 = varA / varDoubleB;
//        boolean isRed = false;
//    char chr1 = '@';
//    char chr2 = 1224;
//        System.out.println(chr1);
//        System.out.println(chr2);
//
//        String helloStr = "hello";
//        String worldStr = "world";
//        System.out.println(helloStr + ", "+ worldStr + "!" );
//        System.out.println(helloStr + ", "+ worldStr + "!" + (3 +5));


    private static void checkAppraisal() {
        int appraisal = ThreadLocalRandom.current().nextInt(-1, 7);
        System.out.println("Школьник принес оценку:" + appraisal);
        if (appraisal == 5) {
            System.out.println("Молодец Так держать");
        } else if (appraisal == 4) {
            System.out.println("Молодец , но ты можешь быть лучше");
//        } else if (appraisal == 3 || appraisal == 2 || appraisal == 1) {
//            System.out.println("Это плохо");
//        }
        } else if (appraisal >= 1 && appraisal <= 3) {
            System.out.println("Это плохо");
        } else {
            System.out.println("Не ври");
        }
        System.out.println("Проверка окончена");
    }
}