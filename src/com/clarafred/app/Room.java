package com.clarafred.app;

public interface Room {
  java.awt.Point getStartPosition();
  boolean contains(java.awt.Point position);
}
