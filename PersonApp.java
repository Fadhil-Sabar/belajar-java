public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Fadhil", "Bintaro");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Fadhil");

        Person person2 = new Person("Adlin");

        Person person3 = new Person();
        person3.name = "Nd";
        person3.sayHello("Cc");




    }
}
