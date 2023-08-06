import java.util.Scanner;

public class DivideTwoIntegers {
    public static void main(String[] args){
        Scanner pk=new Scanner(System.in);
        System.out.print("Enter dividend : ");
        int dividend=pk.nextInt();
        System.out.print("Enter Divisor : ");
        int divisor=pk.nextInt();
        int ans=dividingWithoutDivide(dividend,divisor);
        System.out.print("Ans is : "+ans);
    }
    static int dividingWithoutDivide(int dividend,int divisor){
        if (dividend==0){
            return 0;
        }
        int result=0;
        boolean sign= (dividend >= 0) == (divisor >= 0)? true:false;
        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);
        while (dividend-divisor>=0){
            int count=0;
            while (dividend-(divisor<<1<<count)>=0){
                count++;
            }
            result+=1<<count;
            dividend-=divisor<<count;
        }
    return (sign)? result:-(result);
    }
}
