public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String newId, String newName, int newBalance){
        this.balance = newBalance;
        this.id = newId;
        this.name = newName;

    }

    // OVERRIDING STRING

    @Override
    public String toString() {
        return "Account{" + "id='" + id + ", name='" + name + ", balance=" + balance + '}';
    }

    // get and set methods

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}
