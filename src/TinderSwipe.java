import java.util.Random;

public class TinderSwipe {

    // Fields:
    Profile profile;

    // Constructor:
    TinderSwipe() {

    };

    // Methods:
    public Profile assignUser(String choice) {
        Database DB = new Database();
        DB.getUsersArray();
        Profile[] profiles = DB.getArrayByGender(choice);

        Random ran = new Random();
        int randomIndex = ran.nextInt(profiles.length);

        profile = profiles[randomIndex];

        return profiles[randomIndex];
    }

    public void swipe(Profile user, String option) {
        DatabaseSwiper DBS = new DatabaseSwiper();
        if (option.equals("U")) {
            option = "Super Like";
        } else if (option.equals("R")) {
            option = "Right";
        } else {
            option = "Left";
        }
        DBS.addSwipe(user, option);
    }
}
