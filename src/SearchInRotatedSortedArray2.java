import java.util.Scanner;
public class SearchInRotatedSortedArray2 {
    public static void main(String[] args){
        Scanner pk=new Scanner(System.in);
        System.out.print("Enter length of the array : ");
        int length=pk.nextInt();
        int[] arr=new int[length];
        System.out.print("Enter elements in the array : ");
        for (int i=0;i<length;i++){
            arr[i]=pk.nextInt();
        }
        System.out.println();
        System.out.print("Enter the target : ");
        int target=pk.nextInt();
        boolean ans=search(arr,target);
        System.out.print("Target found : "+ans);
    }
    static boolean search(int[] nums,int target){
        boolean ans=searchIndex(nums,target,0);
        if (ans){
            return true;
        }
        else{
            return false;
        }
    }
    static boolean searchIndex(int[] nums,int target,int idx){
        int n=nums.length;
        if (idx>=n){
            return false;
        }
        if (nums[idx]==target){
            return true;
        }
        return searchIndex(nums,target,idx+1);
    }
}
