public class RemoveDuplicates{
    public static String remove(String s){
        int n=s.length();
        if(n==0){
            return s;
        }
        String ans="";
        int startIndex=0;
        while(startIndex<n){
            char uniqueChar=s.charAt(startIndex);
            int nextUniq=startIndex+1;
            while(nextUniq<n && s.charAt(nextUniq)==uniqueChar){
                nextUniq+=1;

            }
            ans+=uniqueChar;
            startIndex=nextUniq;
        }
        return ans;


    }
    public static void main(String[] args){
        String s="xxyyxxxyyzzzyyyaaaabbaa";
        System.out.println(remove(s));
    }
}