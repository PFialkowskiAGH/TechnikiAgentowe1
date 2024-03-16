import java.util.Scanner;

public class zadanie2 {
    public static void run(){
        int random = (int)(Math.random()*100);
        //System.out.println(random);
        int numberOfTry = 0;
        int selectedNumber = 101;

        while (selectedNumber != random)
        {
            System.out.println("Zgadnij liczbę od 1 do 100");
            // Create Scanner object
            Scanner s = new Scanner(System.in);

            // Read the next integer from the screen
            selectedNumber = s.nextInt();
            numberOfTry++;
        }

        System.out.println("Udało ci się za: " + numberOfTry + " razem");
    }
}
