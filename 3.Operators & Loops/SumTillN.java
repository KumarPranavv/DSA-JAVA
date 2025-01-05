import java.util.Scanner;

public class SumTillN{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the N: ");
        int n=sc.nextInt();
        // Using while loop
/*        int i=1;
        int sum=0;
        while(i<=n){
            sum=sum+i;
            i=i+1;
        }
        System.out.println(sum);
*/
        // USing for Loop
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;

        }
        System.out.println(sum);
    }
}