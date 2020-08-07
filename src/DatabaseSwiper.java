import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DatabaseSwiper {

    DatabaseSwiper() { }

    public void addSwipe(Profile user,String option) {
        String content = "\n" + user.getPerson().getName() + ", " + user.getPerson().getSurname() + ", " + user.getPerson().getAge() + ", " + user.getPerson().getGender() + ", " + user.getPerson().getLocation() + ", " + option;

        try (FileWriter writer = new FileWriter("swipes.csv", true);
             BufferedWriter bw = new BufferedWriter(writer)) {

            bw.write(content);

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}
