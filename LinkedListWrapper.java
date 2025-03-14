public class LinkedListWrapper {

    public static void main(String[] args){
        System.out.println("This program uses a student object that is stored in a linked list.  The student object has a name, address and studentID");
        System.out.println("This is to help explain a linked list.  this program will create 4 student objects, and add them to the linked list");
        System.out.println("Your linked list will need more methods than this. You will need to be able to traverse the linked list using the data in the nodes");
        LinkedListTest studentList=new LinkedListTest();

        StudentObject student=new StudentObject("Fred","Here","12");
        studentList.addNode(student);
        student=new StudentObject("Jane","There","13");
        student=new StudentObject("Kate","Everywhere","13");






    }

}
