public class zadanie1 {
    public static void run()
    {
        System.out.println(0);
        int choice;
        for(int i=1; i <= 100; i++)
        {
            choice = 0;
            if(i % 3 == 0 && i % 5 == 0) choice = 3;
            else if(i % 3 == 0) choice = 1;
            else if(i % 5 == 0) choice = 2;

            switch (choice){
                case 0:
                    System.out.println(i);
                    break;
                case 1:
                    System.out.println("xxx");
                    break;
                case 2:
                    System.out.println("yyy");
                    break;
                case 3:
                    System.out.println("xyxy");
                    break;
            }
        }
    }
}
