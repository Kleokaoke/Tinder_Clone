import java.util.Scanner;

public class TinderApp {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        System.out.println("Tinder");
//
//        System.out.println("Please enter your name");
//        String name = sc.nextLine();
//
//        System.out.println("Please enter your age");
//        int age = sc.nextInt();
//        sc.nextLine();
//
//        System.out.println("Please enter your gender");
//        String gender = sc.nextLine();
//
//        System.out.println("Please enter your location");
//        String location = sc.nextLine();
//
//        System.out.println("Please enter your bio");
//        String bio = sc.nextLine();
//
//        Person me = new Person(name, age, gender, location, bio);
//        Image myImage1 = new Image("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.facebook.com%2FZooccilyrics%2F&psig=AOvVaw0iTuvd6yXcdUjDxx40GsnN&ust=1596807533594000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJCP7-LZhusCFQAAAAAdAAAAABAD", "Zooci animation", "Zooci coke dope DP", "Anxiety album black-shirt");
//        Image myImage2 = new Image("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.facebook.com%2FZooccilyrics%2F&psig=AOvVaw0iTuvd6yXcdUjDxx40GsnN&ust=1596807533594000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJCP7-LZhusCFQAAAAAdAAAAABAD", "Zooci animation", "Zooci coke dope DP", "Anxiety album black-shirt");
//        Image myImage3 = new Image("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.facebook.com%2FZooccilyrics%2F&psig=AOvVaw0iTuvd6yXcdUjDxx40GsnN&ust=1596807533594000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJCP7-LZhusCFQAAAAAdAAAAABAD", "Zooci animation", "Zooci coke dope DP", "Anxiety album black-shirt");
//        Profile myProfile = new Profile(me, myImage1, myImage2, myImage3);
//
//        System.out.println(myProfile);

        String choice = null;

        while (true) {
            System.out.println("Are you looking to meet (M)ale, (F)emale, (N)o preference or would you like to (Q)uit:");
            choice = sc.nextLine().toUpperCase();

            if (choice.equals("Q")) {
                break;
            } else {
                TinderSwipe TS = new TinderSwipe();
                Profile display = TS.assignUser(choice);
                System.out.println(display);

                System.out.println("Would you like to Swipe (R)ight, (L)eft, (U)p or (N)ext image on " + display.getPerson().getName());
                System.out.println("'R' means you're interested.\n 'L' means you're not as interested.\n 'U' means you're highly interested.")
                String option = sc.nextLine().toUpperCase();

                while (true) {
                    if (option.equals("N")) {
                        System.out.println("Next Image:");
                        System.out.println(display.nextImage());;
                    } else {
                        TS.swipe(display, option);
                        if (option.equals("U")) {
                            System.out.println("You are Highly Interested in " + display.getPerson().getName());
                        } else if (option.equals("R")) {
                            System.out.println("You are Interested in " + display.getPerson().getName());
                        } else {
                            System.out.println("You are Not Interested in " + display.getPerson().getName());
                        }
                        break ;
                    }
                    System.out.println("Would you like to Swipe (R)ight, (L)eft, (U)p or (N)ext image on " + display.getPerson().getName());
                    option = sc.nextLine().toUpperCase();
                }
            }
        }
    }
}
