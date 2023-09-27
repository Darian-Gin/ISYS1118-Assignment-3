package class_files;
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
    public boolean printInvoice(int ID){
        return true;
    }
}
