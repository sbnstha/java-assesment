/*
Name: Sabin Shrestha
Student ID: 4604465
 Task 1
 */
package Clock;

public class Clock {

    //Declaring Variables
    private int hour;
    private int minutes;
    private int second;

    public Clock() {
        setHour(0);
        setminutes(0);
        setSecond(0);
    }

    //Constructor
    //Hour, Minutes and Seconds are set to h, m and s respectively.
    public Clock(int h, int m, int s) {
        this.hour = h;
        this.minutes = m;
        this.second = s;
    }

    public final void setHour(int hour) {

        if (hour >= 0 && hour < 24) {   //h is dropped into range[0,23]
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public final void setminutes(int minutes) {
        if (minutes >= 0 && minutes < 60) { //m is dropped into range[0,59].
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
    }

    public final void setSecond(int second) {

        if (second >= 0 && second < 60) {   //s is dropped into range [0,59].
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    //getter
    public final int getHour() {    //returns the current value of hour.
        return hour;
    }

    public final int getMinutes() { //returns the current value of minute.
        return minutes;
    }

    public final int getSecond() {  //returns the current value of second.
        return second;
    }

    public String toString() {
        //To return a string in hh:mm:ss format
        return String.format("%02d", this.hour) + ":"
                + String.format("%02d", this.minutes) + ":"
                + String.format("%02d", this.second);

    }

    public void addSecond(int s) { //add s seconds to the current time, and adjust minute and hour accordingly, where s can be negative.
        int temp = this.second + s;
        if (temp > 59) {

            while (temp > 59) {
                addMinutes(1);
                temp = temp - 60;

            } //end While
            this.second = temp;

        } // end if  
        else if (temp < 0) {
            while (temp < 0) {
                addMinutes(-1);
                temp = temp + 60;

            } //end While
            this.second = temp;

        } else // end else if
        {
            this.second = second + s;
        }

    } // end addsecond

    public void addMinutes(int m) {    //adds m minutes to the current time, and adjust hour accordingly, where m can be negative value.
        int temp = this.minutes + m;
        if (temp > 59) {

            while (temp > 59) {
                addHours(1);
                temp = temp - 60;

            } //end While
            this.minutes = temp;

        } // end if  
        else if (temp < 0) {
            while (temp < 0) {
                addHours(-1);
                temp = temp + 60;

            } //end While
            this.minutes = temp;

        } else // end else if
        {
            this.minutes = minutes + m;
        }

    } // end addminutes()

    public void addHours(int h) {  //adds h to the current time
        int temp = this.hour + h;
        if (temp > 23) {

            while (temp > 23) {
                temp = temp - 24;

            } //end While
            this.hour = temp;

        } // end if  
        else if (temp < 0) {
            while (temp < 0) {

                temp = temp + 24;

            } //end While
            this.hour = temp;

        } else // end else if
        {
            this.hour = hour + h;
        }

    } // end add Hours

}
