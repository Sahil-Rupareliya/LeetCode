package OOPs;

public class Practice_2 {
    public static void main(String[] args) {
        Account a1 = new Account(123456,"Sahil",10000,7.501);
        a1.calculateInterest();
        a1.DisplayAccountDetails();

    }
}

class Account{
    int Account_number;
    String Customer_name;
    float balance;
    double interest_rate;

    Account(int account_number, String customer_name, float balance, double interest_rate){
        this.Account_number = account_number;
        this.Customer_name = customer_name;
        this.balance = balance;
        this.interest_rate = interest_rate;
    }

    void calculateInterest(){
        double Interest = (balance*interest_rate)/100;
        balance += Interest;
    }

    void DisplayAccountDetails(){
        System.out.println("Account number : " + Account_number);
        System.out.println("Customer name : " + Customer_name);
        System.out.println("Balance : " + balance);
    }
}
