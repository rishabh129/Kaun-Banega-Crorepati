class Phone extends Main
{
    public static void friend(char correct)
    {
        switch((int)((Math.random()*4)+1))
        {
            case 1:
            System.out.println("Your friend says.. the correct answer is: "+correct);
            break;
            case 2:
            System.out.println("Your friend says..he does not know the correct answer.");
            break;
            case 3:
            if(correct=='A')
            System.out.println("Your friend says..he is confused between A and C.");
            else if(correct=='B')
            System.out.println("Your friend says..he is confused between A and B.");
            else if(correct=='C')
            System.out.println("Your friend says..he is confused between B and C.");
            else if(correct=='D')
            System.out.println("Your friend says..he is confused between D and C.");
            break;
            case 4:
            System.out.println("Sorry time up.. your friend could not give the answer in the given time.");
            break;
        }
        ll[3]="";
        ans=answer.accept();
    }
}
            