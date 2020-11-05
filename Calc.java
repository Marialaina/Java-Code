import java.util.Scanner;
import java.lang.Math;

public class Calc {
    public static void main(String [] args){
        //Asking for name:
        Scanner gets = new Scanner(System.in); 
        System.out.println("Enter First and Last Name:");
        String name = gets.nextLine();
        String editedName = name.substring(0, 1).toUpperCase();
        System.out.println("Hello " + editedName + "!");
        
        String input = "";
        Boolean term = true; // can only be true or false
        
       String question = "You may choose a shape! C for circle, R for rectangle, T for triangle or CY for Cylinder.";
       System.out.println(question); 
       do{ 
           
           //Asking for shape:
           input = gets.next();
            
           double h;  //Multiple calculations require a height
            
            //Calculations depending on the shape that is chosen:
           switch (input){   
                //Calculation for rectangle:
                case "r":
                    int w,i,j; //height and width loop counters
                    System.out.println("Enter height: ");
                    h = gets.nextInt();
                    System.out.println("Enter width: ");
                    w = gets.nextInt();  
                    System.out.println("");
                    i = 1; j = 1;
                    while (i < h + 1){
                        while (j < w+1){
                            System.out.print("x");
                            j++;
                         }
                        j=1;
                        System.out.println("");
                        i++;
                    }
                    // Will only ask if they calculate the rectangle shape first
                    System.out.print("Would you like to calculate another shape? Enter y for yes, enter n for no");
                    input = gets.next().toLowerCase();
                    if(input.equals("n")){
                        term = false;
                        System.out.println("Thank you and goodbye, " + editedName + "!");
                    }
                    //end ask 
                    break;
                
                //Calculation for circle:
                case "c":
                    double c, r;
                    System.out.println("Enter the diameter to calculate radius and circumference!");
                    r = gets.nextDouble();
                    c = r/2;
                    System.out.println("Your radius is: "+ r);
                    System.out.println("Your circumference is: " + c);
                    //If user wants to choose another option:
                    System.out.println("Would you like to calculate another shape? Enter y for yes, enter n for no");
                    input = gets.next().toLowerCase();
                    if(input.equals("n")){
                        term = false;
                        System.out.println("Thank you and goodbye, " + editedName + "!");
                    }
                    //end ask 
                break;
                
                //Calculation for triangle:
                case "t":
                    double b, hyp;
                    System.out.println("Enter the base to calculate the hypotenus!");
                    b = gets.nextDouble();
                    System.out.println("Enter the height:");
                    h = gets.nextDouble();
                    hyp = Math.sqrt((b*b) + (h*h));
                    System.out.println("The hypotenus is: " + hyp + "!");
                    //If user wants to choose another option:
                    System.out.println("Would you like to calculate another shape? Enter y for yes, enter n for no");
                    input = gets.next().toLowerCase();
                    if(input.equals("n")){
                        term = false;
                        System.out.println("Thank you and goodbye, " + editedName + "!");
                    }
                    //end ask 
                break;
                
                //Calculation for Cylinder:
                case "cy":
                    double d,v;
                    System.out.println("Enter the height to calculate the volume!");
                    h = gets.nextDouble();
                    System.out.println("Enter the diameter:");
                    d = gets.nextDouble();
                    r = d/2;
                    v = Math.PI*(r*r*h);
                    System.out.println("Your volume is: " + "!");
                    //If they want to choose another calculation:
                    System.out.println("Would you like to calculate another shape? Enter y for yes, enter n for no");
                    input = gets.next().toLowerCase();
                    if(input.equals("n")){
                        term = false;
                        System.out.println("Thank you and goodbye, " + editedName + "!");
                    }
                    //end ask 
                
                
                //Just incase the user does not put in the following options:
                default:
                    String end = "Ooooops! Not an option! Do it again.";
                    System.out.println(end);
                    break;
         
             }
       } while(term);
       
    }
}

