import java.io.*;
public class AccountDetails{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        AccountDetails ad=new AccountDetails();
        Account acnt=ad.getAccountDetails();
        int with=ad.getWithdrawAmount();
        boolean d=acnt.withdraw(with);
        
    }
    public Account getAccountDetails() throws IOException{
        Account ac=new Account();
        System.out.println("Enter account id:");
        ac.setAccountId(Integer.parseInt(in.readLine()));
        System.out.println("Enter account type:");
        ac.setAccountType(in.readLine());
        int bal=0;
        boolean flag=true;
        while(flag){
            System.out.println("Enter balance:");
            bal=Integer.parseInt(in.readLine());
            if(bal>0){
                flag=false;
                ac.setBalance(bal);
            }
            else{
                System.out.println("Balance should be positive");
            }
        }
        return ac;
    }
    public int getWithdrawAmount() throws IOException{
        int amt=0;
        boolean flag=true;
        while(flag){
            System.out.println("Enter amount to be withdrawn:");
            amt=Integer.parseInt(in.readLine());
            if(amt>0){
                flag=false;
                
            }
            else{
                System.out.println("Amount should be positive");
            }
    }
    return amt;
}
}