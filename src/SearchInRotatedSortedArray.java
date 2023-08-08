public class SearchInRotatedSortedArray {
    public static void main(String[] args){
        int[] nums={1};
        int target=0;
        int ans=search(nums,target,0);
        System.out.println(ans);
    }
    /*

    Using For-loop
    static int search(int[] nums,int target){
        int n=nums.length;
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                if (nums[j]==target){
                    return j;
                }


            }
        }
        return -1;
    }
    */
    static int search(int[] nums,int target,int idx){
        int n=nums.length;
        if (idx>=n){
            return -1;
        }
        if (nums[idx]==target){
            return idx;
        }
         return search(nums,target,idx+1);
    }
}
