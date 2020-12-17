package cs3318.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {
    @Test
    public void acceptIfSatisfiesTheMinComponent1Value() {
        Colour testColour = new Colour("rgb" ,20, 20, 20);
        assertTrue(Colour.satisfiesMinComponent1Value(testColour));
    }

    @Test
    public void rejectIfDoesNotSatisfyTheMinComponent1Value() {
        Colour testColour = new Colour("rgb" ,-1, -1, -1);
        assertFalse(Colour.satisfiesMinComponent1Value(testColour));
    }

    @Test
    public void acceptIfSatisfiesTheMaxComponent1Value() {
        Colour testColour = new Colour("rgb" ,255, 255, 255);
        assertTrue(Colour.satisfiesMaxComponent1Value(testColour));
    }

    @Test
    public void rejectIfDoesNotSatisfyTheMaxComponent1Value() {
        Colour testColour = new Colour("rgb" ,300, 300, 300);
        assertFalse(Colour.satisfiesMaxComponent1Value(testColour));
    }

    @Test
    public void acceptIfSatisfiesTheMinYValue() {
        Colour testColour = new Colour("rgb" ,20, 20, 20);
        assertTrue(Colour.satisfiesMinComponent2Value(testColour));
    }

    @Test
    public void rejectIfDoesNotSatisfyTheMinYValue() {
        Colour testColour = new Colour("rgb" ,-1, -1, -1);
        assertFalse(Colour.satisfiesMinComponent2Value(testColour));
    }

    @Test
    public void acceptIfSatisfiesTheMaxYValue() {
        Colour testColour = new Colour("rgb" ,255, 255, 255);
        assertTrue(Colour.satisfiesMaxComponent2Value(testColour));
    }

    @Test
    public void rejectIfDoesNotSatisfyTheMaxYValue() {
        Colour testColour = new Colour("rgb" ,300, 300, 300);
        assertFalse(Colour.satisfiesMaxComponent2Value(testColour));
    }

    @Test
    public void acceptIfSatisfiesTheMinZValue() {
        Colour testColour = new Colour("rgb" ,20, 20, 20);
        assertTrue(Colour.satisfiesMinComponent3Value(testColour));
    }

    @Test
    public void rejectIfDoesNotSatisfyTheMinZValue() {
        Colour testColour = new Colour("rgb" ,-1, -1, -1);
        assertFalse(Colour.satisfiesMinComponent3Value(testColour));
    }

    @Test
    public void acceptIfSatisfiesTheMaxZValue() {
        Colour testColour = new Colour("rgb" ,255, 255, 255);
        assertTrue(Colour.satisfiesMaxComponent3Value(testColour));
    }

    @Test
    public void rejectIfDoesNotSatisfyTheMaxZValue() {
        Colour testColour = new Colour("rgb" ,300, 300, 300);
        assertFalse(Colour.satisfiesMaxComponent3Value(testColour));
    }

    @Test
    public void acceptIfTheyAreEqual() {
        Colour testColour = new Colour("rgb", 250, 250, 250);
        Colour testColour2 = new Colour("rgb", 250, 250, 250);
        assertTrue(Colour.isEqualTo(testColour, testColour2));
    }

    @Test
    public void acceptIfColoursCanBeAdded() {
        Colour testColour = new Colour("rgb", 130, 130, 130);
        Colour testColour2 = new Colour("rgb", 130, 130, 130);
        assertTrue(Colour.addColours(testColour, testColour2));
    }

    @Test
    public void rejectIfColoursCannotBeAdded() {
        Colour testColour = new Colour("bgr", 130, 130, 130);
        Colour testColour2 = new Colour("rgb", 130, 130, 130);
        assertFalse(Colour.addColours(testColour, testColour2));
    }
    @Test
    public void rejectIfTheyAreNotEqual() {
        Colour testColour = new Colour("rgb", 200, 200, 200);
        Colour testColour2 = new Colour("rgb", 250, 250, 250);
        assertFalse(Colour.isEqualTo(testColour, testColour2));
    }

    @Test
    public void acceptIfValuesAccepted() {
        Colour testColour = new Colour("rgb", 200, 200, 200);
        assertTrue(Colour.satisfiesComponentValues(testColour));
    }

    @Test
    public void rejectIfValuesNotAccepted() {
        Colour testColour = new Colour("rgb", -1, -1, -1);
        assertFalse(Colour.satisfiesComponentValues(testColour));
    }
}