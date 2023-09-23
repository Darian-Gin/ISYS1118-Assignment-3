package class_files;
import java.util.List;
import java.util.ArrayList;

public class Course_Content {

    /* Attributes */
    int courseId;
    List<Object> contentTypes;

    /* Constructor */
    public Course_Content(){
        courseId = 0;
        contentTypes = new ArrayList<Object>();
    }
}
