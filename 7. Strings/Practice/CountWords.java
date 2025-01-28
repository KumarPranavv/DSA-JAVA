import java.util.Scanner;
public class CountWords {
    public static int count(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        String str="Hola Amigos, kaise ho theek ho";
        System.out.println(count(str));

    }
}