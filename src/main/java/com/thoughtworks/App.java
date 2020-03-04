package com.thoughtworks;

import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        String testStr = "add * to each end of this string";
        System.out.println("---user defined functional interface--");
        System.out.println(testStr);
        ownConsumerPrint(testStr);
        System.out.println("---predefined functional interface--");
        System.out.println(testStr);
        consumerPrint(testStr);
        int testNum = 9;
        System.out.println("---user defined functional interface--");
        System.out.println("original number:" + testNum);
        System.out.println(ownFunctionSquare(testNum));

    }

    public static void ownConsumerPrint(String text) {
        OwnConsumer<String> ownConsumer = str -> System.out.println("*" + str + "*");
        ownConsumer.print(text);
    }

    public static void consumerPrint(String text) {
        Consumer<String> consumer = str -> System.out.println("*" + str + "*");
        consumer.accept(text);
    }

    public static int ownFunctionSquare(int num) {
        OwnFunction<Integer> ownFunction = number -> number * number;
        return ownFunction.square(num);
    }
}
