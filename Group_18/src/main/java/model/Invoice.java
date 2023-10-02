package Group_18.src.main.java.model;
import java.util.Date;

public class Invoice {

    /* Attributes */
    int invoiceID;
    int ID;
    Date dateGenerated;
    Date datePaid;
    String courseName;


    /* Constructor */
    public Invoice(){
        invoiceID = 0;
        ID = 0;
        dateGenerated = new Date();
        datePaid = new Date();
        courseName = "N/A";
    }

    /* Methods */
    public boolean printInvoice(){
        System.out.println("Returns & Prints Invoice with following details:");
        System.out.println("\tInvoice ID:     " + invoiceID);
        System.out.println("\tInvoicee ID:    " + ID);
        System.out.println("\tDate Generated: " + dateGenerated);
        System.out.println("\tDate Paid:      " + datePaid);
        System.out.println("\tCourse Name:    " + courseName);
        
        return true;
    }

    /* Setters */
    public void setInvoiceDetails(int invoiceID, int ID, Date dateGenerated, Date datePaid, String courseName){
        this.invoiceID = invoiceID;
        this.ID = ID;
        this. dateGenerated = dateGenerated;
        this.datePaid = datePaid;
        this.courseName = courseName;
    }
    
}
