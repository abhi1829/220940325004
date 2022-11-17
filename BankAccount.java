class BankAccount{
    String acc_no;
    double balance;
    BankAccount(String acc_no, double amt){
        this.acc_no=acc_no;
        balance=amt;
        System.out.println("Account Created");
    }

    void withdraw(double amt){
        if (amt>balance){
            throw new ArithemeticException("Balance Low");}
        else{
            balance = balance - amt;
            System.out.println("Withdrawal Successful");
        }
    }
    void deposit(double amt){
        balance=balance+amt;
        System.out.println("Deposit Successfull");
    }
    void show(){
        System.out.println("Account Number: " + acc_no + "      " + "Balance Available: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("SBI10001", 10000);
        BankAccount acc2 = new BankAccount("SBI10002", 2500);

        //show details
        acc1.show();
        acc2.show();

        //Depositing Money
        acc1.deposit(8000);
        acc2.deposit(780);

        //show details
        acc1.show();
        acc2.show();

        //withdrawing money
        acc1.withdraw(7000);
        acc2.withdraw(500);

        //show details
        acc1.show();
        acc2.show();
 
    }
}