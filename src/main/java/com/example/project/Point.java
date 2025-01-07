package com.example.project;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
    
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }

    public void setX(int num)
    {
        x = num;
    }
    public void setY(int num)
    {
        y = num;
    }

    public void incrementX(int num)
    {
        x += num;
    }
    public void incrementY(int num)
    {
        y += num;
    }
    
    // Returns distance between this Point object and another Point object
    public double distanceTo(Point other) 
    {
      int x1 = x;
      int y1 = y;
      int x2 = other.getX();
      int y2 = other.getY();
      return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
  
    // Returns a string in the format: (x, y)
    public String pointInfo() {
      return "(" + x + ", " + y + ")";
    }
  }
  