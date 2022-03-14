package com.clarafred.app;

import java.awt.Point;
import java.util.Scanner;

public class Controller {
  private final Robot robot;

  public Controller() {
    this.robot = new Robot(new Point(1, 1), "N");
  }

  public void start() {
    Scanner scanner = new Scanner(System.in);
    String input = "";

    System.out.println("________________\n|__|__|__|__|__|\n|__|__|__|__|__|\n|__|__|__|__|__|\n|__|__|__|__|__|\n|__|__|__|__|__| Welcome to THE SQUARE\n");
    System.out.println("Choose one or more letters to move the robot.\n> English: F - forward   | L - left    | R - right\n> Swedish: G - gå framåt | V - vänster | H - höger  \n");
    printPosition();

    while (!input.equals("X")) {
      System.out.print("\nMake a move: ");

      input = scanner.nextLine().toUpperCase();
      boolean moveIsValid = moveValidation(input);
      if (!moveIsValid) {
        System.out.println("Invalid input.");
      } else {
        robot.move(input);
        printPosition();
      }
    }
  }

  public void printPosition() {
    System.out.println("Current position: " + (int) robot.getStartPosition().getX() + " " + (int) robot.getStartPosition().getY() + " " + robot.getDirection());
  }

  public boolean moveValidation(String input) {
    if (!input.equals("")) {
      if (input.matches("[FLR]*")) { return true; }
      if (input.matches("[GVH]*")) { return true; }
    }
    return false;
  }
}
