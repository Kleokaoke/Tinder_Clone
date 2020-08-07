import java.util.Scanner;

public class TinderApp {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("      )             (\n" +
                "  )  /( (           )\\ )   (   (\n" +
                " ( )( )))\\   (     (()/(  ))\\  )(\n" +
                "(_(_())((_)  )\\ )   ((_))/((_)(()\\\n" +
                "|_   _| (_) _(_/(   _| |(_))   ((_)\n" +
                "  | |   | || ' \\))/ _` |/ -_) | '_|\n" +
                "  |_|   |_||_||_| \\__,_|\\___| |_|\n");

        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        name = name.substring(0,1).toUpperCase() + name.substring(1);

        System.out.print("Please enter your surname: ");
        String surname = sc.nextLine();
        surname = surname.substring(0,1).toUpperCase() + surname.substring(1);

        System.out.print("Please enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Please enter your gender: ");
        String gender = sc.nextLine().toUpperCase();

        System.out.print("Please enter your location: ");
        String location = sc.nextLine();
        location = location.substring(0,1).toUpperCase() + location.substring(1);

        System.out.print("Please enter your bio: ");
        String bio = sc.nextLine();
        bio = bio.substring(0,1).toUpperCase() + bio.substring(1);

        Person me = new Person(name, surname, age, gender, location, bio);
        Image myImage1 = new Image("https://img-s-msn-com.akamaized.net/tenant/amp/entityid/BBXQyWJ.img?h=552&w=750&m=6&q=60&u=t&o=f&l=f&x=912&y=547", "Justin Timberlake on the red carpet", "Justin Timberlake", "Justin Timberlake black-suit");
        Image myImage2 = new Image("https://static.billboard.com/files/2020/03/justin-bieber-seasons-yt-2020-billboard-u-1548-1583525325.jpg", "Justin Bieber on the red carpet", "Justin Bieber", "Justin Bieber white-shirt");
        Image myImage3 = new Image("https://static.independent.co.uk/s3fs-public/thumbnails/image/2020/06/02/08/drake.jpg", "Drake on the red carpet", "Drake", "Drake brown-suit");
        Profile myProfile = new Profile(me, myImage1, myImage2, myImage3);

        System.out.println("\nYour Profile:\n" + myProfile + "\n");

        String choice = null;

        while (true) {
            System.out.println("Are you looking to meet (M)ale, (F)emale, (N)o preference or would you like to (Q)uit:");
            choice = sc.nextLine().toUpperCase();

            if (choice.equals("Q")) {
                break;
            } else {
                TinderSwipe TS = new TinderSwipe();
                Profile display = TS.assignUser(choice);
                System.out.println("\nProfile:\n" + display + "\n");

                System.out.println("Would you like to Swipe (R)ight, (L)eft, (U)p or (N)ext image on " + display.getPerson().getName());
                System.out.println("'R' means you're interested.\n'L' means you're not as interested.\n'U' means you're highly interested.");
                String option = sc.nextLine().toUpperCase();

                while (true) {
                    if (option.equals("N")) {
                        System.out.println("Next Image:");
                        System.out.println(display.nextImage());
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
