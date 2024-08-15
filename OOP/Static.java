// The static keyword in Java is used to indicate that a particular variable, method,
//  or block of code belongs to the class itself, rather than to instances (objects) 
//  of the class.


class Student{
    String name;
    int Rollno;
    static String SchoolName; // Static variable to store the name of the school
    void SetName(String name){
        this.name=name;// 'this.name' refers to the instance variable 'name' of the current object
    }
    String getName(){
        return this.name;
    }

}
public class Static{
    public static void main(String[] args) {
        Student S1=new Student();
        S1.SchoolName="Rangubai Junnare";//Since 'schoolName' is static, it's shared across all instances of the Student class
        System.out.println("School Name: " + Student.SchoolName);
    }
    
}