public class addLast {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addLast(String data){
        Node newNode = new Node(data);
      //  Node currentNode = null;
        if(head==null){
            head=newNode;
            return;
        }

        Node currentNode=head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void print(){
         Node currentNode=head;
         while(currentNode!=null){
             System.out.print(currentNode.data+"-->");
             currentNode=currentNode.next;
         }
        System.out.print("null");
    }

    public static void main(String[] args) {
        addLast list1 = new addLast();
        list1.addLast("this");
        list1.addLast("is");
        list1.addLast("a");
        list1.addLast("list");
        list1.print();
    }
}
