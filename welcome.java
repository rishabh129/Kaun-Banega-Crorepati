import java.util.Scanner;
class welcome extends Main
{
    static void display()
    {
        System.out.println("Welcome "+name);
        System.out.println("lets play");
    }
    static void rules()
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter R for rules");
        rule=sc.next().charAt(0);
    }
     static void begin()
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Do you want to begin? Y/N");
        rule=sc.next().charAt(0);

        if(rule=='Y' || rule=='y')
        {
            System.out.println("Lets begin");
        }
        else
        {
            System.out.println("Thank you for visiting");
            System.exit(0);
        }
        System.out.println("\f"); 
    }
}
    