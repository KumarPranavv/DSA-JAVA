import java.util.Scanner;

public class CharPattern2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            char ch=(char)('A'+i-1);

            for(int j=1;j<=n;j++){

                System.out.print(ch);
                ch=(char)(ch+1);
            }
            System.out.println();
        }
    }
}