import java.util.Scanner;

public class BestTimeToBuySellStock2 {
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
        int ans=maxProfit(arr);
        System.out.print("Ans : "+ans);
    }
    static int maxProfit(int[] arr_1){
        int n= arr_1.length;
        int store=0;
        for (int i=1;i<n;i++){
            int result=0;
            if (arr_1[i]>arr_1[i-1]){
                result=arr_1[i]-arr_1[i-1];
            }
            store+=result;
        }
        return store;
    }
}
