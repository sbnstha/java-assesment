/*
Sabin Shrestha
s4604465
 Final Assesment
*/

import Clock.Clock;
import TimeCalendar.*;
import TimeZone.TimeZone;

public class TimeManagement {

    public static void main(String[] args) {
        
        //Defining new constants for Classes.
        Clock Tm = new Clock();
        TimeCalendar Cl = new TimeCalendar();
        TimeZone Tz = new TimeZone();

        System.out.println("-------------------  Output for Task 1 -----------------------------\n");            
        System.out.println(Tm.toString());  //00:00:00 is the output for this since hours, minutes and second are declared 0 at first.
        
        Tm.addHours(2);
        System.out.println(Tm.toString());
        //02:00;00 will be the output as 2 hours is added to 00:00:00

        Tm.addMinutes(63);
        System.out.println(Tm.toString());
        //03:03:00 will be the output as 63 minutes is added to 02:00:00 where hour is adjusted accordingly.

        Tm.addSecond(400);
        System.out.println(Tm.toString());
        //03:09:40 will be the output as 400 seconds is added to 03:03:00 where hour and minute is adjusted accordingly.
        
        System.out.println("\n");   
        System.out.println((char)27 + "[34m-------------------  Output for Task 2  -----------------------------\n");
        System.out.println("\n");
        
        //In Task 2 Output, all times are displayed as 00:00:00 because the intial value of hour, minute and second are set to 0 in 'Clock.java'
        Cl.nextday();
        System.out.println(Cl.toString());  //23/07/1998

        Cl.addmonth(15);
        System.out.println(Cl.toString());  //Prints 23/10/1999 since Month is incresed by 15 and year is adjusted accordingly.

        Cl.addyear(21);
        System.out.println(Cl.toString());  //Prints 23/10/2020 since Year is increased by 21.
        
        
        
        System.out.println("\n");
        System.out.println((char)27 + "[35m-------------------  Output for Task 3 -----------------------------\n");
        System.out.println("\n");
        
        Tz.setTimezone(5);
        System.out.println(Tz.toString()); /*00:00:00 UTC + 05:00 is the output since the value of hour,
         minute and second is 0 initally and timezone is increased by 5.
        */
        
        Clock clock1 = new Clock(5, 6, 0);  /*New Constant is defined where the value of hour, minute and second
        are set to 5, 6 and 0 respectively.
        */
           

        TimeZone tz2 = new TimeZone(7, clock1);
        System.out.println(tz2.toString()); //05:06:00 UTC +07:00 is the output since timeZone is increased by 7.
        
   
        
    }

}
