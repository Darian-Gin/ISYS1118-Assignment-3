package class_files;
public class User {

    /* Attributes */
    String firstName;
    String lastName;
    String email;
    String username;
    String password;
    int contactNumber;

    /* Constructor */
    public User(){
        firstName = "N/A";
        lastName = "N/A";
        email = "N/A";
        username = "N/A";
        password = "N/A";
        contactNumber = 0;

    }
    
    /* Methods */
    public void login(){

    }
    public void logout(){

    }
    public void register(){

    }

    /* Getters */
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public int getContactNumber(){
        return contactNumber;
    }
}
