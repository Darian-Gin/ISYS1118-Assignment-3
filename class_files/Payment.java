import java.util.Date

public class Payment{

    /* Attributes */
    private int cardNumber;
    private String nameOnCard;
    private Date expiryDate;
    private int ccv;

    /* Constructor */
    private Payment(){
        cardNumber = 0;
        nameOnCard = '';
        expiryDate = new Date();
        ccv = 0;
    }

    /* Methods */
    private boolean confirmPayment(){
        return true
    }
}


