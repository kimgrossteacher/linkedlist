public class LinkedListTest {

    private Node head;
    private Node tail;
    private Node current;
  
    LinkedListTest(){
          head=new Node(null, null,null);
          tail=head;
          }
 
     // adds a new node at the end of the linked list  Sets the new nodes previous to point to current tail, then changes tail to point to the new node
     //and the next on the old tail to point to the new node     
 
   public void addNode(Object data){
    Node current= new Node(data, null, null );
        if (head==null){ // if there are no nodes in the list, set this node to the head and tail.

            head=current; 
            tail=current;
            return;
        }
          tail.next=current;// set the current tail.next to be the new node.
          current.previous=tail;// set the new tails, previous to the old tail
          tail=current;// replace tail with the new node.
          
     }
 
    //removes a node and returns to object that was stored in the node.  Changes the previous node and next node to link to each other.
 
    public Object removeNode(Node current){
          current.next.setPrevious(current.previous);
          return current.data;
     }
 
 
 
 }