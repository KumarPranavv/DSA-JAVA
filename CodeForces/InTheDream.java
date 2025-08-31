import java.io.*;
import java.util.*;

public class InTheDream{
    static boolean feasibleHalf(int x,int y){
        int hi=Math.max(x,y);
        int lo=Math.min(x,y);
        return hi<=2*lo+2;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder s=new StringBuilder();
        int t=Integer.parseInt(br.readLine().trim());
        while(t-- > 0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());
            int d=Integer.parseInt(st.nextToken());

            boolean nonDec=(c>=a && d>=b);
            boolean ok=nonDec && feasibleHalf(a,b) && feasibleHalf(c-a,d-b);
            s.append(ok ? "Yes\n" : "No\n");


            
        }
        System.out.print(s.toString());
    }
}