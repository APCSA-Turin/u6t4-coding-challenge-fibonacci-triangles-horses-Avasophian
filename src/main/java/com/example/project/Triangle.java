package com.example.project;

public class Triangle {
    // array of Point objects
    private Point[] vertices;
    
    // Constructor: initializes the vertices array
    // to contain the three Point objects
    public Triangle(Point p1, Point p2, Point p3) 
    {
      this.vertices = new Point[3];
      vertices[0] = p1;
      vertices[1] = p2;
      vertices[2] = p3;
    }

    public void setVertex(int index, int x, int y)
    {
        vertices[index].setX(x);
        vertices[index].setY(y);
    }

    public Point[] getVertices()
    {
      return vertices;
    }
    
    public void incrementXAtIndex(int index, int num)
    {
       vertices[index].incrementX(num);
    }
    public void incrementYAtIndex(int index, int num)
    {
       vertices[index].incrementY(num);
    }
    // Returns the perimeter of the Triangle
    // HINT: use the distanceTo method that you wrote in the Point class
    public double perimeter() 
    {
      double d1 = (vertices[0].distanceTo(vertices[1]));
      double d2 = (vertices[1].distanceTo(vertices[2]));
      double d3 = (vertices[2].distanceTo(vertices[0]));

      return d1 + d2 + d3;
    }
  
    // Returns a String with the three vertices that make up the Triangle;
    // if the vertices are the points (6, 10), (11, 15), and (18, 7),
    // this method should return: "[(6, 10), (11, 15), (18, 7)]"
    public String triangleInfo() {
      String stringToReturn = "[(" + vertices[0].getX() + ", " + vertices[0].getY() + "), ";
      stringToReturn += "(" + vertices[1].getX() + ", " + vertices[1].getY() + "), ";
      stringToReturn += "(" + vertices[2].getX() + ", " + vertices[2].getY() + ")]";
      return stringToReturn;
    }
  }
  