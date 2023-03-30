public class Binomial_coefficient {
    // int n = a;
    public static int factorial(int n) {
        int factorial = 1;

        for(int i = 1; i <= n; i++ ){
            factorial *= i;
        }
        return factorial;
    }

    public static int bc(int n, int r) {
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);

        return a / (b*c);
    }

    public static void main(String args[]) {
        
        System.out.println(bc(5,3));
       
    }
}
