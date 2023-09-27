package class_files;
public class Instructor extends Employee{

    /* Attributes */
    int instructorId = 0;

    /* Constructor */
    public Instructor(){
        instructorId = 0;
    }
    public Instructor(String firstName, String lastName, int ID, String email, String username, String password, int contactNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.instructorId= ID;
        this.email = email;
        this.username = username;
        this.password = password;
        this.contactNumber = contactNumber;
    }

    /* Methods */
    public void createCourse(){

    }

    /* Setters */
    public void setInstructorDetails(String firstName, String lastName, int ID, String email, String username, String password, int contactNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.instructorId= ID;
        this.email = email;
        this.username = username;
        this.password = password;
        this.contactNumber = contactNumber;
    }

    /* Getters */
    public int getInstructorID() {
        return instructorId;
    }
}
  
