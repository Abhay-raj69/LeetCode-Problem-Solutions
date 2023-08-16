import java.util.Scanner;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args){
        Scanner pk=new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size=pk.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter elements in the array : ");
        for (int i=0;i<size;i++){
            arr[i]=pk.nextInt();
        }
        System.out.println();
        int ans=bestTimeToBuy(arr);
        System.out.print("Max Profit is : "+ans);
    }
static int  bestTimeToBuy(int[] arr){
    int n=arr.length;
    int result1=0;
    int result2=0;
    int val=Integer.MAX_VALUE;
    for (int i=0;i<n;i++){
        if (arr[i]<val){
            val=arr[i];
        }
        result1=arr[i]-val;
        if (result2<result1){
            result2=result1;
        }
    }
    return result2;
}
}
