public class PolymorphismApp {
    public static void main(String[] args) {


        Employee employee = new Employee("Bdill");
        employee.sayHello("Yo");

        employee = new Manager("A");
        employee.sayHello("D");

        employee = new VicePresident("B");
        employee.sayHello("C");

        sayHello(new Employee("Aa"));
        sayHello(new Employee("BB"));
        sayHello(new Employee("Cc"));

    }
//method polymorphism ato yg bener
    static void sayHello(Employee employee){
        System.out.println("Hello" + employee.name);
    }
}
