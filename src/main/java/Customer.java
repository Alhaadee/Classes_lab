import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Customer {
    private String firstName;
    private String lastName;
    private double heldMoney;

    private int randomNum  = ThreadLocalRandom.current().nextInt(1,1001);
    private int id;

    public Customer(String firstName, String lastName, double heldMoney){
        this.firstName = firstName;
        this.lastName = lastName;
        this.heldMoney = heldMoney;
        this.id = randomNum;


    }

//    novel methods
    public String getFullName(){
        return firstName + " " + lastName;
    }

    public void subtractHeldMoney(double subtractedValue){
        heldMoney -= subtractedValue;
    }
    public void checkBalance(){
        System.out.println(heldMoney);
    }

//    GETTERS AND SETTERS
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getId(){
        return id;
    }
    public double getHeldMoney(){
        return heldMoney;
    }

    @Override
    public String toString(){
        return "Customer \n"
        + "Name= " + getFullName() +"\n"
        + "BankBalance= " +getHeldMoney() + "\n"
        + "id= " +getId();

    }
}
