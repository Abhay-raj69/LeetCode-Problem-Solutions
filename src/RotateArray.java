import java.util.Scanner;

public class RotateArray {
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
        System.out.print("Enter the value of k : ");
        int k=pk.nextInt();
        System.out.println();
        System.out.print("Array before rotation : ");
        print(arr);
        System.out.println();;
        rotateArr(arr,k);
        System.out.print("Array after rotation : ");
        print(arr);
    }
    static void rotateArr(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        int[] ans=new int[n];
        int m=0;
        for (int i=n-k;i<n;i++){
            ans[m++]=arr[i];
        }
        for (int i=0;i<n-k;i++){
            ans[m++]=arr[i];
        }

      for (int i=0;i<n;i++){
          arr[i]=ans[i];
      }
    }
    static void print(int[] arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
