public class Main {

    public static void main(String[] args) {
        Node head=new Node(10);
        Node head_1=new Node(20);
         Node head_2=new Node(30);
          Node head_3=new Node(40);
          
          head.next=node_1;
          node_1next=node_2;
          node_.next=node_3;
          
          Node temp=head;
          while(temp !=null){
        System.out.println(temp.data + " ");
    }
  }
}
class node{
    int data;
    Node next;
    
    Node(int data) {
    this.data=data;
    this.next=null;
  }
}