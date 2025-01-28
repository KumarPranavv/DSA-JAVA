
public class CountWords {
    public static void count(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                c++;
            }
        }
        System.out.println("The number of spaces: "+ c);
    }
    public static void main(String[] args) {
        String str="Hola Amigos, kaise ho theek ho";
        count(str);

    }
}