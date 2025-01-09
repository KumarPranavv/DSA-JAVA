public class F2C{
    public static void printFarenheit(int start,int end, int step){
        int CurrentValue=start;
        while(CurrentValue<=end){
            double Fvalue=(5.0/9)*(CurrentValue-32);
            System.out.println(CurrentValue+"\t "+Fvalue);
            CurrentValue+=step;

        }
        
    }

}