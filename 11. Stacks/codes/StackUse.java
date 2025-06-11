public class StackUse{
    public static class StackusingArray{
        private int data[];
        private int topIndex;
        public StackusingArray(){
            data =new int[10];
            topIndex=-1;
        }
        public int size(){
            return topIndex+1;
        }
        public void push(int ele){
            data[++topIndex]=ele;
        }
        public int top(){
            return data[topIndex];
        }
        public boolean isEmpty(){
            return topIndex==-1;
        }

    }
    public static void main(String[] args){
        StackusingArray stack = new StackusingArray();
        stack.push(20);
        stack.push(10);
        stack.push(30);
        stack.top();
        stack.isEmpty();
        stack.size();
    }
        

}