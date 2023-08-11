import java.util.Arrays;
import java.util.Scanner;
public class MaximumGap {
    public static void main(String[] args){
        Scanner pk=new Scanner(System.in);
        System.out.print("Enter length of the array : ");
        int size=pk.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter elements in the array : ");
        for (int i=0;i<size;i++){
            arr[i]=pk.nextInt();
        }
        Arrays.sort(arr);
        int ans=maximumGap(arr);
        System.out.print("Maximum Gap is : "+ans);
    }
    static int maximumGap(int[] arr){
        int n=arr.length;
        int diff1=0;
        int diff2=0;

            for (int i=1;i<n;i++){
                diff1=arr[i]-arr[i-1];
                diff2=Math.max(diff2,diff1);
            }
        return diff2;
    }

}
