package class_files;

public class Course {

    /* Attributes */
    private int courseID;
    String name;
    String title;
    String subject;
    String duration;
    String briefIntroduction;
    Double cost;
    boolean refundOption;

    /* Constructor */
    public Course(){
        courseID = 0;
        name = "";
        title = "";
        subject = "";
        duration = "";
        briefIntroduction = "";
        cost = 0.0;
        refundOption = false;
    }
    public void publishCourse(){

    }
    public void unpoublishCourse(){

    }
    public void lockCourse(){

    }
    public boolean isPaid(){
        return false;
    }

    /* Setter for Course Details */
    public void setCourseDetails(int courseID, String name, String title, String subject, 
                                String duration, String briefIntroduction, double cost, boolean refundOption){
        this.courseID = courseID;
        this.name = name;
        this.title = title;
        this.subject = subject;
        this.duration = duration;
        this.briefIntroduction = briefIntroduction;
        this.cost = cost;
        this.refundOption = refundOption;
    }

    /* Getters */
    public int getCourseID() {
        return courseID;
    }
}