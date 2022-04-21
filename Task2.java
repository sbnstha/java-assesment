package Task2;

/*
 * Name: Sabin Shrestha
 * Victoria University Sydney Campus
 * StudentID: s4604465
 * Lab Assesment Task 2
 */
import java.util.*;
import java.text.DecimalFormat;

public class Task2 {

    public static void main(String[] args) {
    final double CENTIMETRES_PER_INCH = 0.393701;
    final double GRAM_PER_POUND = 0.00220462;
    double Height_cms, Weight_gm;
    double Height,Weight;// height in inches and Weight in Pound
   
    String full_name, Hair_Color, Eye_Color, Nationality;
    String DOB;
    // Input for the user 
        Scanner input = new Scanner (System.in);
System.out.print("Enter your Full name: ");
        full_name=input.nextLine();
System.out.print("Enter your Hair Colour: ");
        Hair_Color=input.nextLine();
System.out.print("Enter your Eye Color: ");
        Eye_Color=input.nextLine();
System.out.print("Enter your DOB:");
        DOB=input.nextLine();//dd/mm/yyyy
System.out.print("Enter your Nationality: ");
        Nationality=input.nextLine();
System.out.print("Enter your Height in cms: ");
        Height_cms=input.nextDouble();
System.out.print("Enter your Weight in gram: ");
        Weight_gm=input.nextDouble();
    //Calculation Part
        Height=Height_cms*CENTIMETRES_PER_INCH;
        Weight=Weight_gm*GRAM_PER_POUND;
    // Display Part
DecimalFormat fmt1 = new DecimalFormat("00.###");
    
System.out.println(full_name +"\t"+ "Profile");
System.out.println("======================================================");
System.out.println("-Height:"+fmt1.format(Height)+"inches"+"\t"+"\t"+("-Haircolor:"+Hair_Color));
System.out.println("-Weight:"+fmt1.format(Weight)+"pounds"+"\t"+"\t"+("-Eye Color:"+Eye_Color));
System.out.println(("-DOB:"+DOB)+"\t"+"\t"+"\t"+("-Nationality:"+Nationality));

    }
    
}

