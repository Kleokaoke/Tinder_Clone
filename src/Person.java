public class Person {

    // Fields:
    String name;
    String surname;
    int age;
    String gender;
    String location;
    String bio;

    // Constructor:
    Person(String name, String surname, int age, String gender, String location, String bio) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.location = location;
        this.bio = bio;
    }

    // Methods:
    @Override
    public String toString() {
        return name + ", " + age + ", " + gender + '\n' +
                location + '\n' +
                bio;
    }

    // Getters:
    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public String getBio() {
        return bio;
    }

    // Setters:
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}