
import java.util.Scanner;

public class TemplessSwap {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 strings:");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println("Pre-Swap:");
        System.out.println("1: " + s1);
        System.out.println("2: " + s2);

        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());

        System.out.println("Post-Swap:");
        System.out.println("1: " + s1);
        System.out.println("2: " + s2);
    }
}
