import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    //private Account acct[];
    private ArrayList<Account> acct;
    //private int numOfAccount;
    public Account getAccount(int index) {
        //return acct[index];
        return this.acct.get(index);
    }
    
    public void addAccount(Account acct) {
        //this.acct[numOfAccount] = acct;
        //numOfAccount += 1;
        this.acct.add(acct);
    }
    
    public int getNumOfAccount() {
        return this.acct.size();
    }

//    public Customer() {
//        this.firstName = "";
//        this.lastName = "";
//        this.acct = new Account[5];
//        
//    }

    /*public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
    }
    */
    
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList<>();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + lastName + getNumOfAccount();
    }
}
