import java.util.Scanner;

public class FreqCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int fr[] = new int[n];
        int visited = -1;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;

                    fr[j] = visited;
                }
            }
            if (fr[i] != visited)
                fr[i] = count;
        }
        System.out.println("Element counts are:");
        for(int p = 0; p < n; p++)
        {
            if(fr[p] != -1)
                System.out.println(arr[p] + ": " + fr[p]);
        }
    }
}
