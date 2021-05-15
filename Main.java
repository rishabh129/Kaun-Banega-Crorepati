import java.util.Scanner;

class Main {
    static String name;
    static int lev;
    static char ans, rule;
    static boolean flag = false;
    static int levels[] = {1000, 2000, 5000, 10000, 20000, 40000, 80000, 160000, 320000, 640000, 1250000, 2500000, 5000000, 10000000, 70000000};
    static String ll[] = {"1.Audience Vote", "2.Double Dip.", "3.Expert Advice", "4.Phone of Friend"};
    static int l = 0;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        details.accept();
        welcome.display();
        welcome.rules();
        if (rule == 'R')
            level.show();
        welcome.begin();
        Questions.run();
    }
}
