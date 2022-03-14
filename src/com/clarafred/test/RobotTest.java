package com.clarafred.test;

import static org.junit.Assert.assertEquals;

import com.clarafred.app.Robot;
import java.awt.Point;
import org.junit.Test;

public class RobotTest {

  @Test
  public void getRobotStartPosition() {
    Robot robot = new Robot(new Point(5,5), "N");

    Point expectedPosition = new Point(5,5);

    assertEquals(expectedPosition, robot.getStartPosition());
    assertEquals("N", robot.getDirection());
  }

  //Forward
  @Test
  public void fromNorthMoveForwardSwe() {
    Robot robot = new Robot(new Point(3,3), "N");
    Point newPosition = robot.move("G");

    Point expectedPosition = new Point(3,4);

    assertEquals(expectedPosition, newPosition);
    assertEquals("N", robot.getDirection());
  }

  @Test
  public void fromNorthMoveForwardEng() {
    Robot robot = new Robot(new Point(3,3), "N");
    Point newPosition = robot.move("F");

    Point expectedPosition = new Point(3,4);

    assertEquals(expectedPosition, newPosition);
    assertEquals("N", robot.getDirection());
  }

  @Test
  public void fromNorthMoveForwardHitWallSwe() {
    Robot robot = new Robot(new Point(3,5), "N");
    Point newPosition = robot.move("G");

    Point expectedPosition = new Point(3,5);

    assertEquals(expectedPosition, newPosition);
    assertEquals("N", robot.getDirection());
  }

  @Test
  public void fromNorthMoveForwardHitWallEng() {
    Robot robot = new Robot(new Point(3,5), "N");
    Point newPosition = robot.move("F");

    Point expectedPosition = new Point(3,5);

    assertEquals(expectedPosition, newPosition);
    assertEquals("N", robot.getDirection());
  }

  @Test
  public void fromSouthMoveForwardSwe() {
    Robot robot = new Robot(new Point(3,3), "S");
    Point newPosition = robot.move("G");

    Point expectedPosition = new Point(3,2);

    assertEquals(expectedPosition, newPosition);
    assertEquals("S", robot.getDirection());
  }

  @Test
  public void fromSouthMoveForwardEng() {
    Robot robot = new Robot(new Point(3,3), "S");
    Point newPosition = robot.move( "F");

    Point expectedPosition = new Point(3,2);

    assertEquals(expectedPosition, newPosition);
    assertEquals("S", robot.getDirection());
  }

  @Test
  public void fromSouthMoveForwardHitWallSwe() {
    Robot robot = new Robot(new Point(3,1), "S");
    Point newPosition = robot.move("G");

    Point expectedPosition = new Point(3,1);

    assertEquals(expectedPosition, newPosition);
    assertEquals("S", robot.getDirection());
  }

  @Test
  public void fromSouthMoveForwardHitWallEng() {
    Robot robot = new Robot(new Point(3,1), "S");
    Point newPosition = robot.move("F");

    Point expectedPosition = new Point(3,1);

    assertEquals(expectedPosition, newPosition);
    assertEquals("S", robot.getDirection());
  }

