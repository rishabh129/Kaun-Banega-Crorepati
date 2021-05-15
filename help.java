class help extends Main
{
    public static void check(char ans,char correct)
    {
        if (ans=='L')
        {
        Lifeline.show();
        if(l==1)
        Audience.vote(correct);
        else if(l==2)
        Double.dip(correct);
        else if(l==3)
        Expert.advice(correct);
        else if(l==4)
        Phone.friend(correct);
        }
    }
} 