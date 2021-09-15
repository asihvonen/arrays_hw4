package com.company;

public class Main
{
    public static void main(String[] args)
    {
	int[] values = {5, 4, -7, -2, -1};
	int[] newValues = new int [values.length];
	for (int i = 0; i < values.length; i++)
	    newValues[i] = values[values.length - 1 - i];
    for (int v: newValues)
        System.out.print (v + " ");
    }
}
