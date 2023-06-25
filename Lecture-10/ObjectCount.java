class Person {
    private String name;
    private int age;
    static int count = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}

public class ObjectCount {
    public static void main(String[] args) {
        Person person1 = new Person("Abhay", 20);
        person1.introduce();

        Person person2 = new Person("Akash", 21);
        person2.introduce();

        System.out.println(Person.count);
    }
}
