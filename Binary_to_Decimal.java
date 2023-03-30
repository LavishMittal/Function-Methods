public class Binary_to_Decimal {
    public static void BintoDec(int BinNum){
        int pow = 0;
        int DecNum = 0;
        
        while(BinNum>0){
            int LastDigit = BinNum % 10;
            DecNum = DecNum  + (LastDigit * (int) Math.pow(2,pow));
            pow++;
            BinNum /=10;
        }
        System.out.println("Decimal Number is " + DecNum);
    }

    public static void main(String args[]){
        BintoDec(101100);
    }
}
