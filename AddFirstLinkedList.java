import java.util.LinkedList;

public class AddFirst {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = next;
        }
    }
    public void addFirst(String data){
       Node newNode = new Node(data);
       if(head==null){
           head = newNode;
           return;
       }
       newNode.next=head;
       head=newNode;
    }
    public void print(){
        Node currentnode = head;
        while(currentnode!=null){
            System.out.print(currentnode.data+"-->");
            currentnode = currentnode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        AddFirst list = new AddFirst();
        list.addFirst("a");
        list.addFirst("is");
  //      System.out.println(list);
        list.addFirst("this");
    //    System.out.println(list);

        list.print();
    }
}
