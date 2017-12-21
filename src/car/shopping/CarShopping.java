/*
 * To change this license header, choose License Headers in Project
Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.shopping;
import java.util.Scanner;
/**
 *Jonathan Tong 
 * Mr. Larrubia 
 * period 2 
 * lab Car Shopping 
 * @author 18342
 */
public class CarShopping 

    /**
     * @param args the command line arguments
     */
  
{
   private static Scanner in = new Scanner(System.in);

   public static void main(String[] args)
   {
      int totalCost = 0;
      totalCost += base();
      totalCost += automaticWindows();
      totalCost += remoteKeylessEntry ();
      totalCost += OnStarSystem ();
      totalCost += antiLockBrakes ();
      totalCost += TelescopingSteeingwheel();
      totalCost += sunroof();
      totalCost += coldweather();
      totalCost += gpsNavigation();
      totalCost += spoiler();
      totalCost += snorkel();
      totalCost += ac();
       System.out.println(totalCost);
      
      //TODO: call methods that you write for each feature
      //TODO: print the total cost of the vehicle
   }
   
   public static int base()
   {
      System.out.println("Our inventory:");
      System.out.println("Model 1 - $15,000");
      System.out.println("Model 2 - $24,000");
      System.out.println("Model 3 - $40,000");
      System.out.println("Which base model did the customer choose?"
                         + "(enter full model name) >" );
      String model = in.nextLine();
      
      if(model.equalsIgnoreCase("Model 1"))
         return 15000;
      
      else if (model.equalsIgnoreCase("Model 2"))
        return 24000;          
   
      else if (model.equalsIgnoreCase("Model 3"))
       return 40000;
      
  return 0;     
   }
   
   public static int automaticWindows()
   {
       System.out.print("Automatic Windows for $500? (y/n) > ");
       String window = in.nextLine();
       if (window.equalsIgnoreCase("y"))
           return 500;
       else
           return 0;
   }
   
   public static int remoteKeylessEntry(){
       System.out.print("Remote Keyless Entry for $1000? (y/n)");
       String remoteKeylessEntry = in.nextLine();
       if (remoteKeylessEntry.equalsIgnoreCase("y"))
           return 1000;
       else
           return 0;
   }
    public static int OnStarSystem(){
       System.out.print("OnStarSystem for $1000? (y/n)");
       String OnStarSystem = in.nextLine();
       if (OnStarSystem.equalsIgnoreCase("y"))
           return 1000;
       else
           return 0;      
   }
     public static int antiLockBrakes(){
       System.out.print("antiLockBrakes for $500? (y/n)");
       String antiLockBrakes = in.nextLine();
       if (antiLockBrakes.equalsIgnoreCase("y"))
           return 500;
       else
           return 0;      
   }
       public static int TelescopingSteeingwheel(){
       System.out.print("TelescopingSteeingwheel for $1000? (y/n)");
       String TelescopingSteeingwheel = in.nextLine();
       if (TelescopingSteeingwheel.equalsIgnoreCase("y"))
           return 1000;
       else
           return 0;      
   }
       public static int sunroof(){
       System.out.print("sunroof for $800? (y/n)");
       String sunroof = in.nextLine();
       if (sunroof.equalsIgnoreCase("y"))
           return 800;
       else
           return 0;      
   }
     public static int coldweather(){
       System.out.print("coldweather for $1500? (y/n)");
       String coldweather = in.nextLine();
       if (coldweather.equalsIgnoreCase("y"))
           return 1500;
       else
           return 0;  
     }
      public static int gpsNavigation(){
       System.out.print("gpsNavigation for $750? (y/n)");
       String gpsNavigation = in.nextLine();
       if (gpsNavigation.equalsIgnoreCase("y"))
           return 750;
       else
           return 0;  
     }
  public static int spoiler(){
       System.out.print("spoiler for $10000? (y/n)");
       String spoiler = in.nextLine();
       if (spoiler.equalsIgnoreCase("y"))
           return 10000;
       else
           return 0;  
     }
   public static int snorkel(){
       System.out.print("snorkel for $1000? (y/n)");
       String snorkel = in.nextLine();
       if (snorkel.equalsIgnoreCase("y"))
           return 1000;
       else
           return 0;  
     }
   public static int ac(){
       System.out.print("AC for $1000? (y/n)");
       String ac = in.nextLine();
       if (ac.equalsIgnoreCase("y"))
           return 1000;
       else
           return 0;  
     }




}