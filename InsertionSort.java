import java.util.Scanner;

class insertionSort {

    public static void insertionsortfunc(int arr[], int n){
        for(int a = 1; a < n; a++)
        {
            int val = arr[a];
            int b = a - 1;
            while((b > -1) && (arr[b] > val))
            {
                arr[b+1] = arr[b];
                b--;
            }
            arr[b+1] = val;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length:");
        int n;
        n = sc.nextInt();
        System.out.println("Enter Elements:");
        int[] array = new int[n];
        for(int c = 0; c < n; c++)
        {
            array[c] = sc.nextInt();
        }

        System.out.println("After sort:");
        insertionsortfunc(array, n);

        for(int l:array)
        {
            System.out.println(l);
        }
    }
}