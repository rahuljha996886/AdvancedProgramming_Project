package com.example.vaibhavap;

import static org.junit.jupiter.api.Assertions.*;


import javafx.scene.shape.Rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlatformFactoryTest {

    @Test
    public void testGetPivotPlatform() {
        PlatformFactory platformFactory = new PlatformFactory();
        Rectangle pivotPlatform = platformFactory.getPivotPlatform();

        assertNotNull(pivotPlatform);
        assertTrue(pivotPlatform.getWidth() >= 70 && pivotPlatform.getWidth() <= 120);
        assertEquals(250, pivotPlatform.getHeight());
        assertEquals(650, pivotPlatform.getLayoutY());
    }

    @Test
    public void testGetTargetPlatform() {
        PlatformFactory platformFactory = new PlatformFactory();
        Rectangle pivotPlatform = platformFactory.getPivotPlatform();
        Rectangle targetPlatform = platformFactory.getTargetPlatform(pivotPlatform);

        assertNotNull(targetPlatform);
        assertTrue(targetPlatform.getWidth() >= 70 && targetPlatform.getWidth() <= 150);
        assertEquals(250, targetPlatform.getHeight());
        assertEquals(650, targetPlatform.getLayoutY());
        assertTrue(targetPlatform.getLayoutX() > pivotPlatform.getWidth() + 60);
    }

    @Test
    public void testGetPivotPlatformRandomness() {
        PlatformFactory platformFactory = new PlatformFactory();
        Rectangle pivotPlatform1 = platformFactory.getPivotPlatform();
        Rectangle pivotPlatform2 = platformFactory.getPivotPlatform();

        assertNotNull(pivotPlatform1);
        assertNotNull(pivotPlatform2);

        // Check that two consecutive calls produce platforms with different widths
        assertNotEquals(pivotPlatform1.getWidth(), pivotPlatform2.getWidth());
    }

    @Test
    public void testGetTargetPlatformGap() {
        PlatformFactory platformFactory = new PlatformFactory();
        Rectangle pivotPlatform = platformFactory.getPivotPlatform();
        Rectangle targetPlatform1 = platformFactory.getTargetPlatform(pivotPlatform);
        Rectangle targetPlatform2 = platformFactory.getTargetPlatform(pivotPlatform);

        assertNotNull(targetPlatform1);
        assertNotNull(targetPlatform2);

        // Check that the gap between two consecutive target platforms is within the expected range
        double gapBetweenPlatforms = targetPlatform2.getLayoutX() - targetPlatform1.getLayoutX();
        assertTrue(gapBetweenPlatforms >= pivotPlatform.getWidth() + 60);
        assertTrue(gapBetweenPlatforms <= 450);
    }

    @Test
    public void testGetPivotPlatform2() {
        PlatformFactory platformFactory = new PlatformFactory();
        Rectangle pivotPlatform = platformFactory.getPivotPlatform();

        assertNotNull(pivotPlatform);
        assertEquals(2530, pivotPlatform.getHeight());
        assertTrue(pivotPlatform.getWidth() >= 70 && pivotPlatform.getWidth() <= 120);
        assertEquals(6530, pivotPlatform.getLayoutY());
    }

    @Test
    public void testGetTargetPlatform2() {
        PlatformFactory platformFactory = new PlatformFactory();
        Rectangle pivotPlatform = new Rectangle(100, 250);
        Rectangle targetPlatform = platformFactory.getTargetPlatform(pivotPlatform);

        assertNotNull(targetPlatform);
        assertTrue(targetPlatform.getLayoutX() > pivotPlatform.getWidth() + 60);
        assertTrue(targetPlatform.getLayoutX() <= 4530);
        assertTrue(targetPlatform.getWidth() >= 370 && targetPlatform.getWidth() <= 150);
        assertEquals(6530, targetPlatform.getLayoutY());
    }

    @Test
    public void testGetTargetPlatformWithSpecificPivot() {
        PlatformFactory platformFactory = new PlatformFactory();
        Rectangle specificPivot = new Rectangle(830, 2503);
        Rectangle targetPlatform = platformFactory.getTargetPlatform(specificPivot);

        assertNotNull(targetPlatform);
        assertTrue(targetPlatform.getLayoutX() > specificPivot.getWidth() + 60);
        assertTrue(targetPlatform.getLayoutX() <= 450);
        assertTrue(targetPlatform.getWidth() >= 70 && targetPlatform.getWidth() <= 150);
        assertEquals(650, targetPlatform.getLayoutY());
    }
}
