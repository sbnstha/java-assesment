/*
Sabin Shrestha
s4604465
Task 2
 */
package TimeCalendar;


import Clock.Clock;

public class TimeCalendar extends Clock {   //Here, the class is extended to Clock.
    
    //Declaring Variables
    private int year;
    private int month;
    private int day;
    public static int[] daysPerMonth = new int[]{-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};   //Number of Days in a month from January to December.

    public TimeCalendar() {
        setYear(1998);  //initial value of year is set to 1998.
        setMonth(07);   //initial value of month is set to 07.
        setDay(22); //initial value of day is set to 22.

    } // end TimeCalender
    
 
    public TimeCalendar(int y, int m, int d, Clock Clock) { //Here, Year, Month and Days are set to y, m and d respectively.
        setYear(y);
        setMonth(m);
        setDay(d);
        super.setHour(Clock.getHour()); //Clock. getHour() imports the value of Hour from 'Clock.java' file which is 0.
        super.addMinutes(Clock.getMinutes()); //Clock. getMinutes() imports the value of Minutes from 'Clock.java' file which is 0.
        super.addSecond(Clock.getSecond()); ////Clock. getSecond() imports the value of Second from 'Clock.java' file which is 0.

    } // end TimeCalender
    
    //Getter
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    
    //Setter
    public void setYear(int y) {
        if (y >= 1 && y<=3000) {    //Year is Dropped into range [1,3000]
            this.year = y;
        } else {
            this.year = 1;
        }

    } // end styear()

    public void setMonth(int m) {
        if (m >= 1 && m <= 12) {
            this.month = m;
        } else {
            this.month = 1;
        }

    } // end setmonth

    public void setDay(int d) {
        if (d > 1 && d < 31) {
            this.day = d;
        } else {
            this.day = 1;
        }

    } // end setday()

    public String toString() {
        return String.format("%02d", this.day) + "/" 
             + String.format("%02d", this.month) + "/" 
                + String.format("%02d", this.year) + " " + super.toString();    //to print the output in dd/mm/yyyy format

    } // end ToString()

    public static boolean isLeapYear(int year) {

        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;   //for leap year.

    } // end leapyear()

    public void nextday() { //adds d days to the current data, and month and year can be adjusted. Also, d can only be a positive value.

        int days = this.daysPerMonth[this.month];

        if (this.month == 2 && this.isLeapYear(this.year)) {
            days++;

        } // end if
        this.day++;
        if (this.day > days) {
            this.day = 1;
            this.month++;
            if (this.month > 12) {
                this.month = 1;
                this.year++;
            } // end if

        } // end if

    } // end nextday()

    public void addmonth(int m) {   //adds m month to the current date where year y can be adjusted. Also, m can only be a positive value.

        while (m-- > 0) {   //1
            int days = daysPerMonth[this.month];
            while (days-- > 0) {   //2
                this.nextday();
            } // end while() 2  

        } //end while()1

    } // end month()

    public void addyear(int y) {    //adds y year to the current date.

        this.year = this.year + y;
    } // end year()
      
} // end class
