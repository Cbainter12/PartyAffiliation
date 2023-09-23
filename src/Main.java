import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String party = "";

        System.out.println("Enter your party affiliation [R D I]: ");
        party = in.nextLine();

        if (party.equals("R"))
        {
            System.out.println("You get a Republican Elephant.");
        }
        else if (party.equals("D"))
        {
            System.out.println("You get a Democratic Donkey.");
        }
        else if (party.equals("I"))
        {
            System.out.println("You get an Independent Man.");
        }
        else
        {
            System.out.println("You chose other.");
        }
    }
}
