package DemoQA.data;

import com.github.javafaker.Faker;

public class PersonJavaFaker {
    private String firstName;
    private String lastName;
    private int age;

    public PersonJavaFaker() {
        Faker faker = new Faker();
        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.age = faker.number().numberBetween(18, 70);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
