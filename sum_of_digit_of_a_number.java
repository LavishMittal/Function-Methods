public class sum_of_digit_of_a_number {
    public static int sum_of_digit(){
    int sum = 0;
    int n = 1234512;

    while(n>0){
        int r = n%10;
        sum += r;
        n/=10; 
    }
    return sum;
}

    public static void main(String args[]) {
        System.out.println(sum_of_digit());
    }
}
