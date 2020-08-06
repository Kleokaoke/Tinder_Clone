import java.util.Scanner;

public class TinderApp {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Tinder");

        System.out.println("Please enter your name");
        String name = sc.nextLine();

        System.out.println("Please enter your age");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Please enter your gender");
        String gender = sc.nextLine();

        System.out.println("Please enter your location");
        String location = sc.nextLine();

        System.out.println("Please enter your bio");
        String bio = sc.nextLine();

        Person me = new Person(name, age, gender, location, bio);
        Image myImage1 = new Image("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.facebook.com%2FZooccilyrics%2F&psig=AOvVaw0iTuvd6yXcdUjDxx40GsnN&ust=1596807533594000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJCP7-LZhusCFQAAAAAdAAAAABAD", "Zooci animation", "Zooci coke dope DP", "Anxiety album black-shirt");
        Image myImage2 = new Image("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.facebook.com%2FZooccilyrics%2F&psig=AOvVaw0iTuvd6yXcdUjDxx40GsnN&ust=1596807533594000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJCP7-LZhusCFQAAAAAdAAAAABAD", "Zooci animation", "Zooci coke dope DP", "Anxiety album black-shirt");
        Image myImage3 = new Image("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.facebook.com%2FZooccilyrics%2F&psig=AOvVaw0iTuvd6yXcdUjDxx40GsnN&ust=1596807533594000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJCP7-LZhusCFQAAAAAdAAAAABAD", "Zooci animation", "Zooci coke dope DP", "Anxiety album black-shirt");
        Profile myProfile = new Profile(me, myImage1, myImage2, myImage3);

        Database DB = new Database();
        DB.getUsersArray();
        Profile[] test = DB.getArrayByGender("M");
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }
}
