package com.example.project;


public class ArrayPrinter 
{
    private ArrayPrinter(){}

    public static String formatIntNicely(int[] printList)
    {
        String stringtoPrint = "[";
        for (int num : printList)
        {
            stringtoPrint += num + ", ";
        }
        stringtoPrint = stringtoPrint.substring(0, stringtoPrint.length() - 2);
        stringtoPrint += "]";
        return stringtoPrint;
    }

}
