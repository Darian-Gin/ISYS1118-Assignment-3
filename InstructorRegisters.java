class User {
    String firstName;
    String lastName;
    String email;
    String username;
    String password;
    int contactNumber;

    public User(){
        firstName = "";
        lastName = "";
        email = "";
        username = "";
        password = "";
        contactNumber = 0;
    }

    public void login(){

    }
    public void logout(){

    }
    public void register(){

    }
}


class Employee extends User {
    String employeeId;

    public Employee(){
        employeeId = "";
    }

    public void sendEmails(){

    }
    public void getStudentDetails(int ID){

    }

}


class Instructor extends Employee {
    String instructorId;

    public Instructor(){
        instructorId = "";
    }
}


class Course {
    int courseID;
    String name;
    String title;
    String subject;
    String duration;
    String briefIntroduction;
    Double cost;
    boolean refundOption;

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
    public void unpublishCourse(){

    }
    public void lockCourse(){

    }
    public boolean isPaid(){
        return false;
    }
}