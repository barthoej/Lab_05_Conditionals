import java.util.Scanner;
public class PA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String partyAffiliation = "";
        String trash;
        boolean done = false;

        partyAffiliation = partyAffiliation.toUpperCase();
        switch (partyAffiliation) {
            case "D":
                System.out.println("You get a democratic donkey");
                break;
            case "R":
                System.out.println("You get a republican elephant");
                break;
            case "I":
                System.out.println("You get an independent person");
                break;
        }
    }
}