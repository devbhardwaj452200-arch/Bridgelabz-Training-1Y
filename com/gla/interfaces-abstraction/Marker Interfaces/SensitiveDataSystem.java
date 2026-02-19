// Custom Marker Interface
interface SensitiveData {
}

// Class marked as sensitive
class CustomerInfo implements SensitiveData {
    String name;
    String accountNumber;

    CustomerInfo(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }
}

public class SensitiveDataSystem {

    public static void main(String[] args) {

        CustomerInfo customer =
                new CustomerInfo("Anita", "ACC12345");

        if (customer instanceof SensitiveData) {
            System.out.println("Sensitive data detected. Encrypt before storage.");
        } else {
            System.out.println("Normal data.");
        }
    }
}
