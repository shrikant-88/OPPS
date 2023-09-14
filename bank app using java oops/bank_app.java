class bank_account {
private String name;
private int account_no;
private String Email;
private String mobile_no;
private double balance;
public bank_account(String name, int account_no, String email, String mobile_no, double balance) {
    this.name = name;
    this.account_no = account_no;
    Email = email;
    this.mobile_no = mobile_no;
    this.balance = balance;
}



public String getName() {
    return name;
}



public int getAccount_no() {
    return account_no;
}



public String getEmail() {
    return Email;
}



public String getMobile_no() {
    return mobile_no;
}



public double getBalance() {
    return balance;
}



public void setName(String name) {
    this.name = name;
}
public void setAccount_no(int account_no) {
    this.account_no = account_no;
}
public void setEmail(String email) {
    Email = email;
}
public void setMobile_no(String mobile_no) {
    this.mobile_no = mobile_no;
}
public void setBalance(double balance) {
    this.balance = balance;
}

public void deposit(int amount) {
    balance += amount;
    System.out.println(amount + "  is deposited successfully. new Balance "+balance);
}
public void withdrawal(int amount) {
    if(balance<amount){
        System.out.println("insufficient  balance.\n balance = "+balance); 
    }
    else{
        balance -= amount;
        System.out.println(amount + " is withdrawal successfully\nbalance "+balance);
    }
}
    
}
public class bank_app {

     
    public static void main(String[] args) {
        bank_account sikander = new bank_account("sikander kumar", 1234,"sikander@xyz.com", "89438XXXXX", 0);
        sikander.deposit(10000);
        sikander.withdrawal(1234);
        sikander.setName("shrikant");
        System.out.println(sikander.getMobile_no());
        System.out.println(sikander.getName());
    }
}


