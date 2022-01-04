package 第十一章;
//11-8
class Account {
    private String name;
    private int id;
    private double balance;
    private static double annualInterestRate;
    private java.util.Date dateCreated;
    private java.util.ArrayList<Transaction> transactions =new java.util.ArrayList<>();
    public Account(){
        dateCreated=new java.util.Date();
    }
    public Account(String name,int id,double balance){
        this.name=name;
        this.id=id;
        this.balance=balance;
    }
    public java.util.ArrayList<Transaction> getTransactions(){
        return transactions;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public static void setAnnualInterestRate(double annualInterestRate){
        Account.annualInterestRate=annualInterestRate;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate;
    }
    public double getMonthlyInterest(){
        return balance*(annualInterestRate/1200);
    }
    public void withDraw(double amount){
        balance-=amount;
        transactions.add(new Transaction("W",amount,balance,""));
    }
    public void deposit(double amount){
        balance+=amount;
        transactions.add(new Transaction("D",amount,balance,""));
    }

}
class Transaction{
    private java.util.Date date;
    private String type;
    private double amount,balance;
    private String description;
    public Transaction(String type,double amount,double balance,String description){
        date=new java.util.Date();
        this.type=type;
        this.amount=amount;
        this.balance=balance;
        this.description=description;
    }
    public java.util.Date getDate(){
        return date;
    }
    public String getType(){
        return type;
    }
    public double getAmount(){
        return amount;
    }
    public double getBalance(){
        return balance;
    }
    public String getDescription(){
        return description;
    }
}
public class newAccount{
    public static void main(String[] args){
        Account.setAnnualInterestRate(5.5);
        Account account=new Account("George",1122,1000);
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withDraw(5);
        account.withDraw(4);
        account.withDraw(2);
        System.out.println("账户姓名："+account.getName());
        System.out.println("年利率："+account.getAnnualInterestRate());
        System.out.println("余额："+account.getBalance());
        java.util.ArrayList<Transaction> list =account.getTransactions();
        System.out.printf("%-30s%-14s%-14s%-15s\n","交易时间","交易类型","交易金额","账户余额");
        for(int i=0;i<list.size();i++){
            Transaction transaction=(Transaction)(list.get(i));
            System.out.printf("%-35s%-14s%-16s%-15s\n",transaction.getDate(),transaction.getType(),transaction.getAmount(),transaction.getBalance());
        }
    }
}