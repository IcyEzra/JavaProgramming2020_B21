package day_35_CustomClass;

public class Banking {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
        BankAccount acc3 = new BankAccount();
        BankAccount acc4 = new BankAccount();
        BankAccount acc5 = new BankAccount();

        acc1.setInfo("Uzair Baig",123456,1000000);
        acc1.getInfo();
        acc1.deposit(5000);
        acc1.showBalance();
        acc1.withdraw(7);
        acc1.showBalance();

        acc2.NewCustomer("Sam",123465);
        acc2.deposit(5000);
        acc2.getInfo();

        acc3.NewCustomer("Billy",123333);
        acc3.showBalance();

        acc4.setInfo("Ezra",777777,9999999);
        acc4.getInfo();
        acc4.withdraw(8000000);


    }
}
