public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6371; // radius of Earth in kilometers
        double pi = Math.PI;
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);
        double radiusMiles = radiusKm * 0.621371;
        double volumeMiles3 = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);
        System.out.println("Volume of Earth in km^3 = " + volumeKm3);
        System.out.println("Volume of Earth in miles^3 = " + volumeMiles3);
    }
}
