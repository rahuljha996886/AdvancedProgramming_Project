package com.example.vaibhavap;

import com.example.vaibhavap.Player;
import com.example.vaibhavap.ScoreKeeper;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 class ScoreKeeperTest {

    @Test
    public void testUpdateCherryCount() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();

        // Initially, cherry count should be 0
        assertNull(scoreKeeper);
        assertEquals(0 , scoreKeeper.updateScoreCount());


    }

    @Test
    public void testUpdateScoreCount() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();

        // Initially, score value should be 0
        assertEquals("0", scoreKeeper.scoreValue.getText());

        // Update score value and check if it reflects in the label
        Player.setCurrScore(100);
        scoreKeeper.updateScoreCount();
        assertEquals("100", scoreKeeper.scoreValue.getText());
    }
}
