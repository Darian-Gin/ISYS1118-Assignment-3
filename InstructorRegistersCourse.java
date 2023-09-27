import class_files.*;

public class InstructorRegistersCourse {
    public static void main(String[] args) {

        /* Set Instructor */
        Instructor dummyInstructor = new Instructor();
        dummyInstructor.setInstructorDetails("Jeff", "Roberts", "JF@gmail.com", "jfusername", "jfpassword", 000);
        System.out.println(dummyInstructor.getInstructorID());

        /* Set Course */
        Course dummyCourse = new Course();
        dummyCourse.setCourseDetails(1244, dummyInstructor.getFirstName(), "testtitle", "testsubject", "6 months", "Totall a test", 5, false);
        System.out.println(dummyCourse.getCourseID());
        System.out.println(dummyCourse.getTitle());
        System.out.println(dummyCourse.getName());
    }
       
}