//By Kim.gross@malad.us
//Sample linked list node class for my students to use as a starting point for their linked list.  This is not a complete implementation, but it should be enough to get you started.  You will need to add some methods to this class, and you will need to create a StudentObject class.  The StudentObject class should have

public class Node {

    Node next;
    Node previous;
    Object data;
    // constructor for the node class. Takes in an object to store in the data
    // field, and a node to point to as the next node in the list. The previous node
    // is set to null by default, but can be set using the setPrevious method.

    Node(Object data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    // getter and setter methods for the node class. These are used to set and get
    // the data, next and previous fields of the node. You will need to use these
    // methods in your linked list implementation to manipulate the nodes in the
    // list. Since the variables are not set to private, you can also access them
    // directly, but it is good practice to use the getter and setter methods to
    // encapsulate the data and make it easier to change the implementation later if
    // needed.
    // This sets the next node to the node passed in as a parameter. This is used to
    // link the nodes together in the linked list. You will need to use this method
    // in your linked list implementation to link

    public void setNext(Node next) {
        this.next = next;
    }
    // This sets the previous node to the node passed in as a parameter. This is
    // used to link the nodes together in the linked list. You will need to use this
    // method in your linked list implementation to link the nodes together in the
    // linked list.

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
    // This returns the next node in the linked list. You will need to use this
    // method in your linked list implementation to traverse the linked list and
    // access the data stored in the nodes.

    public Node getNext() {
        return next;
    }
    // This returns the previous node in the linked list. You will need to use this
    // method in your linked list implementation to traverse the linked list and
    // access the data stored in the nodes.

    public Node getPrevious() {
        return previous;
    }
    // This sets the data stored in the node to the object passed in as a parameter.
    // You will need to use this method in your linked list implementation to
    // manipulate the data stored in the nodes.

    public void setData(Object data) {
        this.data = data;
    }
    // This returns the data stored in the node. You will need to use this method in
    // your linked list implementation to access the data stored in the nodes.

    public Object getData() {
        return data;

    }

}