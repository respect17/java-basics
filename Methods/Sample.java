package main.java.com.respect17.datatypes.variables;

public class Sample {
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        myMethod();
        myMethod();// calling the method multiple times
        myMethod();
    }
}