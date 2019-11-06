public class Utils {

    public static Double roundOff(Double value) {
        return (value * 100) / 100.0d;
    }

    public static boolean isApproxEqual(Double a, Double b) {

        return (Math.abs(a - b)/Math.min(a, b)) < 1e-10;
    }
}
