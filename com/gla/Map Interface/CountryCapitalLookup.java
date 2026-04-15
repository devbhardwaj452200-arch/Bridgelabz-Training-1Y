import java.util.*;

public class CountryCapitalLookup {

    public static void main(String[] args) {

        // Step 1: Create Map (country -> capital)
        Map<String, String> countryMap = new HashMap<>();

        countryMap.put("India", "New Delhi");
        countryMap.put("USA", "Washington D.C.");
        countryMap.put("UK", "London");
        countryMap.put("France", "Paris");
        countryMap.put("Germany", "Berlin");
        countryMap.put("Japan", "Tokyo");
        countryMap.put("Canada", "Ottawa");
        countryMap.put("Australia", "Canberra");

        // Step 2: User input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a country name: ");
        String input = sc.nextLine();

        // Lookup capital
        if (countryMap.containsKey(input)) {
            System.out.println("Capital of " + input + " is " + countryMap.get(input));
        } else {
            System.out.println("Unknown country");
        }

        // Step 3: Print all countries in alphabetical order
        System.out.println("\nCountries and their Capitals (Alphabetical Order):");

        // Using TreeMap for sorting
        Map<String, String> sortedMap = new TreeMap<>(countryMap);

        for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}
