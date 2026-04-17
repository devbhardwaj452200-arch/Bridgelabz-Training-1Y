import java.util.*;
import java.util.stream.*;

class Invoice {
    int transactionId;

    public Invoice(int transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice for Transaction ID: " + transactionId;
    }
}

public class InvoiceCreation {
    public static void main(String[] args) {

        List<Integer> transactionIds = Arrays.asList(1001, 1002, 1003);

        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)             // Constructor Reference
                .collect(Collectors.toList());

        invoices.forEach(System.out::println); // Method Reference
    }
}
