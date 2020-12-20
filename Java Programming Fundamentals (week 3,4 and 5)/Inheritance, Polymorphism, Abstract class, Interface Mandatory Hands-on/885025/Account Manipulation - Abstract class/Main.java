public class Main{
    
    public static void main(String args[]){
        Customer c=new Customer(1,"abc","abc@gmail.com");
        SavingsAccount s=new SavingsAccount(123,c,20000.00,2000.0);
        System.out.println(s.withdraw(1000));
        
    }
}