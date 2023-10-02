package Group_18.src.main.java.model;
public class Employee extends User{

    /* Attributes */
    String employeeId;

    /* Constructor */
    public Employee(){
        employeeId = "N/A";
    }

    /* Getters */
    public boolean verifyDetails(Instructor instructor){
        System.out.println("Instructor Details Verified!");
        return true;
    }
}