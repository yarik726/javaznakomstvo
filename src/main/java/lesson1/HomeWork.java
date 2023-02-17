package lesson1;

import java.util.concurrent.ThreadLocalRandom;

public class HomeWork {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }



    static void printThreeWords() {
        System.out.println("Задание номер 2");
        System.out.println("orange");
        System.out.println("banana");
        System.out.println("apple");
        System.out.println(" ");
    }

    private static void checkSumSign() {
        System.out.println("Задание номер 3");
        int a = ThreadLocalRandom.current().nextInt(-20, 20);
        ;
        int b = 5;
        int i = a + b;
        int result = i;
        System.out.println("Ответ получается:" + result);
        //System.out.println(1.0 * a+ b );
        if (result >= 0) {
            System.out.println("Сумма положительная");

        } else {
            System.out.println("Сумма отрицатальная");
            System.out.println("    ");
        }
    }

    private static void printColor() {
        System.out.println("Задание номер 4");
        int value = ThreadLocalRandom.current().nextInt(-5, 101);
        //int value =100;
        System.out.println("Диапазон цвета:" + value);
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 100) {
            System.out.println("Зеленый");

        } else if (value >= 1 || value <= 100) {
            System.out.println("Желтый");
        }
        System.out.println("Проверка окончена");
        System.out.println(" ");
    }

    private static void compareNumbers() {
        System.out.println("Задание номер 5");
        int a = ThreadLocalRandom.current().nextInt(-20, 20);
        int b = 3;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
            System.out.println("Работа окончена");

        }
    }
}

