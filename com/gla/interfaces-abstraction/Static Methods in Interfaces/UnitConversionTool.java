public class UnitConversionTool {

    interface ConversionUtils {

        static double kmToMiles(double km) {
            return km * 0.621371;
        }

        static double kgToLbs(double kg) {
            return kg * 2.20462;
        }
    }

    public static void main(String[] args) {

        double km = 10;
        double kg = 5;

        System.out.println(km + " km = " +
                ConversionUtils.kmToMiles(km) + " miles");

        System.out.println(kg + " kg = " +
                ConversionUtils.kgToLbs(kg) + " lbs");
    }
}
