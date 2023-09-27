package class_files;
import java.util.Date;

public class Inquiry {
    /* Attributes */
    int ID;
    Date dateCreated;
    String authorUsername;
    String inquiryStatus;

    /* Constructor */
    public Inquiry(){
        ID = 0;
        dateCreated = new Date();
        authorUsername = "N/A";
        inquiryStatus = "N/A";
    }

    /* Methods */
    public Inquiry getInquiry(){
        Inquiry inquiry = new Inquiry();
        return inquiry;
    }
    public void updateStatus(String Status){

    }
    public String respondToInquiry(){
        String response = "response";
        return response;
    }
    public boolean validateResponse(String response){
        return true;
    }

    /* Getters */
    public int getInquiryID(){
        return ID;
    }
    public Date getInquiryCreationDate(){
        return dateCreated;
    }
    public String getInquiryAuthor(){
        return authorUsername;
    }
    public String getInquiryStatus(){
        return inquiryStatus;
    }


      
    
}
