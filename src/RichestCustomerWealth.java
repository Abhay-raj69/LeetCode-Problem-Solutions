import java.util.Scanner;
public class RichestCustomerWealth {
    public static void main(String[] args){
        Scanner pk=new Scanner(System.in);
        System.out.print("Enter length of the row : ");
        int row=pk.nextInt();
        System.out.print("Enter length of the column : ");
        int column=pk.nextInt();
        int[][] accounts=new int[row][column];
        System.out.print("Enter elements in the array : ");
        for (int i=0;i<accounts.length;i++){
            for (int j=0;j<accounts[i].length;j++){
                accounts[i][j]=pk.nextInt();
            }
        }
        System.out.println();
        int ans=maximumWealth(accounts);
        System.out.print("Maximum Wealth is : "+ans);

    }
    static int maximumWealth(int[][] accounts){
        int sum1=0;
        for (int i=0;i<accounts.length;i++){
            int sum2=0;
            for (int j=0;j<accounts[i].length;j++){
                sum2+=accounts[i][j];
            }
            sum1=Math.max(sum1,sum2);
        }
        return sum1;
    }
}
