package main.java.com.respect17.datatypes.variables;

public class ClassVariableExample {
    // Static variable
    static int staticVar;

    public ClassVariableExample(int value) {
        staticVar = value;
    }

    public void display() {
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        ClassVariableExample example1 = new ClassVariableExample(30);
        example1.display();

        ClassVariableExample example2 = new ClassVariableExample(40);
        example2.display();
    }

}
