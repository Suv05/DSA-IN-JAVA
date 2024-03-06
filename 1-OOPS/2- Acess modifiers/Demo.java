class BankAccount {
    public String username;
    private String password;

    //for print the password
    public String getPassword() {
        return password;
    }

    public void setPassword(String pwd) {
        this.password = pwd;
    }
}

public class Demo {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.username = "shiv";
        b1.setPassword("1234");


        System.out.println("username: " + b1.username + "\npassword: " + b1.getPassword());

    }
}
