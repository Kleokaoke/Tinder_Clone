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

        String name = userInput("name");
        name = name.substring(0,1).toUpperCase() + name.substring(1);

        String surname = userInput("surname");
        surname = surname.substring(0,1).toUpperCase() + surname.substring(1);

        int age = Integer.parseInt(userInput("age"));

        String gender = userInput("gender");
        gender = gender.substring(0,1).toUpperCase();

        String location = userInput("location");
        location = location.substring(0,1).toUpperCase() + location.substring(1);

        String bio = userInput("bio");
        bio = bio.substring(0,1).toUpperCase() + bio.substring(1);

        Person me = new Person(name, surname, age, gender, location, bio);
        Image myImage1 = new Image("https://img-s-msn-com.akamaized.net/tenant/amp/entityid/BBXQyWJ.img?h=552&w=750&m=6&q=60&u=t&o=f&l=f&x=912&y=547", "Justin Timberlake on the red carpet", "Justin Timberlake", "Justin Timberlake black-suit");
        Image myImage2 = new Image("https://static.billboard.com/files/2020/03/justin-bieber-seasons-yt-2020-billboard-u-1548-1583525325.jpg", "Justin Bieber on the red carpet", "Justin Bieber", "Justin Bieber white-shirt");
        Image myImage3 = new Image("https://static.independent.co.uk/s3fs-public/thumbnails/image/2020/06/02/08/drake.jpg", "Drake on the red carpet", "Drake", "Drake brown-suit");
        Profile myProfile = new Profile(me, myImage1, myImage2, myImage3);

        System.out.println("\nYour Profile:\n" + myProfile + "\n");

        String choice = null;

        while (true) {
            System.out.print("Are you looking to meet a (M)ale, (F)emale, (N)o preference or would you like to (Q)uit: ");
            choice = sc.nextLine().toUpperCase();

            if (choice.equals("Q")) {
                break;
            } else {
                TinderSwipe TS = new TinderSwipe();
                Profile display = TS.assignUser(choice);
                System.out.println("\nProfile:\n" + display + "\n");

                System.out.println("Would you like to Swipe (R)ight, (L)eft, (U)p on " + display.getPerson().getName() +" or see the (N)ext image of " + display.getPerson().getName());
                System.out.println("'R' means you're interested.\n'L' means you're not as interested.\n'U' means you're highly interested.");
                String option = sc.nextLine().toUpperCase();

                while (true) {
                    if (option.equals("N")) {
                        System.out.println("\nNext Image:");
                        System.out.println(display.nextImage());
                    } else {
                        TS.swipe(display, option);
                        if (option.equals("U")) {
                            System.out.println("\n" + me.getName() + " you were Highly Interested in " + display.getPerson().getName() + "\n");
                        } else if (option.equals("R")) {
                            System.out.println("\n" + me.getName() + " you were Interested in " + display.getPerson().getName() + "\n");
                        } else {
                            System.out.println("\n" + me.getName() + " you were Not Interested in " + display.getPerson().getName() + "\n");
                        }
                        break ;
                    }
                    System.out.println("Would you like to Swipe (R)ight, (L)eft, (U)p or (N)ext image on " + display.getPerson().getName());
                    System.out.println("'R' means you're interested.\n'L' means you're not as interested.\n'U' means you're highly interested.");
                    option = sc.nextLine().toUpperCase();
                }
            }
        }

        System.out.println("\nThank you for using Bootleg-Tinder " + me.getName());
    }

    private static String userInput(String input) {
        System.out.print("Please enter your " + input + ": ");
        String givenInput = sc.nextLine();
        if (input.equals("age")) {
            String regex = "\\d+";
            while (true) {
                if (!givenInput.trim().isEmpty() && givenInput.trim().matches(regex)) {
                    break;
                }
                System.out.print("Invalid input. Please enter your " + input + ": ");
                givenInput = sc.nextLine();
            }
        } else {
            while (true) {
                if (!givenInput.trim().isEmpty()) {
                    break;
                }
                System.out.print("Invalid input. Please enter your " + input + ": ");
                givenInput = sc.nextLine();
            }
        }
        return givenInput;
    }
}
