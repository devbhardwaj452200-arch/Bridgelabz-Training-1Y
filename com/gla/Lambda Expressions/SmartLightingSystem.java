import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class SmartLightingSystem {

    // Functional Interface
    @FunctionalInterface
    interface LightBehavior {
        void activate();
    }

    public static void main(String[] args) {

        // Map triggers to behaviors using lambdas
        Map<String, LightBehavior> lightBehaviors = new HashMap<>();

        lightBehaviors.put("MOTION", () ->
                System.out.println("Motion detected → Lights ON (Bright White)")
        );

        lightBehaviors.put("NIGHT", () ->
                System.out.println("Night time → Lights ON (Dim Warm)")
        );

        lightBehaviors.put("VOICE", () ->
                System.out.println("Voice command → Lights ON (Custom Scene)")
        );

        lightBehaviors.put("NO_MOTION", () ->
                System.out.println("No motion → Lights OFF")
        );

        // Incoming triggers (could come from sensors)
        List<String> incomingTriggers = Arrays.asList(
                "MOTION", "VOICE", "NIGHT", "NO_MOTION"
        );

        // Process triggers using Stream API
        incomingTriggers.stream()
                .map(trigger -> lightBehaviors.get(trigger))
                .filter(Objects::nonNull)
                .forEach(LightBehavior::activate);
    }
}
