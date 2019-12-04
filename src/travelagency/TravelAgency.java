
package travelagency;
import java.util.Scanner;

public class TravelAgency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        Travel[] travel = new Travel[5];
        
     try{
        for(int i =0; i<travel.length; i++){
           
            System.out.println("Please Enter Package Title: ");
            String Title = scan.nextLine();
            System.out.println("description : ");
            String Description = scan.nextLine();
            System.out.println("price for single person: ");
            double Price = scan.nextDouble();
            System.out.println("travel duration : ");
            double Duration = scan.nextDouble();
            scan.nextLine();
            travel[i] = new Travel(Title,Description,Price,Duration);
        
        }
 
       
        System.out.println("\n#####################\n");
        
       
         for(int i =0; i<travel.length; i++){
            
             System.out.println("packages title :"+ travel[i].getTitle());
             System.out.println("description :"+ travel[i].getDescription());
             System.out.println("price for single person : RM "+ travel[i].getPrice());
             System.out.println("travel duration :"+ travel[i].getDuration());     
            }
         
         }catch(Exception e){
          System.out.println("Invalid");
          System.out.println("Please Enter a Data Again!!!");
        }
    }
}


