package Group_18.src.main.java.model;
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
        System.out.println("Payment Confirmed!");
        
        return true;
    }
}