  @Test
  public void fromEastMoveForwardSwe() {
    Robot robot = new Robot(new Point(3,3), "Ö");
    Point newPosition = robot.move("G");

    Point expectedPosition = new Point(4,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("Ö", robot.getDirection());
  }

  @Test
  public void fromEastMoveForwardEng() {
    Robot robot = new Robot(new Point(3,3), "Ö");
    Point newPosition = robot.move("F");

    Point expectedPosition = new Point(4,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("Ö", robot.getDirection());
  }

  @Test
  public void fromEastMoveForwardHitWallSwe() {
    Robot robot = new Robot(new Point(5,3), "Ö");
    Point newPosition = robot.move("G");

    Point expectedPosition = new Point(5,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("Ö", robot.getDirection());
  }

  @Test
  public void fromEastMoveForwardHitWallEng() {
    Robot robot = new Robot(new Point(5,3), "Ö");
    Point newPosition = robot.move("F");

    Point expectedPosition = new Point(5,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("Ö", robot.getDirection());
  }

  @Test
  public void fromWestMoveForwardSwe() {
    Robot robot = new Robot(new Point(3,3), "V");
    Point newPosition = robot.move("G");

    Point expectedPosition = new Point(2,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("V", robot.getDirection());
  }

  @Test
  public void fromWestMoveForwardEng() {
    Robot robot = new Robot(new Point(3,3), "V");
    Point newPosition = robot.move("F");

    Point expectedPosition = new Point(2,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("V", robot.getDirection());
  }

  @Test
  public void fromWestMoveForwardHitWallSwe() {
    Robot robot = new Robot(new Point(1,3), "V");
    Point newPosition = robot.move("G");

    Point expectedPosition = new Point(1,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("V", robot.getDirection());
  }

  @Test
  public void fromWestMoveForwardHitWallEng() {
    Robot robot = new Robot(new Point(1,3), "V");
    Point newPosition = robot.move("F");

    Point expectedPosition = new Point(1,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("V", robot.getDirection());
  }

  //Left
  @Test
  public void fromNorthMoveLeftSwe() {
    Robot robot = new Robot(new Point(3,3), "N");
    Point newPosition = robot.move("V");

    Point expectedPosition = new Point(2,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("V", robot.getDirection());
  }

  @Test
  public void fromNorthMoveLeftEng() {
    Robot robot = new Robot(new Point(3,3), "N");
    Point newPosition = robot.move("L");

    Point expectedPosition = new Point(2,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("V", robot.getDirection());
  }

  @Test
  public void fromNorthMoveLeftHitWallSwe() {
    Robot robot = new Robot(new Point(1,3), "N");
    Point newPosition = robot.move("V");

    Point expectedPosition = new Point(1,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("V", robot.getDirection());
  }

  @Test
  public void fromNorthMoveLeftHitWallEng() {
    Robot robot = new Robot(new Point(1,3), "N");
    Point newPosition = robot.move("L");

    Point expectedPosition = new Point(1,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("V", robot.getDirection());
  }

  @Test
  public void fromSouthMoveLeftSwe() {
    Robot robot = new Robot(new Point(3,3), "S");
    Point newPosition = robot.move("V");

    Point expectedPosition = new Point(4,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("Ö", robot.getDirection());
  }

  @Test
  public void fromSouthMoveLeftEng() {
    Robot robot = new Robot(new Point(3,3), "S");
    Point newPosition = robot.move("L");

    Point expectedPosition = new Point(4,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("Ö", robot.getDirection());
  }

  @Test
  public void fromSouthMoveLeftHitWallSwe() {
    Robot robot = new Robot(new Point(5,3), "S");
    Point newPosition = robot.move("V");

    Point expectedPosition = new Point(5,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("Ö", robot.getDirection());
  }

  @Test
  public void fromSouthMoveLeftHitWallEng() {
    Robot robot = new Robot(new Point(5,3), "S");
    Point newPosition = robot.move("L");

    Point expectedPosition = new Point(5,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("Ö", robot.getDirection());
  }

  @Test
  public void fromEastMoveLeftSwe() {
    Robot robot = new Robot(new Point(3,3), "Ö");
    Point newPosition = robot.move("V");

    Point expectedPosition = new Point(3,4);

    assertEquals(expectedPosition, newPosition);
    assertEquals("N", robot.getDirection());
  }

  @Test
  public void fromEastMoveLeftEng() {
    Robot robot = new Robot(new Point(3,3), "Ö");
    Point newPosition = robot.move("L");

    Point expectedPosition = new Point(3,4);

    assertEquals(expectedPosition, newPosition);
    assertEquals("N", robot.getDirection());
  }

  @Test
  public void fromEastMoveLeftHitWallSwe() {
    Robot robot = new Robot(new Point(3,5), "Ö");
    Point newPosition = robot.move("V");

    Point expectedPosition = new Point(3,5);

    assertEquals(expectedPosition, newPosition);
    assertEquals("N", robot.getDirection());
  }

  @Test
  public void fromEastMoveLeftHitWallEng() {
    Robot robot = new Robot(new Point(3,5), "Ö");
    Point newPosition = robot.move("L");

    Point expectedPosition = new Point(3,5);

    assertEquals(expectedPosition, newPosition);
    assertEquals("N", robot.getDirection());
  }

  @Test
  public void fromWestMoveLeftSwe() {
    Robot robot = new Robot(new Point(3,3), "V");
    Point newPosition = robot.move("V");

    Point expectedPosition = new Point(3,2);

    assertEquals(expectedPosition, newPosition);
    assertEquals("S", robot.getDirection());
  }

  @Test
  public void fromWestMoveLeftEng() {
    Robot robot = new Robot(new Point(3,3), "V");
    Point newPosition = robot.move("L");

    Point expectedPosition = new Point(3,2);

    assertEquals(expectedPosition, newPosition);
    assertEquals("S", robot.getDirection());
  }

  @Test
  public void fromWestMoveLeftHitWallSwe() {
    Robot robot = new Robot(new Point(3,1), "V");
    Point newPosition = robot.move("V");

    Point expectedPosition = new Point(3,1);

    assertEquals(expectedPosition, newPosition);
    assertEquals("S", robot.getDirection());
  }

  @Test
  public void fromWestMoveLeftHitWallEng() {
    Robot robot = new Robot(new Point(3,1), "V");
    Point newPosition = robot.move("L");

    Point expectedPosition = new Point(3,1);

    assertEquals(expectedPosition, newPosition);
    assertEquals("S", robot.getDirection());
  }

  //Right
  @Test
  public void fromNorthMoveRightSwe() {
    Robot robot = new Robot(new Point(3,3), "N");
    Point newPosition = robot.move("H");

    Point expectedPosition = new Point(4,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("Ö", robot.getDirection());
  }

  @Test
  public void fromNorthMoveRightEng() {
    Robot robot = new Robot(new Point(3,3), "N");
    Point newPosition = robot.move("R");

    Point expectedPosition = new Point(4,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("Ö", robot.getDirection());
  }

  @Test
  public void fromNorthMoveRightHitWallSwe() {
    Robot robot = new Robot(new Point(5,3), "N");
    Point newPosition = robot.move("H");

    Point expectedPosition = new Point(5,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("Ö", robot.getDirection());
  }

  @Test
  public void fromNorthMoveRightHitWallEng() {
    Robot robot = new Robot(new Point(5,3), "N");
    Point newPosition = robot.move("R");

    Point expectedPosition = new Point(5,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("Ö", robot.getDirection());
  }

  @Test
  public void fromSouthMoveRightSwe() {
    Robot robot = new Robot(new Point(3,3), "S");
    Point newPosition = robot.move("H");

    Point expectedPosition = new Point(2,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("V", robot.getDirection());
  }

  @Test
  public void fromSouthMoveRightEng() {
    Robot robot = new Robot(new Point(3,3), "S");
    Point newPosition = robot.move("R");

    Point expectedPosition = new Point(2,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("V", robot.getDirection());
  }

  @Test
  public void fromSouthMoveRightHitWallSwe() {
    Robot robot = new Robot(new Point(1,3), "S");
    Point newPosition = robot.move("H");

    Point expectedPosition = new Point(1,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("V", robot.getDirection());
  }

  @Test
  public void fromSouthMoveRightHitWallEng() {
    Robot robot = new Robot(new Point(1,3), "S");
    Point newPosition = robot.move("R");

    Point expectedPosition = new Point(1,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("V", robot.getDirection());
  }

  @Test
  public void fromEastMoveRightSwe() {
    Robot robot = new Robot(new Point(3,3), "Ö");
    Point newPosition = robot.move("H");

    Point expectedPosition = new Point(3,2);

    assertEquals(expectedPosition, newPosition);
    assertEquals("S", robot.getDirection());
  }

  @Test
  public void fromEastMoveRightEng() {
    Robot robot = new Robot(new Point(3,3), "Ö");
    Point newPosition = robot.move("R");

    Point expectedPosition = new Point(3,2);

    assertEquals(expectedPosition, newPosition);
    assertEquals("S", robot.getDirection());
  }

  @Test
  public void fromEastMoveRightHitWallSwe() {
    Robot robot = new Robot(new Point(3,1), "Ö");
    Point newPosition = robot.move("H");

    Point expectedPosition = new Point(3,1);

    assertEquals(expectedPosition, newPosition);
    assertEquals("S", robot.getDirection());
  }

  @Test
  public void fromEastMoveRightHitWallEng() {
    Robot robot = new Robot(new Point(3,1), "Ö");
    Point newPosition = robot.move("R");

    Point expectedPosition = new Point(3,1);

    assertEquals(expectedPosition, newPosition);
    assertEquals("S", robot.getDirection());
  }

  @Test
  public void fromWestMoveRightSwe() {
    Robot robot = new Robot(new Point(3,3), "V");
    Point newPosition = robot.move("H");

    Point expectedPosition = new Point(3,4);

    assertEquals(expectedPosition, newPosition);
    assertEquals("N", robot.getDirection());
  }

  @Test
  public void fromWestMoveRightEng() {
    Robot robot = new Robot(new Point(3,3), "V");
    Point newPosition = robot.move("R");

    Point expectedPosition = new Point(3,4);

    assertEquals(expectedPosition, newPosition);
    assertEquals("N", robot.getDirection());
  }

  @Test
  public void fromWestMoveRightHitWallSwe() {
    Robot robot = new Robot(new Point(3,5), "V");
    Point newPosition = robot.move("H");

    Point expectedPosition = new Point(3,5);

    assertEquals(expectedPosition, newPosition);
    assertEquals("N", robot.getDirection());
  }

  @Test
  public void fromWestMoveRightHitWallEng() {
    Robot robot = new Robot(new Point(3,5), "V");
    Point newPosition = robot.move("R");

    Point expectedPosition = new Point(3,5);

    assertEquals(expectedPosition, newPosition);
    assertEquals("N", robot.getDirection());
  }

  //Several
  @Test
  public void moveSeveralStepsSwe() {
    Robot robot = new Robot(new Point(1,2), "N");
    Point newPosition = robot.move("HGHGGHGHG");

    Point expectedPosition = new Point(1,3);

    assertEquals(expectedPosition, newPosition);
    assertEquals("N", robot.getDirection());
  }

  @Test
  public void moveSeveralStepsEng() {
    Robot robot = new Robot(new Point(4,2), "Ö");
    Point newPosition = robot.move("FFLRR");

    Point expectedPosition = new Point(5,2);

    assertEquals(expectedPosition, newPosition);
    assertEquals("S", robot.getDirection());
  }
}
