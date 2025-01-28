
public class Words {
    public static void countWords(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                c++;
            }
        }
        int ans=c+1;
        System.out.println("The number of words: "+ ans);
    }
    public static void main(String[] args) {
        String str="Jai Baba Ki";
        countWords(str);

    }
}
