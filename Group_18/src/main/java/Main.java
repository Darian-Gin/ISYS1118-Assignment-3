package Group_18.src.main.java;
import Group_18.src.main.java.model.*;

public class Main {
    public static void main(String[] args) {
        
        // Instructor Registers Course (Sub-Scenario 1)
        
        System.out.println("Sub-Scenario 1: Instructor Creates Course");
        Instructor instructor = new Instructor();
        instructor.createCourse();


        //Manager Addresses Inquiry (Sub-Scenario 2)

        System.out.println("Sub-Scenario 2: Manager Address Inquiry");
        int dummyID = 2;
        Manager newManager = new Manager();
        newManager.addressInquiry(dummyID);
    }
}
