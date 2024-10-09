package Models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Test {
    String name;
    int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
