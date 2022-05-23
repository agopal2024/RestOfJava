import java.awt.Color;
import java.util.Scanner;

import graphics.Canvas;

public class Program {
    // Canvas GUI instance providing the drawing area on which to plot the functions
    private static Canvas canvas;

    public static void main(String[] args) {
        
        // Create the canvas instance, set its range to x:[-360, 360] and y:[-240, 240] then 
        // open it on the screen. Use canvas.plot(pX, pY) to plot a point at the (pX, pY) coords
        canvas = new Canvas();
        Scanner input = new Scanner(System.in);
        System.out.print("function?> ");
        String j = input.nextLine();
        canvas.setRange(-360, -240, 360, 240);
        canvas.open();

        // Draw a short red diagonal on the canvas
        canvas.pause();
        canvas.setColor(Color.red);
<<<<<<< HEAD
=======
        
        
        MyFunction fSine = new MyFunction()
       	{
        	public int calcY(int x)
        	{
        		return (int) (200* Math.sin(Math.PI * x /360));
        	}
        	public Color getColor()
        	{
        		return Color.ORANGE;
        	}
  		};
  		
  		MyFunction fQuadratic = new MyFunction()
  		{
  			public int calcY(int x)
  			{
  				return ((x-200)*(x+200))/250;
  			}
  			public Color getColor()
  			{
  				return Color.BLUE;
  			}
  		};
  		
  		MyFunction fLog = new MyFunction()
  		{
  			public int calcY(int x)
  			{
  				return 20 * (int) Math.log(x);
  			}
  			public Color getColor()
  			{
  				return Color.GREEN;
  			}
  		};
  		
  		MyFunction fCubic = new MyFunction()
  		{
  			public int calcY(int x)
  			{
  				return (x*x*x)/200000;
  			}
  			public Color getColor()
  			{
  				return Color.PINK;
  			}
  		};
  		
  		MyFunction stepFun = new MyFunction()
  		{
  			public int calcY(int x)
  			{
  				return (x <- 100) ? (-100) : (x > 100 ? (100) : (x));
  			}
  			public Color getColor()
  			{
  				return Color.MAGENTA;
  			}
  		};
        
>>>>>>> branch 'main' of https://github.com/agopal2024/RestOfJava.git
        /*
        MyFunction fSine  = (x) -> {return (int) (200* Math.sin(Math.PI * x /360));};
        MyFunction fQuadratic = (x) -> {return ((x-200)*(x+200))/250;};
        MyFunction fLog = (x) -> {return 20 * (int) Math.log(x);};
        MyFunction fCubic = (x) -> {return (x*x*x)/200000;};
        
<<<<<<< HEAD
        MyFunction [] functions = {fSine, fQuadratic, fLog, fCubic};
        
        */
       // plotFunctions(fSine);
       // plotFunctions(fQuadratic);
       // plotFunctions(fLog);
       // plotFunctions(fCubic);
        
        
        /*
        MyFunction [] functions = {sin, Quadratic, Log, Cubic};
        
        plotFunctions(functions);
=======
        plotFunctions(fSine);
        plotFunctions(fQuadratic);
        plotFunctions(fLog);
        plotFunctions(fCubic);
        */
        MyFunction [] func = {fSine, fQuadratic, fLog, fCubic, stepFun};
        
        plotFunctions(func);
        /*
        for (int i = -360; i < 360; i++) {
            canvas.plot(i, fSine.calcY(i));
            canvas.plot(i, fQuadratic.calcY(i));
            canvas.plot(i, fLog.calcY(i));
            canvas.plot(i, fCubic.calcY(i));
        }
>>>>>>> branch 'main' of https://github.com/agopal2024/RestOfJava.git
        */
        // Pause and close the canvas then terminate the program.
        canvas.pause();
        canvas.close();
    }
    
    public static void plotFunctions(MyFunction ... y)
    {
<<<<<<< HEAD
    	for(int i = 0; i < y.length; i++) {
    		for(int x = -360; x < 360; x++) {
        		canvas.plot(x, y[i].calcY(x));
        	}
    	}
    }
    
    public static void figureOut(String x)
    {

        MyFunction sin = new MyFunction () 
        {
        	public int calcY(int x) 
        	{
        		return (int) (200* Math.sin(Math.PI * x /360));
        	}
        		public Color getColor()
        		{
        			return Color.red;
        		}
        };
        
        MyFunction Quadratic = new MyFunction () 
        {
        	public int calcY(int x) {
        		 return ((x-200)*(x+200))/250;
        	}
        		public Color getColor()
        		{
        			return Color.MAGENTA;
        		}
        };
        
        MyFunction Log = new MyFunction () 
        {
        	public int calcY(int x) {
        		return 20 * (int) Math.log(x);
        	}
        		public Color getColor()
        		{
        			return Color.green;
        		}
        };
        
        MyFunction Cubic = new MyFunction () 
        {
        	public int calcY(int x) {
        		return (x*x*x)/200000;
        	}
        		public Color getColor()
        		{
        			return Color.cyan;
        		}
        };
        
        MyFunction stepFun = new MyFunction() {
        	public int calcY(int x)
        	{
        		return (x<- 100) ? (-100) : (x > 100 ? (100) : (x));
        	}
        	public Color getColor()
        	{
        		return Color.magenta;
        	}
        };
        
    	switch(x.toUpperCase())
    	{
    		case "S":
    			plotFunctions(sin);
    		case "Q":
    			plotFunctions(Quadratic);
    		case "L":
    			plotFunctions(Log);
    		case "C":
    			plotFunctions(Cubic);
    		case "T":
    			plotFunctions(stepFun);
    		case "":
    			break;
    	}
=======
    	for(int i = 0; i < y.length; i++)
    	{
    		for(int x  = -360; x < 360; x++)
        	{
        		canvas.plot(x,  y[i].calcY(x));
        	}
    	}
    	
>>>>>>> branch 'main' of https://github.com/agopal2024/RestOfJava.git
    }
}
