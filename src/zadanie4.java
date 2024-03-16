import java.util.Scanner;

public class zadanie4 {
    public static void run()
    {
        System.out.println("Wpisz słowo:");
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();

        char ch;
        String reverseWord = "";

        for (int i=0; i<word.length(); i++)
        {
            ch= word.charAt(i);
            reverseWord= ch + reverseWord;
        }
        System.out.println("Odwrócone słowo: "+ reverseWord);

        if (word.equals(reverseWord))
        {
            System.out.println("Słowo jest palindronem");
        }
    }
}
