public class BankService
{
    static class BankAccount
    {
        private double balance;
        public BankAccount(double initbal)
        {
            if(initbal<0)
            {
                throw new IllegalArgumentException("Invalid amount");
            
            }
            this.balance=initbal;
        }
        public void deposit(double amt)
        {
            if(amt<=0)
            {
              throw new IllegalArgumentException("Invalid amount");  
            }
            balance+=amt;
        }
        public void withdraw(double amt)
        {
            if(amt<=0)
            {
              throw new IllegalArgumentException("Invalid amount");  
            }
            balance-=amt;
        }
        public double getbal()
        {
           return balance;
        }
    }
    public static void main(String[] args) {
        BankAccount acc=new BankAccount(5000);
        System.out.println("Balance:"+acc.getbal());
        acc.deposit(2000);
        System.out.println("After depositing the amount Balance is:"+acc.getbal());
        acc.withdraw(800);
        System.out.println("After withdrawing the amount Balance is:"+acc.getbal());
    }
}