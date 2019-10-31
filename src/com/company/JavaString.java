package com.company;

import java.util.Scanner;

class JavaString {
    private Scanner in = new Scanner(System.in);

    void javaStringStart() {
        System.out.println("Лабораторная раббота 2.\n" +
                "Выполнил студент группы ИКБО-17-18: " +
                "Евпатов Михаил Васильевич");

        printMainMenuMessage();
        printYourChoiceMessage();

        int value = in.nextInt();

        while (value != 0) {
            switch (value) {
                case 1:
                    javaStringTaskFirst();
                    break;
                case 2:
                    javaStringTaskSecond();
                    break;
                case 3:
                    javaStringTaskThird();
                    break;
                default:
                    System.out.println("Неверный ввод. Повторите.");
                    printYourChoiceMessage();
            }
            printMainMenuMessage();
            printYourChoiceMessage();
            value = in.nextInt();
        }
        javaStringFinish();
    }

    // tasks functions
    private void javaStringTaskFirst() {
        TaskFirst tf = new TaskFirst();

        printFirstTaskSubMenuMessage();
        printYourChoiceMessage();

        int value = in.nextInt();

        while (value != 0) {
            switch (value) {
                case 1:
                    printSubTaskNumberMessage(1);
                    tf.subTaskFirst();
                    break;
                case 2:
                    printSubTaskNumberMessage(2);
                    tf.subTaskSecond();
                    break;
                case 3:
                    printSubTaskNumberMessage(3);
                    tf.subTaskThird();
                    break;
                case 4:
                    printSubTaskNumberMessage(4);
                    tf.subTaskFourth();
                    break;
                default:
                    System.out.println("Неверный ввод. Повторите.");
                    printFirstTaskSubMenuMessage();
                    printYourChoiceMessage();
            }
            printFirstTaskSubMenuMessage();
            printYourChoiceMessage();
            value = in.nextInt();
        }
    }

    private void javaStringTaskSecond() {
        TaskSecond ts = new TaskSecond();

        printSecondTaskSubMenuMessage();
        printYourChoiceMessage();

        int value = in.nextInt();

        while (value != 0) {
            switch (value) {
                case 1:
                    printSubTaskNumberMessage(1);
                    ts.subTaskFirst();
                    break;
                case 2:
                    printSubTaskNumberMessage(2);
                    ts.subTaskSecond();
                    break;
                case 3:
                    printSubTaskNumberMessage(3);
                    ts.subTaskThird();
                    break;
                default:
                    System.out.println("Неверный ввод. Повторите.");
                    printYourChoiceMessage();
            }
            printSecondTaskSubMenuMessage();
            printYourChoiceMessage();
            value = in.nextInt();
        }
    }

    private void javaStringTaskThird() {
        TaskThird tt = new TaskThird();

        printThirdTaskSubMenuMessage();
        printYourChoiceMessage();

        int value = in.nextInt();

        while (value != 0) {
            switch (value) {
                case 1:
                    printSubTaskNumberMessage(1);
                    tt.subTaskFirst();
                    break;
                case 2:
                    printSubTaskNumberMessage(2);
                    tt.subTaskSecond();
                    break;
                default:
                    System.out.println("Неверный ввод. Повторите.");
                    printThirdTaskSubMenuMessage();
                    printYourChoiceMessage();
            }
            printThirdTaskSubMenuMessage();
            printYourChoiceMessage();
            value = in.nextInt();
        }
    }

    private void javaStringFinish() {
        System.exit(0);
    }

    // support methods
    private void printMainMenuMessage() {
        System.out.println("\tГлавное меню.\n" +
                "[1] Задание 1.\n" +
                "[2] Задание 2.\n" +
                "[3] Заданик 3.\n" +
                "[0] Выход из программы.");
    }

    private void printFirstTaskSubMenuMessage() {
        System.out.println("\tЗадание 1.\n" +
                "[1] Разделить текст на абзацы.\n" +
                "[2] Записать первое и полседнее слово прописными.\n" +
                "[3] Найти колличесвто вхождений подстроки (ам).\n" +
                "[4] Сформировать новую строку: \"Колличесто слов в предложении = (число слов).\".\n" +
                "[0] Выход в главное меню.");
    }

    private void printSecondTaskSubMenuMessage() {
        System.out.println("\tЗадание 2.\n" +
                "[1] Разделить текст на абзацы.\n" +
                "[2] Записать первое и полседнее слово прописными.\n" +
                "[3] Сформировать строку и добавить в текст: \"Колличесто предложений в тексте = (колличество предложений).\n" +
                "[0] Выход в главное меню.");
    }

    private void printThirdTaskSubMenuMessage() {
        System.out.println("\tЗадание 3.\n" +
                "[1] Сравнить два числа в строке.\n" +
                "[2] Заменить два эквивалентных числа \"*\".\n" +
                "[0] Выход в главное меню.");
    }

    private void printSubTaskNumberMessage(int subTaskNumber) {
        System.out.println("\t\t\tНомер " + subTaskNumber + ".");
    }

    private void printYourChoiceMessage() {
        System.out.print("Ваш выбор: ");
    }
}
