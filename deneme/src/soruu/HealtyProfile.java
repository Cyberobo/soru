package soruu;

public class HealtyProfile {
	String firstName,lastName,sex;
	final int nowYear=2023;
	int age,bornDate,kilo,MHR,THRMin,THRMax;
	float BMI,boy;
	
	HeartRate h1=new HeartRate();
	
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getBornDate() {
		return bornDate;
	}
	public void setBornDate(int bornDate) {
		this.bornDate = bornDate;
	}
	public float getBoy() {
		return boy;
	}
	public void setBoy(float boy) {
		this.boy = boy;
	}
	public int getKilo() {
		return kilo;
	}
	public void setKilo(int kilo) {
		this.kilo = kilo;
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
	
	public float vucudKitleendeksi() {
		BMI=(float)(kilo/(boy*boy));
		return BMI;
	}
	
	public void show() {
		System.out.println("Adi Soyadi: "+firstName+" "+lastName+"\n"+"Yas: "+yasHesapla()+"\n"+"Cinsiyet: "+sex+"\n"+"MHR: "+maxHeartrate());
		targetHeartrate();
		System.out.println("BMI: "+vucudKitleendeksi());
	}
}
