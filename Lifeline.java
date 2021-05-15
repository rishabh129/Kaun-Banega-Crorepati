import java.util.*;
class Lifeline extends Main
{
    public static void show()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("You have the following Life-lines:");
        for(int i=0;i<4;i++)
        System.out.println(ll[i]);
        System.out.println("Enter number for life line.");
         l=sc.nextInt();
    }    
}

    