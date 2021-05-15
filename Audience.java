class Audience extends Main
{
    public  static void vote(char answr)
    {
            int a=0,b=0,c=0,d=0; 
            if(answr=='A')
            {
                b=(int)(Math.random()*24);
                c=(int)(Math.random()*24);
                d=(int)(Math.random()*24);
                a=100-b-c-d;
            }
            else if(answr=='B')
            {
                a=(int)(Math.random()*24);
                c=(int)(Math.random()*24);
                d=(int)(Math.random()*24);
                b=100-a-c-d;
            }
            else if(answr=='C')
            {
                b=(int)(Math.random()*24);
                a=(int)(Math.random()*24);
                d=(int)(Math.random()*24);
                c=100-b-a-d;
            }
            else if(answr=='D')
            {
                b=(int)(Math.random()*24);
                c=(int)(Math.random()*24);
                a=(int)(Math.random()*24);
                d=100-b-c-a;
            }
            
                System.out.println("A: "+a+"%");
                System.out.println("B: "+b+"%");
                System.out.println("C: "+c+"%");
                System.out.println("D: "+d+"%");
                ll[0]="";
                ans=answer.accept();
    } 
}