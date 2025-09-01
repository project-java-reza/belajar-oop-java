public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // Constructor Default
    Person() {

    }

    // Constructor dengan satu parameter
    Person(String paramName) {
        name = paramName;
    }

    // Constructor Dengan Parameter
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Method void
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name + ".");
    }

    // Method return value (mengembalikan nilai)
    String sayAddress() {
        return "I, come from " + address + ".";
    }
}