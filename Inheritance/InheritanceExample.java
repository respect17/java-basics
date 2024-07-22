package Inheritance;

class InheritanceExample {// superclass

    String name;

    public void eat() {
        System.out.println("I can eat");
    }
}

// class JerryTheMouse extends InheritanceExample
class JerryTheMouse extends InheritanceExample { // subclass

    public void display() {
        System.out.println("My name is " + name);

    }

class Main {
    public static void main(String[] args) {
  
      // create an object of the outer subclass
      JerryTheMouse mouse = new JerryTheMouse();
      mouse.name = "Jerry, the mouse";
      mouse.display();
      mouse.eat();
    }

}