package com.example.project;

public class Main 
{
    public static void main(String[] args) 
    {
        TriangleCollection t = new TriangleCollection(4, 2, 6);
        System.out.println(t.triangleCollectionInfo());
        System.out.println();
        t.shiftTriangles(2);
        System.out.println(t.triangleCollectionInfo());

    }   
}
