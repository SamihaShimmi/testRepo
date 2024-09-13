/*
Developed by Samiha
Start Date : 01/28/2021
*/
package Shimmi;

import java.lang.Math;

public class Line
{

    private int x1, y1, x2, y; //coordinates of the line
    //Constructor receives 4 integers which are the Shimmi.Line's start and end points.
    public Line(int xOne, int yOne, int xTwo, int yTwo) throws Exception {
        //if not in range exception
        if (xOne < 0 || xOne > 639 || yOne < 0 || yOne > 479 || xTwo > 639 || xTwo < 0 || yTwo > 639 || yTwo < 0)
        {
            throw new Exception("Java Result:88 \n");
        }
        else {
            setXOne(xOne);
            setYOne(yOne);
            setXTwo(xTwo);
            setYTwo(yTwo);

        }

    } // end constructor

    //method draw() calls another method called drawLine(), which draws the line
    public void draw()
    {
        drawLine(x1, y1, x2, y2);
    }

    //method drawLine() simulates drawing of a line for console mode.
    private void drawLine(int x1, int y1, int x2, int y2)
    {
        System.out.println("In drawline - Draw a line from x of " + x1 + " and y of " + y1 );
        System.out.println("to x of " + x2 + " and y of " + y2 + " SUCCESS");
    }

    //Method setLine() allows user to change the points of the already existing Shimmi.Line.
    public void setLine(int xOne, int yOne, int xTwo, int yTwo) throws Exception
    {
        setXOne(xOne);
        setYOne(yOne);
        setXTwo(xTwo);
        setYTwo(yTwo);
    }

    // These methods sets values of x,y and throws exception if the values are not in range
    public void setXOne(int xOne) throws Exception
    {
        if (xOne < 0 || xOne > 639)
            throw new Exception("Value " + Integer.toString(xOne)+ " was out of bounds");
        else
            x1 = xOne;
    }
    public void setYOne(int yOne)throws Exception
    {
        if (yOne < 0 || yOne > 479)
            throw new Exception("Value" + Integer.toString(yOne)+ " was out of bounds");
        else
            y1 = yOne;
    }
    public void setXTwo(int xTwo)throws Exception
    {
        if (xTwo > 639 || xTwo < 0)
            throw new Exception("Value" + Integer.toString(xTwo)+ " was out of bounds");
        else
            x2 = xTwo;
    }
    public void setYTwo(int yTwo)throws Exception
    {
        if (yTwo > 479 || yTwo < 0)
            throw new Exception("Value" + Integer.toString(yTwo)+ " was out of bounds");
        else
            y2 = yTwo;
    }
    //Now for some "get" Access methods to get individual values
    public int getXOne()
    {  return x1;
    }
    public int getYOne()
    {
        return y1;
    }
    public int getXTwo()
    {
        return x2;
    }
    public int getYTwo()
    {
        return y2;
    }


    // New code added by Samiha

    //this method returns the length of the line
    public double getLength()
    {
        return Math.sqrt((this.x1-this.x2)*(this.x1-this.x2)+(this.y1-this.y2)*(this.y1-this.y2));
    }

    //this method returns the angle of the line which is defined as the angle between that line and the horizontal line that starts from (x1,y1)
    public double getAngle()
    {
        return Math.asin((this.y2-this.y1)/Math.sqrt((this.x1-this.x2)*(this.x1-this.x2)+(this.y1-this.y2)*(this.y1-this.y2)));
    }


    // constructor that accepts two points
    public Line(TwoDPoint point1, TwoDPoint point2) throws Exception
    {
            this(point1.x, point1.y, point2.x, point2.y);
    }

} // end class Shimmi.Line
line 1 added first 
    line 2 added second 
