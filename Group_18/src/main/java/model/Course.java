package Group_18.src.main.java.model;

public class Course {

    /* Attributes */
    int courseID;
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
        name = "N/A";
        title = "N/A";
        subject = "N/A";
        duration = "N/A";
        briefIntroduction = "N/A";
        cost = 0.0;
        refundOption = false;
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
        
        System.out.println("Course Details Set!");
        
    }

}