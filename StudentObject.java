//By    Kim.gross@malad.us
//Sample student object class for my students to use as a starting point for their linked list.  This is not a complete implementation, but it should be enough to get you started.  You will need to add some methods to this class, and you will need to create a Node class and a LinkedListTest class.  The Node class should have a data field that stores a StudentObject, and a next field that points to the next node in the list.  The LinkedListTest class should have methods to insert, add and remove nodes from the linked list.

import java.util.Scanner;

public class StudentObject {
    private String name;
    private String address;
    private String studentID;

    // constructor for the student object class. Takes in a name, address and
    // student ID and sets the fields to those values.
    StudentObject(String name, String address, String studentID) {
        this.name = name;
        this.address = address;
        this.studentID = studentID;
    }
    // toString method for the student object class. This is used to print out the
    // student object in a readable format. You will need to use this method in your
    // linked list implementation to print out the student objects stored in the
    // nodes of the linked list.

    public String toString() {
        return name + " at " + address + " student id " + studentID;
    }

    // getter and setter methods for the student object class. These are used to set
    // and get the name, address and student ID fields of the student object. You
    // will need to use these methods in your linked list implementation to
    // manipulate the student objects stored in the nodes of the linked list.
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getID() {
        return studentID;
    }

    public void changeName(String newName) {
        name = newName;
    }

    public void changeAddress(String newAddress) {
        address = newAddress;
    }

    // This method is used to change the student ID of the student object. Since
    // student ID's should not be changed, this method will ask the user if they are
    // sure they want to change the student ID before changing it. You will need to
    // use this method in your linked list implementation to manipulate the student
    // objects stored in the nodes of the linked list.
    public void changeID(String newID) {
        System.out.println("Student ID's should not be changed are you sure this needs changed");
        @SuppressWarnings("resource")
        Scanner inp = new Scanner(System.in);
        String test = inp.nextLine();
        if (test.equals("y") || test.equals("Y")) {// if the user confirms that they want to change the student ID, then
                                                   // change it confirmation can be lower or uppercase y

            studentID = newID;
        }
    }
}
