public class PrintIth{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public int GetNth(Node head, int index) {
        // Code here
        int pos=1;
        Node temp=head;
        while(temp != null && pos<index){
            
            pos++;
            temp=temp.next;
        }
        if(temp!=null){
            return temp.data;
        }else{
            return -1;
        }
    }

    public static void main(String[] args){
        
    }
}
