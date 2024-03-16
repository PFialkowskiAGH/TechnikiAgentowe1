import java.util.Scanner;

public class zadanie5 {
    public static void run()
    {
        System.out.println("Wpisz zdanie:");
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();

        //System.out.println(sentence);

        String words[] = sentence.split(" ");

        for (int i=0; i < words.length; i++)
        {
            System.out.println(words[i]);
            int numberOfWord = 0;
            for (int j=0; j < words.length; j++)
            {
                if(words[i].equals(words[j]))
                {
                    numberOfWord++;
                }
            }
            System.out.println(numberOfWord);
        }
    }
}
