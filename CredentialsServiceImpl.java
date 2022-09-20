package Utils;

import java.util.Random;

public class CredentialsServiceImpl implements CredentialService {
    private final String domain;

    public CredentialsServiceImpl(String domain) {
        super();
        this.domain = domain;
    }

    @Override
    public String generateEmailId(String fName, String lName, String dept) {
        return fName + lName + "@" + dept + "." + domain;
    }

    @Override
    public String generatePassword() {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int n = r.nextInt(127 - 32) + 32;
            sb.append((char) n);
        }
        return sb.toString();
    }

    @Override
    public void showCredentials(Employee e) {
        System.out.println("Dear " + e.getFirstName() + "Your generated credentials are as follows");
        System.out.println("Email -->" + e.getEmailId());
        System.out.println("Password-->" + e.getPassWord());
    }
}
