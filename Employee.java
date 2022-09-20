package Utils;

public class Employee {
    private final String firstName;
    private String emailId;
    private String passWord;

    public String getFirstName() {
        return firstName;
    }

    public Employee(String firstName) {
        super();
        this.firstName = firstName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
