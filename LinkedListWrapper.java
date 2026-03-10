// this program is written to help explain a linked list.  this program will create 4 student objects, and add them to the linked list
//By Kim.gross@malad.us
//This is to help explain a linked list.  this program will create 4 student objects, and add them to the linked list.  
// Your linked list will need more methods than this. You will need to be able to traverse

public class LinkedListWrapper {

    public static void main(String[] args) {
        System.out.println(
                "This program uses a student object that is stored in a linked list.  The student object has a name, address and studentID");
        System.out.println(
                "This is to help explain a linked list.  this program will create 4 student objects, and add them to the linked list");
        System.out.println(
                "Your linked list will need more methods than this. You will need to be able to traverse the linked list using the data in the nodes");
        LinkedListTest studentList = new LinkedListTest();

        StudentObject student = new StudentObject("Fred", "Here", "12");
        studentList.addNode(student);
        student = new StudentObject("Jane", "There", "13");
        studentList.addNode(student);
        student = new StudentObject("Kate", "Everywhere", "14");
        studentList.addNode(student);
        student = new StudentObject("Tre", "Nowhere", "15");
        studentList.addNode(student);
        student = new StudentObject("Clyde.", "Somewhere", "16");
        studentList.addNode(student);
        // gets the student at the head of the list, and then prints out each student
        // until it reaches the tail.
        student = (StudentObject) studentList.getHead();// The (StudentObject) is a cast. It tells the compiler that the
                                                        // object returned by getHead() is a StudentObject, and that it
                                                        // should be treated as such. This is necessary because
                                                        // getHead() returns an Object, and we need to tell the compiler
                                                        // that it is actually a StudentObject so that we can access the
                                                        // fields and methods of the StudentObject class.
                                                        // This is needed because my linked list implementation is not
                                                        // type safe, and it returns an Object. In a more complete
                                                        // implementation, you would want to make your linked list type
                                                        // safe, so that it only accepts StudentObjects, and returns
                                                        // StudentObjects. This would eliminate the need for casting,
                                                        // and would make your code safer and easier to read.
                                                        // In the type safe implementation, you would have a
                                                        // LinkedList<StudentObject> class, and the getHead() method
                                                        // would return a StudentObject, so you would not need to cast
                                                        // it.

        System.out.println(student);
        while (studentList.hasNext()) {

            student = (StudentObject) studentList.getNext();
            System.out.println(student);
        }
        // gets the student at the tail of the list, and then prints out each student
        // until it reaches the head.
        student = (StudentObject) studentList.getTail();
        System.out.println(student);
        while (studentList.hasPrevious()) {

            student = (StudentObject) studentList.getPrevious();
            System.out.println(student);

        }

    }

}
