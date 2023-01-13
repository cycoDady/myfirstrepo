public class BankAccount {
    public static void main(String[] args) {
        Bank b = new Bank();
       // b.setBankAccount(1000);
       b.setBankAccount(-12);
        System.out.println(b.getBankAccount());
    }
}
class Bank{
    private long BankAccount;

    public void setBankAccount(long bankA) {
       if(bankA>=0){
            BankAccount=bankA;
       }else{
        System.out.println("Invalid number");
        System.exit(0);
       }
    }

    public long getBankAccount() {
        return BankAccount;
    }
    
}