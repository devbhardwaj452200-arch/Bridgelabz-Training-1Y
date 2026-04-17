import java.util.*;
import java.util.stream.*;

class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() { return type; }
    public double getAmount() { return amount; }
}

public class InsuranceAnalysis {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
                new Claim("Health", 5000),
                new Claim("Vehicle", 7000),
                new Claim("Health", 8000),
                new Claim("Vehicle", 6000),
                new Claim("Home", 10000)
        );

        Map<String, Double> avgClaims = claims.stream()
                .collect(Collectors.groupingBy(
                        Claim::getType,
                        Collectors.averagingDouble(Claim::getAmount)
                ));

        avgClaims.forEach((type, avg) ->
                System.out.println(type + " -> " + avg));
    }
}
