
public class Seller extends Employee{
    public Food sell(Employee e) {
        Food f1 = new Food();
        if (e.getWallet().getBalance() >= Food.getPrice()) {
            getWallet().setBalance(getWallet().getBalance() + Food.getPrice());
            e.getWallet().setBalance(e.getWallet().getBalance() - Food.getPrice());
            return f1;
        } else {
            System.out.println("Your money is not enough.");
            return null;
        }
    }
}
