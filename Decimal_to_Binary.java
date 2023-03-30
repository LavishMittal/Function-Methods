public class Decimal_to_Binary {
    public static void Dec_to_Bin(int n){
        int pow = 0;
        int BinNum = 0;

        while(n>0){
            int rem = n%2;
            BinNum = BinNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n /= 2;
        }
        System.out.println(BinNum);
    }

    public static void main(String args[]){
        Dec_to_Bin(5);
    }
}
