package com.clarafred.app;

import java.awt.Point;

public class Robot {
  private final Point position;
  private String direction;

  public Robot(Point p, String d) {
    this.position = p;
    this.direction = d;
  }

  public Point move(String s) {

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'G'|| s.charAt(i) == 'F') {

        switch (getDirection()) {
          case "N" -> goNorth();
          case "S" -> goSouth();
          case "Ö" -> goEast();
          case "V" -> goWest();
        }

      } else if (s.charAt(i) == 'V' || s.charAt(i) == 'L') {

        switch (getDirection()) {
          case "N" -> goWest();
          case "S" -> goEast();
          case "Ö" -> goNorth();
          case "V" -> goSouth();
        }

      } else if (s.charAt(i) == 'H' || s.charAt(i) == 'R') {

        switch (getDirection()) {
          case "N" -> goEast();
          case "S" -> goWest();
          case "Ö" -> goSouth();
          case "V" -> goNorth();
        }
      }
    }
    return position;
  }

  public void goNorth() {
    this.direction = "N";
    if (contains(position))
      position.move(position.x, position.y+1);
  }

  public void goSouth() {
    this.direction = "S";
    if (contains(position))
      position.move(position.x, position.y-1);
  }

  public void goEast() {
    this.direction = "Ö";
    if (contains(position))
      position.move(position.x+1, position.y);
  }

  public void goWest() {
    this.direction = "V";
    if (contains(position))
      position.move(position.x-1, position.y);
  }

  public Point getStartPosition() { return this.position; }

  public String getDirection() { return this.direction; }

  public boolean contains(Point position) {
    if (direction.equals("V") && position.x > 1 || direction.equals("Ö") && position.x < 5) {
      return true;
    } else if (direction.equals("S") && position.y > 1 || direction.equals("N") && position.y < 5) {
      return true;
    }
    return false;
  }
}
