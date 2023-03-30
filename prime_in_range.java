import java.util.Scanner;

public class prime_in_range {
    public static boolean isprime(int n){
        boolean isprime = true;
        if (n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if (n%i == 0){
               isprime = false;
               break;
            }
        }
        return isprime;
    }

    public static void Prime_in_range(int n){
        for (int i = 2; i<=n-1; i++){
            if (isprime(i)){
                System.out.println(" " + i);
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        Prime_in_range(100);
    }
}
