import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner pk=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num=pk.nextInt();
        boolean answer=isPalindrome(num);
        System.out.println(answer);
    }
    static boolean isPalindrome(int x){
        if (x<0){
            return false;
        }
        int ans=reverse(x);
        if (ans==x){
            return true;
        }
        else{
            return false;
        }
    }
    static int reverse(int n){
        int rev=0,rem;
        while (n>0){
            rem=n%10;
            rev=(rev*10)+rem;
            n/=10;
        }
        return rev;
    }
}
