public class Tests {
    private static final String[] owners = {"Anne", "Bob", "Chen", "Diego"};

    /**
     * Adds one owner to the car park
     * @return true if arrive returns 1
     */
    public static boolean testOne() {
        SussexCarPark sussexCarPark = new SussexCarPark();
        return sussexCarPark.arrive(owners[0]) == 1;
    }

    /**
     * Adds and then removes one owner to the car park
     * @return empty String as car park is empty
     */
    public static boolean testTwo() {
        SussexCarPark sussexCarPark = new SussexCarPark();
        sussexCarPark.arrive(owners[0]);
        sussexCarPark.leave(owners[0]);
        return sussexCarPark.leave(owners[0]).isEmpty();
    }

    /**
     * The first car in the car park leaves
     * @return true if String is "Chen-Bob-"
     */
    public static boolean testThree() {
        SussexCarPark sussexCarPark = new SussexCarPark();
        for (int i = 0; i < 3; i++) {
            sussexCarPark.arrive(owners[i]);
        }
        return sussexCarPark.leave(owners[0]).equals(String.format("%s-%s-",owners[2], owners[1]));
    }

    /**
     * Car park has three cars - tries to remove a car not in the car park
     * @return true if result == null
     */
    public static boolean testFour() {
        SussexCarPark sussexCarPark = new SussexCarPark();
        for (int i = 0; i < 3; i++) {
            sussexCarPark.arrive(owners[i]);
        }
        return sussexCarPark.leave(owners[3]) == null;
    }

    /**
     * Add 3 cars to the car park
     * @return true if arrive returns 3
     */
    public static boolean testFive() {
        SussexCarPark sussexCarPark = new SussexCarPark();
        int numCars = 0;
        for (int i = 0; i < 3; i++) {
            numCars = sussexCarPark.arrive(owners[i]);
        }
        return numCars == 3;
    }

    /**
     * Add three cars to the car park, Last car leaves and then returns
     * @return true if arrive returns 3
     */
    public static boolean testSix() {
        SussexCarPark sussexCarPark = new SussexCarPark();
        for (int i = 0; i < 3; i++) {
            sussexCarPark.arrive(owners[i]);
        }
        sussexCarPark.leave(owners[2]);
        return sussexCarPark.arrive(owners[2]) == 3;
    }

    /**
     * Adds three cars to the car park. Last car added leaves
     * @return true if leave returns an empty String
     */
    public static boolean testSeven() {
        SussexCarPark sussexCarPark = new SussexCarPark();
        for (int i = 0; i < 3; i++) {
            sussexCarPark.arrive(owners[i]);
        }
        return  sussexCarPark.leave(owners[2]).isEmpty();
    }

    /**
     * Add three cars. The first car added to the car park leaves
     * @return true if arrive returns 3
     */
    public static boolean testEight() {
        SussexCarPark sussexCarPark = new SussexCarPark();
        for (int i = 0; i < 3; i++) {
            sussexCarPark.arrive(owners[i]);
        }
        sussexCarPark.leave(owners[0]);
        return  sussexCarPark.arrive(owners[0]) == 3;
    }

    /**
     * Add three cars to the car park
     * Bob leaves
     * @return true if leave returns "Chen-"
     */
    public static boolean testNine() {
        SussexCarPark sussexCarPark = new SussexCarPark();
        for (int i = 0; i < 3; i++) {
            sussexCarPark.arrive(owners[i]);
        }
        return sussexCarPark.leave(owners[1]).equals(String.format("%s-",owners[2]));
    }

    /**
     * Adds three cars to the car park
     * The first car added to the car park leaves
     * The last car added to the car park leaves
     * @return true if leave returns "Bob-"
     */
    public static boolean testTen() {
        SussexCarPark sussexCarPark = new SussexCarPark();
        for (int i = 0; i < 3; i++) {
            sussexCarPark.arrive(owners[i]);
        }
        sussexCarPark.leave(owners[0]);
        return sussexCarPark.leave(owners[2]).equals(String.format("%s-",owners[1]));
    }
    /**
     * Adds three cars to the car park
     * The second car added to the car park leaves
     * The second car returns to the car park
     * @return true if arrive returns 3
     */
    public static boolean testEleven() {
        SussexCarPark sussexCarPark = new SussexCarPark();
        for (int i = 0; i < 3; i++) {
            sussexCarPark.arrive(owners[i]);
        }
        sussexCarPark.leave(owners[1]);
        return sussexCarPark.arrive(owners[1]) == 3;
    }
    public static void main(String[] args) {
        System.out.printf("Test one %s%n", testOne());
        System.out.printf("Test two %s%n", testTwo());
        System.out.printf("Test three %s%n", testThree());
        System.out.printf("Test four %s%n", testFour());
        System.out.printf("Test five %s%n", testFive());
        System.out.printf("Test six %s%n", testSix());
        System.out.printf("Test seven %s%n", testSeven());
        System.out.printf("Test eight %s%n", testEight());
        System.out.printf("Test nine %s%n", testNine());
        System.out.printf("Test ten %s%n", testTen());
        System.out.printf("Test eleven %s%n", testEleven());
    }

}
