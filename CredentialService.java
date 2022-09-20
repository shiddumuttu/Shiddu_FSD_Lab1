package Utils;

public interface CredentialService {
    public String generateEmailId(String fname, String lname, String dept);

    public String generatePassword();

    public void showCredentials(Employee e);
}
