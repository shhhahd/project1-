package praoject2;
import java.util.regex.Pattern;
public class Person {   

	private int age;
	private String name;
	private String phoneNumber;
	private String email;
	private boolean f ;
	
	private Date birth = new Date();
	
	
	public String getBirth() {
		return birth.toString();
	}
//
	public void setBirth(int d ,int m , int y) {
		birth.setDay(d);
		birth.setMonth(m);
		birth.setYear(y);
	}
	
	

	public String getPhoneNumber() {

		if(Pattern.matches("^(010|012|015)\\d{8}$", phoneNumber))
		     return phoneNumber;
		 else return null;
		
	}
	
     public void setPhoneNumber(String phoneNumber) {
		
		if(Pattern.matches("^(010|012|015)\\d{8}$", phoneNumber))
			
		    this.phoneNumber = phoneNumber;	
		
	}

	public String getName() {
		if(testName())
		return name;
		else 		
			return null;
				
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getEmail() {
		if(Pattern.matches("^\\w{5,}+@\\w{2,10}\\.[a-z]{3,}$", email.toLowerCase()))
		return email;
		
		else return null;
	}

	public void setEmail(String email) { //lesa
		if(Pattern.matches("^\\w{5,}+@\\w{2,10}\\.[a-z]{3,}$", email.toLowerCase()))
		      this.email = email;	
	}

	public int getAge() {
		if(age>=20 && age<=40)
		return age;
		else return -1;
	}

	public void setAge(int age) {
		if(age>=20 && age<=40)
		this.age = age;
	}
	
	private boolean testName() {
		if(!name.isEmpty() && name.length()<=20) {
			for(int i=0;i<name.length();i++) {
			if(Character.isJavaLetter(name.charAt(i))) {
				return true;
				
		      }
				
          }	
		    
	   }
		return false;			
    }
	
	public void getData() {
		System.out.println("The name of person is "+ name );
		System.out.println("The age of person is "+ age );
		System.out.println("The phone number of person is "+ phoneNumber );
		System.out.println("The email of person is "+ email );
		System.out.println("The birth of person is "+ birth.toString() );
	}
	public void setData(String name,int age,String phoneNumber,String email){
		
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this.email=email;
	}
	
	
}
