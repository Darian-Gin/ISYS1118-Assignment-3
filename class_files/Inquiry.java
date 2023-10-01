package class_files;
import java.util.Date;

public class Inquiry {
    /* Attributes */
    int ID;
    Date dateCreated;
    String authorUsername;
    String inquiryStatus;
    String inquiryResponse;

    /* Constructor */
    public Inquiry(){
        ID = 0;
        dateCreated = new Date();
        authorUsername = "N/A";
        inquiryStatus = "N/A";
        inquiryResponse = "N/A";
    }

    /* Methods */
    public Inquiry getInquiry(int ID){
        Inquiry inquiry = new Inquiry();
        System.out.println("Gathering Inquiry based on ID...");
        // Inquiry Received from DAO
        System.out.println("Inquiry Received!");
        return inquiry;
    }
    public void updateStatus(String status){
        System.out.println("Updating Inquiry Status...");
        System.out.println("Updating Status to " + status + "!");
        setInquiryStatus(status);
    }
    public boolean respondToInquiry(Inquiry inquiry){
        System.out.println("Responding to Inquiry...");
        inquiry.setInquiryResponse("response");
        return inquiry.validateResponse(inquiry.inquiryResponse);
    }
    public boolean validateResponse(String response){
        System.out.println("Validating Response...");
        boolean valid;
        if(response == ""){
            valid = false;
        }
        else{
            valid = true;
            System.out.println("Response is Valid!");
        }
        return valid;

    }
    
    /* Setters */
    public void setInquiryResponse(String response){
        this.inquiryResponse = response;
    }
    public void setInquiryStatus(String status){
        this.inquiryStatus = status;
    }


      
    
}
