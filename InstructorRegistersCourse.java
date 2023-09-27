import class_files.*;
import java.util.Date;

public class InstructorRegistersCourse {

    public static void main(String[] args) {

        Course newCourse =  new Course();
        Instructor newInstructor = new Instructor();
        Invoice newInvoice = new Invoice();
        Date date = new Date();

        newCourse.setCourseDetails(1234, "IFN", "Software Engineering Fundamentals", "CourseSubject", "Duration", "CourseIntro", 0.0, true);
        newInstructor.setInstructorDetails("IFN", "ILN", 8752, "Email", "Iusername", "Ipassword", 1234);
        newInvoice.setInvoiceDetails(123, newInstructor.getInstructorID(), date, date, newCourse.getTitle() );
        newInvoice.printInvoice();

         
        // /* Set Instructor */
        // Instructor dummyInstructor = new Instructor();
        // dummyInstructor.setInstructorDetails("Jeff", "Roberts", "JF@gmail.com", "jfusername", "jfpassword", 000);
        // System.out.println(dummyInstructor.getInstructorID());

        // /* Set Course */
        // Course dummyCourse = new Course();
        // dummyCourse.setCourseDetails(1244, dummyInstructor.getFirstName(), "testtitle", "testsubject", "6 months", "Totall a test", 5, false);
        // System.out.println(dummyCourse.getCourseID());
        // System.out.println(dummyCourse.getTitle());
        // System.out.println(dummyCourse.getName());
        
    }
       
}