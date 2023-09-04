package OOPs;

public class Practice_3 {
    public static void main(String[] args) {
        Account1 a1 = new Account1();
        a1.setAccountDetails(123456,"Sahil",50000);
        a1.dispAccountDetails();
        a1.withdraw(100000);
        a1.dispAccountDetails();
        a1.deposit(15000);
        a1.dispAccountDetails();
    }
}


class Account1{
    int Account_number;
    String Customer_name;
    double Account_balance;


    void setAccountDetails(int account_number, String customer_name, double account_balance){
        this.Account_number = account_number;
        this.Customer_name = customer_name;
        this.Account_balance = account_balance;
    }


    void withdraw(int withdraw_Ammout){
        if(Account_balance < withdraw_Ammout){
            System.out.println("Not Enough balance :");
            System.out.println();
        }else{
            System.out.println(withdraw_Ammout + " Amount withdraw Successfully.");
            Account_balance -= withdraw_Ammout;
            System.out.println();
        }
    }
    void deposit(int depoist_Amount){
        System.out.println(depoist_Amount + " Amount deposited Successfully.");
        Account_balance += depoist_Amount;
        System.out.println("updated balance is :" + Account_balance);
        System.out.println();
    }


    void dispAccountDetails(){
        System.out.println("Account number is: " + Account_number);
        System.out.println("Customer name is: " + Customer_name);
        System.out.println("Account balance is: " + Account_balance);
        System.out.println();
    }
}
