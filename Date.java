package praoject2;

public class Date {

	private int day;
	private int month;
	private int year;
   

	
	public Date() {
		this.getDay();
		this.getMonth();
		this.getYear();
	}

	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		if(month==2 && (day>=1 && day<=28) && year%4==0)
		this.day = day;
		else if(month==2 &&(day>=1 && day<=29) && year%4!=0)
			this.day = day;
		else if(((month==4)||(month==9)||(month==6)||(month==11))&&(day>=1 && day<=30) )
			this.day = day;
		else
			if((day>=1 && day<=31))
				this.day = day;
		
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month>=1 && month<=12)
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year>=1)
		this.year = year;
	}
	
	public String nameMon() {
		if(this.month==1) return "January";
		else if(this.month==2) return "February";
		else if(this.month==3) return "March";
		else if(this.month==4) return "April";
		else if(this.month==5) return "May";
		else if(this.month==6) return "June";
		else if(this.month==7) return "July ";
		else if(this.month==8) return "August";
		else if(this.month==9) return "September";
		else if(getMonth()==10) return "October";
		else if(this.month==11) return "November";
		else  return "December";
	}
	
	
	@Override
	public String toString() {
		
		return this.getDay() + " "+ this.nameMon() + " " + this.getYear();
	}
}
