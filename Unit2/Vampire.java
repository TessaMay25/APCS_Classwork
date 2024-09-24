public class Vampire {
    public static boolean isVampire(float hour, boolean awake) {
        if (hour >= 6 && hour <= 22) {
            return true;
        } else {
            return false;
        }
    }

    public static void testVampire(float hour, boolean awake, boolean expected) {
        boolean result = isVampire(hour, awake);
        System.out.print("hour: " + hour + " awake: " + awake + " expected: " + expected + " result: " + result + " ");
    }

    public static void main(String[] args) {
        testVampire(21, true, true);
        testVampire(23, false, false);
    }
}
