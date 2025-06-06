public class PrintIth{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void print(Node head, int i){
        int pos=0;
        Node temp=head;
        while(temp!=null){
            if(pos==i){

            }
            pos++;
            temp=temp.next;

        }


    }
    public static void main(String[] args){
        
    }
}
