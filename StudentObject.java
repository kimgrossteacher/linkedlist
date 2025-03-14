import java.util.Scanner;

public class StudentObject {
   private String name;
   private String address;
   private String studentID;

    StudentObject (String name, String address, String studentID){
        this.name=name;
        this.address=address;
        this.studentID=studentID;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getID(){
        return studentID;
    }
    public void changeName(String newName){
        name=newName;
    }
    public void changeAddress(String newAddress){
        address=newAddress;
    }
    public void changeID (String newID){
        System.out.println("Student ID's should not be changed are you sure this needs changed");
        Scanner inp=new Scanner(System.in);
        String test=inp.nextLine();
        if (test.equals("y") || test.equals("Y")){
            studentID=newID;
        }
    }
}



