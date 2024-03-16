import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class zadanie3 {
    public static void run() {
        int[] array = new int[11];
        for (int i = 0; i < 11; i++)
        {
            array[i] = (int)(Math.random()*100);
        }
        System.out.println("Tablica:");
        for (int i = 0; i < 11; i++)
        {
            System.out.println(array[i]);
        }
        Arrays.sort(array);

        System.out.println("Największa: " + array[10]);
        System.out.println("Druga największa: " + array[9]);
    }
}
