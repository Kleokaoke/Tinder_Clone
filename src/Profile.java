import java.util.Arrays;

public class Profile {

    // Fields:
    Person person;
    Image[] images = new Image[3];

    // Constructor:
    Profile(Person person, Image image1, Image image2, Image image3) {
        this.person = person;
        images[0] = image1;
        images[1] = image2;
        images[2] = image3;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "person=" + person +
                ", images=" + Arrays.toString(images) +
                '}';
    }
}
