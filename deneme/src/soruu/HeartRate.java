package soruu;

public class HeartRate {
	String firstName,lastName;
	int bornDate;
	final int nowYear=2023;
	int age,MHR,THRMin,THRMax;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBornDate() {
		return bornDate;
	}
	public void setBornDate(int bornDate) {
		this.bornDate = bornDate;
	}
	
	public int yasHesapla() {
		age=nowYear-this.bornDate;
		return age;
	}
	
	public int maxHeartrate() {
		MHR=220-age;
		return MHR;
	}
	public void targetHeartrate() {
		THRMin=((MHR*50)/100);
		THRMax=((MHR*80)/100);
		System.out.println("THR: "+THRMin+"-"+THRMax);
	}
	
	public void show() {
		System.out.println("Adi Soyadi: "+firstName+" "+lastName+"\n"+"Yas: "+yasHesapla()+"\n"+"MHR: "+maxHeartrate());
		targetHeartrate();
	}
	
	
	
}


