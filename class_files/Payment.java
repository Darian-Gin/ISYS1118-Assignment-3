package class_files;
import java.util.Date;

public class Payment {

    /* Attributes */
    private int cardNumber;
    private String nameOnCard;
    private Date expiryDate;
    private int ccv;

    /* Constructor */
    public Payment(){
        cardNumber = 0;
        nameOnCard = "";
        expiryDate = new Date();
        ccv = 0;
    }

    /* Methods */
    public boolean confirmPayment(){
        return true;
    }
}


