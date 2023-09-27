package class_files;
public class Instructor extends Employee{

    /* Attributes */
    String instructorId = "";

    /* Constructor */
    public Instructor(){
        instructorId = "N/A";
    }

    /* Methods */
    public void createCourse(){

    }

    /* Setters */
    public void setInstructorDetails(String firstName, String lastName, String email, String username, String password, int contactNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.contactNumber = contactNumber;
    }

    /* Getters */
    public String getInstructorID() {
        return instructorId;
    }
}
  
