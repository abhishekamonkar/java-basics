import java.util.Scanner;

interface multiplier
{
    double product(double a, double b);
    void printProduct(double a, double b);
}

class implementer implements multiplier
{
    public double product(double a, double b)
    {
        return a * b;
    }
    public void printProduct(double a, double b)
    {
        System.out.println(a*b);
    }
}
public class interfaceImp {

    public static void main(String[] args){
        implementer i = new implementer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 values:");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        double val = i.product(a, b);
        System.out.println(val);
        i.printProduct(a, b);

    }

}
