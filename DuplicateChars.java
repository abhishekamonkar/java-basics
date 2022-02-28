import java.util.Scanner;

public class DuplicateChars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String val = sc.nextLine();

        char vals[] = val.toCharArray();
        int c;
        for (int i = 0; i < vals.length; i++) {
            c = 1;
            for (int j = i + 1; j < vals.length; j++) {
                if (vals[i] == vals[j]) {
                    c++;

                vals[j] = '0';
            }
        }
        if (c > 1 && vals[i] != '0') {
            System.out.println(vals[i] + ": " + c);
        }
    }
    }
}


