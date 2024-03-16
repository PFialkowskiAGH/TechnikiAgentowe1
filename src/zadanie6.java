import java.util.Scanner;

public class zadanie6 {
    public static void run()
    {
        System.out.println("Podaj liczbę");
        Scanner s = new Scanner(System.in);
        int inputNumber = s.nextInt();

        boolean primeNumber = true;
        for (int i=2; i < inputNumber; i++)
        {
            if (inputNumber % i == 0) primeNumber = false;
        }

        if (primeNumber) System.out.println("Liczba pierwsza");
        else System.out.println("Liczba nie jest pierwsza");
    }
}
