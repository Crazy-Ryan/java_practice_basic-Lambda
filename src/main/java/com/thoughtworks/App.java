package com.thoughtworks;

public class App {
    public static void main(String[] args) {
        System.out.println("---user defined functional interface--");
        String testStr = "add * to each end of this string";
        System.out.println(testStr);
        ownConsumerPrint(testStr);
    }

    public static void ownConsumerPrint(String text){
        OwnConsumer ownConsumer = str -> System.out.println("*" + str + "*");
        ownConsumer.print(text);
    }
}
