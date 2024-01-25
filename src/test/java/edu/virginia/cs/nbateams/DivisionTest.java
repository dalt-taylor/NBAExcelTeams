package edu.virginia.cs.nbateams;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void testGetDivisionValid() {
        assertEquals(Division.ATLANTIC, Division.getDivision("ATLANTIC"));
        assertEquals(Division.CENTRAL, Division.getDivision("Central"));
        assertEquals(Division.SOUTHEAST, Division.getDivision("southeast"));
        // ... test other valid divisions
    }

    @Test
    void testGetDivisionInvalid() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Division.getDivision("UNKNOWN");
        });

        String expectedMessage = "Illegal edu.virginia.cs.nbateams.Division name: UNKNOWN";
        assertTrue(exception.getMessage().contains(expectedMessage));
    }
}
