import java.math.BigInteger;
import java.util.Scanner;

public class StringMultiply {
    public static void main(String[] args){
        Scanner pk=new Scanner(System.in);
        System.out.print("Enter 1st number in String form : ");
        String num1=pk.next();
        System.out.print("Enter 2nd number in String form : ");
        String num2=pk.next();
        String ans=multiply(num1,num2);
        System.out.println(ans);

    }
    static String multiply(String num1,String num2){
        int ans1=multiplyString1(num1);
        int ans2=multiplyString2(num2);
        long finAns= (long) ans1 *ans2;
        String str=finAns+"";
        BigInteger str1=new BigInteger(str);
        return str;
    }
    static int multiplyString1(String num1){
        if (num1.length()==1){
            return (int)num1.charAt(0)-'0';
        }
        int result=0;
        for (int i=0;i<num1.length();i++){
            result=result*10+num1.charAt(i)-'0';
        }
        return result;
    }
    static int multiplyString2(String num2){
        if (num2.length()==1){
            return (int)num2.charAt(0)-'0';
        }
        int result=0;
        for (int i=0;i<num2.length();i++){
            result=result*10+num2.charAt(i)-'0';
        }
        return result;
    }
}
