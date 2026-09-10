/* 
CORE CONCEPTS:
 1. Class: The blueprint or template.
            takes up NO space in memory. 
            defines what an object WILL have once it is built.
 2. Object: The physical item built from the blueprint.
            It lives in memory.

  - The 'new' keyword: Every time you type 'new', Java finds an empty box in your computer's memory and builds a brand new, separate 
    object.
  - Independence:objects 100% private and independent.
  - The Dot Operator (.): This is your "remote control". 
    You use it to access a specific object's variables or methods.
  - STATIC vs NON-STATIC: 
    -> If a variable or method has 'static', it is SHARED by the whole class.
    -> If there is NO 'static', it is PRIVATE to the specific object.
 */


// Notice it is not 'public'. We can only have one public class per file.
class BankAccount {
    
    String accountHolder;// INSTANCE VARIABLES...these belong to the object. every object gets its own separate copy.
    double balance;
    
    public void deposit(double amount) { // Notice there is NO 'static' keyword...these actions affect THIS specific object's memory.
        balance = balance + amount;
        System.out.println(amount + " deposited into " + accountHolder);
    }
    
    public void withdraw(double amount) {
        if(balance >= amount) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn by " + accountHolder);
        } else {
            System.out.println("Insufficient funds for " + accountHolder);
        }
    }
    
    public void showBalance() {
        System.out.println(accountHolder + " current balance is " + balance);
    }
}
public class ClassAndObject {
    
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        //ASSIGNING...we use the dot (.) operator to set their private variables
        account1.accountHolder = "Abhay";
        account1.balance = 1000.0;
        
        account2.accountHolder = "Navin";
        account2.balance = 5000.0;
        
        account1.showBalance();
        account2.showBalance(); 
        account1.deposit(500);
        account2.withdraw(5200);
        account1.showBalance();
        account2.showBalance();
    }
}