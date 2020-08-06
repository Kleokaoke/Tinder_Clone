public class Person {

    // Fields:
    String name;
    int age;
    String gender;
    String location;
    String bio;

    // Constructor:
    Person(String name, int age, String gender, String location, String bio) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.location = location;
        this.bio = bio;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", location='" + location + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }
}