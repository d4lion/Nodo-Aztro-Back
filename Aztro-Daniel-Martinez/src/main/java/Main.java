import Models.Test;

public class Main {
    public static void main(String... args) {
        Test persona = new Test("D4lion", 18);
        System.out.println("Name: " + persona.getName());
        System.out.println("Age: " + persona.getAge());
    }
}
