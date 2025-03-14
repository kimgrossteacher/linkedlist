public class Node {

    Node next;

    Node previous;

    Object data;

    Node (Object data, Node next,Node previous){

        this.data=data;

        this.next=next;

        this.previous=previous;

        }

    public void setNext(Node next){

            this.next=next;

        }

    public void setPrevious (Node previous){

            this.previous=previous;

        }

    public Node getNext(){

            return next;

        }

    public Node getPrevious(){

            return previous;

        }

    public void setData(Object data){

            this.data=data;

        }

    public Object getData(){

        return data;

    }    

}