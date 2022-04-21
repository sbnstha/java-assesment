/*
Name:Sabin Shrestha 
Student ID:4604465
 Task 3
*/
package TimeZone;

import Clock.Clock;


public class TimeZone extends Clock {   //Here, the class is extended to Clock.
        
	private int timezone;   //Declaring Variable.

	public TimeZone() {
		setTimezone(0); //Initial value of Timezone is set to 0.
	}
        
        //Constructor
	public TimeZone(int tz) {   //tz represents time zone.
		this.timezone = tz; 
	}
	
	public TimeZone(int tz, Clock clock) {
		this.timezone = tz;
		super.setHour(clock.getHour());  
		super.setminutes(clock.getMinutes());
		super.setSecond(clock.getSecond());
	}

	public final void setTimezone(int tz) {
		this.timezone = tz;
	}
	
	public final int getTimezone() {
		return this.timezone;
	}
	
	public final void changeTimeByTimezone(int tz) {
		int hour = super.getHour();
		int tmp = tz;
		while(tz > this.timezone) {
			tz--;
			hour++;
			if(hour >= 24)hour = 0;
		}
		while(tz < this.timezone) {
			tz++;
			hour--;
			if(hour == 0)hour = 24;
			if(hour < 0)hour = 23;
		}
		this.setTimezone(tmp);
		super.setHour((hour == 24 ? 0 : hour));
	}
	
	public String toString() {  //toString will return the time with timezone in 00:00:00 UTC +00:00 format
            
		return super.toString() + " UTC" + (this.timezone > 0 ? "+" : "")
				+ String.format("%02d", this.timezone) + ":00";     //prints the output in hh:mm:ss format
	}
	
    
}
