package class_files;
public class testingspace {
    public static void main(String[] args) {

        /* Set Instructor */
        Instructor dummyInstructor = new Instructor();
        dummyInstructor.setInstructorDetails("Jeff", "Roberts", "JF@gmail.com", "jfusername", "jfpassword", 000);

        /* Set Course */
        Course dummyCourse = new Course();
        dummyCourse.setCourseDetails(1244, dummyInstructor.firstName, "testtitle", "testsubject", "6 months", "Totall a test", 5, false);
        System.out.println(dummyCourse.getCourseID());
        System.out.print(dummyCourse.name);
    }
}

