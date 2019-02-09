
/**
 * Write a description of class ExtraCr here.
 *
 * @author- Murtaza
 * @version Extra credit
 */
import java.util.Scanner;

public class ExtraCr
{
   public static void main(String args[])
	    {
	        Scanner scan = new Scanner(System.in); // Decalring scan for user input
	        
	        System.out.println("Enter Lenght of side of garden (feet):");
	        double a = scan.nextDouble();// Lenght of side in feet
	        System.out.println("Enter space between plants (feet):");
	        double b = scan.nextDouble();//space between plants
	        System.out.println("Enter depth of garden soil (feet):");
	        double c = scan.nextDouble();//depth of garden soil
	        System.out.println("Enter depth of fill (feet):");
	        double d = scan.nextDouble();//depth of fill
	        
	        double r = a / 4;//radius
	        double v = Math.PI * r * r;//circle bed area	        
	        double t = a * a * c;//total garden volume
	        double p,p1;//plant/soil area
	        double f,f1;//total fill area
	        
	        double q;//plants for semi circle
	        double x;//plants for circle
	        double s;//total plants in garden
	        
	        final double z = 27;//cubic feet per square yard
	        
	        double volc = Math.PI * r * r * c; //volume of circle
	        double volsc = volc / 2; //volume of semicircle
	        double volC = volc / z;//volume of circle in yards
	        double volSc = volsc / z;//volume ofsemicircle in yards
	        
	        p = volc + (4 * volsc);
	        p1 = p / z;
	        f = t - p;
	        f1 = f / z;
	        
	        x = v /(b * b);
	        int x1 = (int)x;
	        
	        q = (x / 2);
	        int q1 = (int)q;
	        
	        s = x1 + (q1 * 4);
	        int s1 = (int)s;//total plants
	        
	        double VolC = Math.round(volC * 10) / 10.0;//new vol circle
	        double VolSc = Math.round(volSc * 10) / 10.0;//new vol semi
	        double p2 = Math.round(p1 * 10) / 10.0;//new soil area
	        double f2 = Math.round(f1 * 10) / 10.0;//new fill area
	        
	        System.out.println("Plants in each semicircle garden: " + q1);
	        System.out.println("Plants in circle garden: " + x1);
	        System.out.println("Total plants in garden: " + s1);
	        System.out.println("Soil for each semicircle garden: " + VolSc + " cubic yards");
	        System.out.println("Soil for circle garden: " + VolC + " cubic yards");	        
	        System.out.println("Total Soil for garden is: " + p2 + " cubic yards");
	        System.out.println("Total fill for garden is: " + f2 + " cubic yards");
	        
	    }
}
