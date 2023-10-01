package class_files;

public class Manager extends Employee {
    
    /* Methods */
    public boolean addressInquiry(int ID){

        Inquiry inquiry = new Inquiry();
        if (inquiry.respondToInquiry(inquiry.getInquiry(ID)) == true){
            inquiry.updateStatus("Open");
            // User is Satisfied, and Closes Inquiry
            System.out.println("User is Satisfied with Response, and Closes Inquiry");
            inquiry.updateStatus("Closed");
        }


        return true;
    }

    public Inquiry trackInquiry(int ID){
        Inquiry dummyInquiry = new Inquiry();
        return dummyInquiry;
    }
}
