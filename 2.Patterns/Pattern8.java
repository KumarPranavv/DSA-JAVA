import java.util.Scanner;

public class Pattern8{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int Sn=i; //Starting Number
            for(int j=1;j<=i;j++){
                
                System.out.print(Sn);
                Sn--;
            }
            System.out.println();
        }
    }
}