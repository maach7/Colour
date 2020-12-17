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
    public void acceptIfSatisfiesTheMinComponent2Value() {
        Colour testColour = new Colour("rgb" ,20, 20, 20);
        assertTrue(Colour.satisfiesMinComponent2Value(testColour));
    }

    @Test
    public void rejectIfDoesNotSatisfyTheMinComponent2Value() {
        Colour testColour = new Colour("rgb" ,-1, -1, -1);
        assertFalse(Colour.satisfiesMinComponent2Value(testColour));
    }

    @Test
    public void acceptIfSatisfiesTheMaxComponent2Value() {
        Colour testColour = new Colour("rgb" ,255, 255, 255);
        assertTrue(Colour.satisfiesMaxComponent2Value(testColour));
    }

    @Test
    public void rejectIfDoesNotSatisfyTheMaxComponent2Value() {
        Colour testColour = new Colour("rgb" ,300, 300, 300);
        assertFalse(Colour.satisfiesMaxComponent2Value(testColour));
    }

    @Test
    public void acceptIfSatisfiesTheMinComponent3Value() {
        Colour testColour = new Colour("rgb" ,20, 20, 20);
        assertTrue(Colour.satisfiesMinComponent3Value(testColour));
    }

    @Test
    public void rejectIfDoesNotSatisfyTheMinComponent3Value() {
        Colour testColour = new Colour("rgb" ,-1, -1, -1);
        assertFalse(Colour.satisfiesMinComponent3Value(testColour));
    }

    @Test
    public void acceptIfSatisfiesTheMaxComponent3Value() {
        Colour testColour = new Colour("rgb" ,255, 255, 255);
        assertTrue(Colour.satisfiesMaxComponent3Value(testColour));
    }

    @Test
    public void rejectIfDoesNotSatisfyTheMaxComponent3Value() {
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
    public void rejectIfTheyAreNotEqual() {
        Colour testColour = new Colour("rgb", 200, 200, 200);
        Colour testColour2 = new Colour("rgb", 250, 250, 250);
        assertFalse(Colour.isEqualTo(testColour, testColour2));
    }

    @Test
    public void acceptIfColoursCanBeAdded() throws Exception {
        Colour testColour = new Colour("rgb", 130, 130, 130);
        Colour testColour2 = new Colour("rgb", 130, 130, 130);
        Colour testColour3 = new Colour("rgb", 255, 255, 255);
        Colour resultColour = Colour.addColours(testColour, testColour2);
        assertTrue(Colour.isEqualTo(testColour3, resultColour));
    }

    @Test
    public void rejectIfColoursCannotBeAdded() throws Exception {
        try {
            Colour testColour = new Colour("bgr", 130, 130, 130);
            Colour testColour2 = new Colour("rgb", 130, 130, 130);
            Colour testColour3 = new Colour("rgb", 255, 255, 255);
            Colour resultColour = Colour.addColours(testColour, testColour2);
            assertFalse(Colour.isEqualTo(testColour3, resultColour));
            fail();
        } catch(Exception e) {
            String variable = "These Colour Objects cannot be added.";
            assertEquals(e.getMessage(), variable);
        }
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