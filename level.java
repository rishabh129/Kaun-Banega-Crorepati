class level extends Main
{
    static void show()
    {
        System.out.println("The levels are:");
        int a=15;
        for(int i=levels.length-1;i>=0;i--)
        {
            System.out.println(a--+"-"+levels[i]);
        }
        System.out.println("\n\nIf you give wrong answer before level 4 you will win nothing");
        System.out.println("\nIf you give wrong answer after  level 4 but before level 8 you will win 10000rs");
        System.out.println("\nIf you give wrong answer after  level  8 you will win ammount corresponding to previous level");
        System.out.println("\nEnter your answer in Uppercase only.");
        System.out.println("\nYou have following 4 life-lines to help you.");
        for(int i=0;i<4;i++)
        System.out.println(ll[i]);
        System.out.println("\nYou can use only one Life-line for 1 question.");
        System.out.println("Enter L for lifeline.");
    }
}