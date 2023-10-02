package Group_18.src.main.java.model;

public class Instructor extends Employee{

    /* Attributes */
    int instructorId;

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

        // Create Relevant Instances
        Course newCourse =  new Course();
        Instructor newInstructor = new Instructor("IFN", "ILN", 8752, "Email", "Iusername", "Ipassword", 1234);
        Payment payment = new Payment();

        // Perform Sequence Diagram Methods for Registering a Course
        System.out.println("Setting Course Details...");
        newCourse.setCourseDetails(1234, "IFN", "Software Engineering Fundamentals", "CourseSubject", "Duration", "CourseIntro", 0.0, true);
        
        System.out.println("Verifying Instructor Details...");
        newInstructor.verifyDetails(newInstructor);
        
        System.out.println("Confirming Payment...");
        payment.confirmPayment();
        
        System.out.println("Course Successfully Registered!\n");

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
  
