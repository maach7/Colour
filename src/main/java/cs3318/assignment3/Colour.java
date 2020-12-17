package cs3318.assignment3;

public class Colour {
    String name;
    private int component1;
    private int component2;
    private int component3;

    public Colour (String name, int component1, int component2, int component3) {
        this.name = name;
        this.component1 = component1;
        this.component2 = component2;
        this.component3 = component3;
    }
    final static int MINIMUM_VALUE = 0;
    final static int MAXIMUM_VALUE = 255;

    public static boolean satisfiesMinComponent1Value(Colour testColour) {
        return testColour.getComponent1() >= MINIMUM_VALUE;
    }

    public static boolean satisfiesMaxComponent1Value(Colour testColour) {
        return testColour.getComponent1() <= MAXIMUM_VALUE;
    }

    public static boolean satisfiesMinComponent2Value(Colour testColour) {
        return testColour.getComponent2() >= MINIMUM_VALUE;
    }

    public static boolean satisfiesMaxComponent2Value(Colour testColour) {
        return testColour.getComponent2() <= MAXIMUM_VALUE;
    }

    public static boolean satisfiesMinComponent3Value(Colour testColour) {
        return testColour.getComponent3() >= MINIMUM_VALUE;
    }

    public static boolean satisfiesMaxComponent3Value(Colour testColour) {
        return testColour.getComponent3() <= MAXIMUM_VALUE;
    }

    public static boolean isEqualTo(Colour testColour, Colour testColour2) {
        return (testColour.getName().equals(testColour2.getName()) && (testColour.getComponent1() == testColour2.getComponent1()) && (testColour.getComponent2() == testColour2.getComponent2()) && (testColour.getComponent3() == testColour2.getComponent3()));
    }

    public static boolean satisfiesComponentValues(Colour testColour) {
        return ((satisfiesMinComponent1Value(testColour)) && (satisfiesMaxComponent1Value(testColour)) && (satisfiesMinComponent2Value(testColour)) && (satisfiesMaxComponent2Value(testColour)) && (satisfiesMinComponent3Value(testColour)) && (satisfiesMaxComponent3Value(testColour)));
    }

    public static boolean addColours(Colour testColour, Colour testColour2) {
        boolean state = false;
        try {
            if (testColour.getName().equals(testColour2.getName())) {

                int newComponent1;
                int newComponent2;
                int newComponent3;
                if ((testColour.getComponent1() + testColour2.getComponent1()) <= MAXIMUM_VALUE) {
                    newComponent1 = testColour.getComponent1() + testColour2.getComponent1();
                } else {
                    newComponent1 = 255;
                }
                if ((testColour.getComponent2() + testColour2.getComponent2()) <= MAXIMUM_VALUE) {
                    newComponent2 = testColour.getComponent2() + testColour2.getComponent2();
                } else {
                    newComponent2 = 255;
                }
                if ((testColour.getComponent3() + testColour2.getComponent3()) <= MAXIMUM_VALUE) {
                    newComponent3 = testColour.getComponent3() + testColour2.getComponent3();
                } else {
                    newComponent3 = 255;
                }
                Colour testColour3 = new Colour("rgb", newComponent1, newComponent2, newComponent3);
                state = true;
            }
        } catch (Exception e) {
            state = false;
        }
        return state;
    }

    public int getComponent1() {
        return this.component1;
    }

    public int getComponent2() {
        return this.component2;
    }

    public int getComponent3() {
        return this.component3;
    }

    public String getName() {
        return this.name;
    }
}