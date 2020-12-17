package cs3318.assignment3;

/**
 * This class creates Colour objects which contain a name, and 3 components to create the colour
 */
public class Colour {
    String name;
    private int component1;
    private int component2;
    private int component3;

    /**
     * This is a constructor method for the Colour class
     * @param name contains the name of the colour model
     * @param component1 contains the first component of a colour model (e.g. Red for RGB)
     * @param component2 contains the second component of a colour model
     * @param component3 contains the third component of a colour model
     */
    public Colour (String name, int component1, int component2, int component3) {
        this.name = name;
        this.component1 = component1;
        this.component2 = component2;
        this.component3 = component3;
    }
    final static int MINIMUM_VALUE = 0;
    final static int MAXIMUM_VALUE = 255;

    /**
     * Checks if a Colour object satisfies the Minimum Value requirements for Component 1
     * @param testColour the Colour Object to be tested
     * @return true or false
     */
    public static boolean satisfiesMinComponent1Value(Colour testColour) {
        return testColour.getComponent1() >= MINIMUM_VALUE;
    }

    /**
     * Checks if a Colour object satisfies the Maximum Value requirements for Component 1
     * @param testColour the Colour Object to be tested
     * @return true or false
     */
    public static boolean satisfiesMaxComponent1Value(Colour testColour) {
        return testColour.getComponent1() <= MAXIMUM_VALUE;
    }

    /**
     * Checks if a Colour object satisfies the Minimum Value requirements for Component 2
     * @param testColour the Colour Object to be tested
     * @return true or false
     */
    public static boolean satisfiesMinComponent2Value(Colour testColour) {
        return testColour.getComponent2() >= MINIMUM_VALUE;
    }

    /**
     * Checks if a Colour object satisfies the Maximum Value requirements for Component 2
     * @param testColour the Colour Object to be tested
     * @return true or false
     */
    public static boolean satisfiesMaxComponent2Value(Colour testColour) {
        return testColour.getComponent2() <= MAXIMUM_VALUE;
    }

    /**
     * Checks if a Colour object satisfies the Minimum Value requirements for Component 3
     * @param testColour the Colour Object to be tested
     * @return true or false
     */
    public static boolean satisfiesMinComponent3Value(Colour testColour) {
        return testColour.getComponent3() >= MINIMUM_VALUE;
    }

    /**
     * Checks if a Colour object satisfies the Maximum Value requirements for Component 3
     * @param testColour the Colour Object to be tested
     * @return true or false
     */
    public static boolean satisfiesMaxComponent3Value(Colour testColour) {
        return testColour.getComponent3() <= MAXIMUM_VALUE;
    }

    /**
     * Checks if 2 Colour objects are equal to each other
     * @param testColour a Colour Object to be tested
     * @param testColour2 the Colour Object to be compared to the first
     * @return true or false
     */
    public static boolean isEqualTo(Colour testColour, Colour testColour2) {
        return (testColour.getName().equals(testColour2.getName()) && (testColour.getComponent1() == testColour2.getComponent1()) && (testColour.getComponent2() == testColour2.getComponent2()) && (testColour.getComponent3() == testColour2.getComponent3()));
    }

    /**
     * Checks if a Colour object satisfies all the Minimum/Maximum values
     * @param testColour the Colour object to be tested
     * @return true or false
     */
    public static boolean satisfiesComponentValues(Colour testColour) {
        return ((satisfiesMinComponent1Value(testColour)) && (satisfiesMaxComponent1Value(testColour)) && (satisfiesMinComponent2Value(testColour)) && (satisfiesMaxComponent2Value(testColour)) && (satisfiesMinComponent3Value(testColour)) && (satisfiesMaxComponent3Value(testColour)));
    }

    /**
     * This method attempts to add 2 Colour objects together
     * @param testColour first Colour object
     * @param testColour2 second Colour object
     * @return the Colour object created by adding the 2 Colour objects
     * @throws Exception if they cannot be added together
     */
    public static Colour addColours(Colour testColour, Colour testColour2) throws Exception {
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
            return testColour3;
        } else {
            throw new Exception("These Colour Objects cannot be added.");
        }
    }

    /**
     * Getter for Component 1
     * @return Component 1 for a Colour object
     */
    public int getComponent1() {
        return this.component1;
    }

    /**
     * Getter for Component 2
     * @return Component 2 for a Colour object
     */
    public int getComponent2() {
        return this.component2;
    }

    /**
     * Getter for Component 3
     * @return Component 3 for a Colour object
     */
    public int getComponent3() {
        return this.component3;
    }

    /**
     * Getter for object colour model name
     * @return model name for a Colour object
     */
    public String getName() {
        return this.name;
    }
}