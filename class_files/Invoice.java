package class_files;
import java.util.Date;

public class Invoice {

    /* Attributes */
    String invoiceID;
    int ID;
    Date dateGenerated;
    Date datePaid;
    String courseName;


    /* Constructor */
    public Invoice(){
        invoiceID = "";
        ID = 0;
        dateGenerated = new Date();
        datePaid = new Date();
        courseName = "";
    }

    public boolean printInvoice(int ID){
        return true;
    }
}
