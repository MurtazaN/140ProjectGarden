
/**
 * To calculate how much soil and fill required in a garden
 *
 * @author - Murtaza
 * @version Final with Extracredit
 */
import java.util.Scanner;

public class ProjectGarden
{
   public static void main(String args[])
	    {
	        Scanner scan = new Scanner(System.in); // Decalring scan for user input
	        
	        System.out.println("Calculate Garden requirements");
	        
	        System.out.print("\nEnter Lenght of side of garden (feet):");
	        double side = scan.nextDouble();// Lenght of side in feet
	        System.out.print("Enter space between plants (feet):");
	        double spacing = scan.nextDouble();//space between plants
	        System.out.print("Enter depth of garden soil (feet):");
	        double soildepth = scan.nextDouble();//depth of garden soil
	        System.out.print("Enter depth of fill (feet):");
	        double filldepth = scan.nextDouble();//depth of fill
	        
	        double radius = side / 4;//radius
	        double circlebedarea = Math.PI * radius * radius;//circle bed area	        
	        double totalbedarea = side * side * soildepth;//total garden volume
	        double p,p1,soilarea;//plant/soil area
	        double f,f1,fillarea;//total fill area
	        
	        double q;//plants for semi circle
	        double x;//plants for circle
	        double s;//total plants in garden
	        
	        final double CUBIC_FEET_PER_SQUARE_YARD = 27;//cubic feet per square yard
	        
	        double volc = Math.PI * radius * radius * soildepth; //volume of circle
	        double volsc = volc / 2; //volume of semicircle
	        double volC = volc / CUBIC_FEET_PER_SQUARE_YARD;//volume of circle in yards
	        double volSc = volsc / CUBIC_FEET_PER_SQUARE_YARD;//volume ofsemicircle in yards
	        
	        p = volc + (4 * volsc);
	        p1 = p / CUBIC_FEET_PER_SQUARE_YARD;
	        
	        f = totalbedarea - p;
	        f1 = f / CUBIC_FEET_PER_SQUARE_YARD;
	        
	        x = circlebedarea /(spacing * spacing);
	        int plantsforcircle = (int)x;
	        
	        q = (x / 2);	        
	        int plantsforsemicircle = (int)q;
	        
	        s = plantsforcircle + (plantsforsemicircle * 4);
	        int totalplants = (int)s;//total plants
	        
	        double soilforcircle = Math.round(volC * 10) / 10.0;//new vol circle
	        double soilforsemicircle = Math.round(volSc * 10) / 10.0;//new vol semi
	        soilarea = Math.round(p1 * 10) / 10.0;//new soil area
	        fillarea = Math.round(f1 * 10) / 10.0;//new fill area
	        
	        System.out.println("\nRequirements");
	        
	        System.out.println("\nPlants in each semicircle garden: " + plantsforsemicircle);
	        System.out.println("Plants in circle garden: " + plantsforcircle);
	        System.out.println("Total plants in garden: " + totalplants);
	        System.out.println("Soil for each semicircle garden: " + soilforsemicircle + " cubic yards");
	        System.out.println("Soil for circle garden: " + soilforcircle + " cubic yards");	        
	        System.out.println("Total Soil for garden is: " + soilarea + " cubic yards");
	        System.out.println("Total fill for garden is: " + fillarea + " cubic yards");
	        
	    }
}
