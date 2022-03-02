import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayLiterator {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many elements?");
        int n = sc.nextInt();
        ArrayList<String> L = new ArrayList<String>();
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter string:");
            String s = sc.next();
            L.add(s);
        }
        Iterator itr = L.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
