import java.io.*;
import java.util.*;

public class OnlyOneDigit{
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t=Integer.parseInt(br.readLine().trim());
        while(t-- >0){
            String x=br.readLine().trim();
            int minDigit=9;
            for(int i=0;i<x.length();i++){
                int d=x.charAt(i)-'0';
                if(d<minDigit){
                    minDigit=d;

                }
                if(minDigit==0){
                    break;
                }
            }
            out.append(minDigit).append('\n');


        }
        System.out.println(out.toString());
    }
    
}