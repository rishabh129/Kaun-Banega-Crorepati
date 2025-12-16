import java.util.Scanner;
class answer extends Main
{
     static char choice;
     static char next;
     static char accept()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your choice");
         choice=sc.next().charAt(0);
         return(choice);
        }
        static boolean check( char choice,char correct,int l)
        {
            Scanner sc=new Scanner(System.in);
            if (choice==correct)
            {
               System.out.println(" Your answer is correct");
               System.out.println(" you have won:"+levels[l]);
               do{
                System.out.println("Do you want to continue? Y/N");
                next=sc.next().charAt(0);
                }while((next!='Y')&&(next!='N'));

               if(next=='N')
                return false;
            else if(next=='Y')
               return(true);
            }
            
               System.out.println("Your answer is  not correct");
               System.out.println("The correct answer is : "+ correct);
               if(l<4)
               System.out.println("Sorry you did not win anything..!!");
               else if((l>=4)&&(l<8))
               System.out.println(" You have won:"+levels[3]);
               else
               System.out.println(" You have won:"+levels[l-1]);
               return(false);
            
        }
    }


               
         