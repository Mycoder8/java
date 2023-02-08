public class Account {
    private static Account acc = null;

    private Account(){}

    public static Account getInstance(){
        if(acc == null){
            acc = new Account();
        }

        return acc;
    }

    public void accountInformation(){
        System.out.println("Your account is created");
    }
}