import Utils.CredentialService;
import Utils.CredentialsServiceImpl;
import Utils.Employee;

import java.util.Scanner;

public class GenerateCredentials {
    public static final String[] dept = {"Technical", "Admin", "Human Resource", "Legal"};
    public static final String[] deptCodes = {"tech", "adm", "hr", "lg"};

    public static void main(String[] args) {
        CredentialService service = new CredentialsServiceImpl("gl.in");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Name -->");
        String fName = input.next();
        System.out.println("Enter Last Name -->");
        String lName = input.next();
        Employee e = new Employee(fName);
        System.out.println("Please Enter the Department from following -->");
        for (int j = 1; j <= dept.length; j++)
            System.out.println(j + ". " + dept[j - 1]);
        int deptNumber = input.nextInt();
        String emailID = service.generateEmailId(fName, lName, deptCodes[deptNumber - 1]);
        e.setEmailId(emailID);
        String password = service.generatePassword();
        e.setPassWord(password);
        service.showCredentials(e);
    }
}
