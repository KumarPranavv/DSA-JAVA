public class SubString{
    public static void print(String s){
        int n=s.length();
        for(int i=0;i<n;++i){
            for(int j=i+1;j<=n;j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
    public static void main(String[] args){
        String str="abcdef";
        print(str);
    }
}