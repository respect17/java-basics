package main.java.com.respect17.datatypes.variables;

public class InstanceVariableExample {
    // Instance variable
    // instance variables are declared outside method/block/constructor
    int instanceVar;

    public InstanceVariableExample(int value) {
        this.instanceVar = value;
    }

    public void display() {
        System.out.println("Instance Variable: " + instanceVar);
    }

    public static void main(String[] args) {
        InstanceVariableExample example = new InstanceVariableExample(20);
        example.display();
    }
}
