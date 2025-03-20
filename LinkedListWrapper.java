public class LinkedListWrapper {

    public static void main(String[] args){
        System.out.println("This program uses a student object that is stored in a linked list.  The student object has a name, address and studentID");
        System.out.println("This is to help explain a linked list.  this program will create 4 student objects, and add them to the linked list");
        System.out.println("Your linked list will need more methods than this. You will need to be able to traverse the linked list using the data in the nodes");
        LinkedListTest studentList=new LinkedListTest();

        StudentObject student=new StudentObject("Fred","Here","12");
        studentList.addNode(student);
        student=new StudentObject("Jane","There","13");
        studentList.addNode(student);
        student=new StudentObject("Kate","Everywhere","14");
        studentList.addNode(student);
        student=new StudentObject("Tre","Nowhere","15");
        studentList.addNode(student);
        student=new StudentObject("Clyde.","Somewhere","16");
        studentList.addNode(student);
        // gets the student at the head of the list, and then prints out each student until it reaches the tail. 
        student=studentList.getHead();
        System.out.println(student);
        while (studentList.hasNext()){
          
            student=studentList.getNext();
            System.out.println(student);
        }
// gets the student at the tail of the list, and then prints out each student until it reaches the head.
        student=studentList.getTail();
        System.out.println(student);
        while (studentList.hasPrevious()){
            
            student=studentList.getPrevious();
            System.out.println(student);
            
        }



    }

}
