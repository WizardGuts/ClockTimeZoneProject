import java.sql.*;

public class Clock {
	
	private long hour;
	private long minute;
	private long second;
	private java.util.Date dateCreated;
	
	Clock() {
		this(0);
		dateCreated = new java.util.Date();
	}
	
	Clock(long movingClock) {
		setClock(movingClock);
		dateCreated = new java.util.Date();
	}
	
	Clock(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public long getHour() {
		return hour;
	}
	
	public long getMinute() {
		return minute;
	}
	
	public long getSecond() {
		return second;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	public void setClock(long movingClock) {
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
			second = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
			minute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
			hour = totalHours % 24;
		
		if (movingClock > 0) {
			totalSeconds = totalMilliseconds / 1000;
				second = totalSeconds % 60;
			totalMinutes = totalSeconds / 60;
				minute = totalMinutes % 60;
			totalHours = totalMinutes / 60;
				hour = totalHours % 24;
		}
	}
	
	public String toString() {
		return "\nYour Time and Date: \n" + dateCreated;
	}
}