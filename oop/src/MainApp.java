public class MainApp {
    public static void main(String[] args) {
        // membuat object dari class Person menggunakan Constructor Parameter
        Person person1 = new Person("Reza", "Tangerang");
        person1.sayHello("Ummu");
        System.out.println(person1.sayAddress());

        // membuat object dari class Person menggunakan Constructor Default
        Person person2 = new Person();
        person2.name = "Ardiansyah";
        person2.address = "Tangerang";
        person2.sayHello("Saadah");
        System.out.println(person2.sayAddress());

        // membuat object dari class Person menggunakan Constructor Satu Parameter
        Person person3 = new Person("Umyu");
        person3.address = "Semarang";
        person3.sayHello("Reza");
        System.out.println(person3.sayAddress());
    }
}
