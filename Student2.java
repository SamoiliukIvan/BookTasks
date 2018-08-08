package BookTasks;
//i
public class Student2 {

	private iD tempId = new iD();
	private Person tempPerson = new Person();
	private BirthDate tempBD = new BirthDate();
	private Address tempAddress = new Address();
	private PhoneNumber tempPhoneN = new PhoneNumber();
	private Univercity tempUniver = new Univercity(); 
	
// поля класса
	private int iD;
	private String name;
	private String secondname;
	private String lastname;
	private int dayOfBirth;
	private int monthOfBirth;
	private int yearOfBirth;
	private String address;
	private long phoneNumber;
	private String facultet;
	private int course;
	private int group;
	
	public Student2() {
		
	}

// конструктор с параметрами
	public Student2(iD newId,
			Person newPerson,
			BirthDate newBirthDate, 
			Address newAddress,
			PhoneNumber newPhoneNumber, 
			Univercity newUnivercity) 
	{
		
		tempId = newId;
		tempPerson = newPerson;
		tempBD = newBirthDate;
		tempAddress = newAddress;
		tempPhoneN = newPhoneNumber;
		tempUniver = newUnivercity;
		
		iD = this.tempId.getiD();
		name = this.tempPerson.getName();
		secondname = this.tempPerson.getSecondName();
		lastname = this.tempPerson.getLastName();
		dayOfBirth = this.tempBD.getDay();
		monthOfBirth = this.tempBD.getMonth();
		yearOfBirth = this.tempBD.getYear();
		address = tempAddress.toString();
		phoneNumber = tempPhoneN.getPhone();
		facultet = tempUniver.getFacultet();
		course = tempUniver.getCourse();
		group = tempUniver.getGroup();
	}
// геттеры
	public int getiD() {
		return iD;
	}
	public String getName() {
		return name;
	}
	public String getSecondname() {
		return secondname;
	}
	public String getLastname() {
		return lastname;
	}
	public int getDayOfBirth() {
		return dayOfBirth;
	}
	public int getMonthOfBirth() {
		return monthOfBirth;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public String getFacultet() {
		return facultet;
	}
	public int getCourse() {
		return course;
	}
	public int getGroup() {
		return group;
	}
	
// сеттеры
	public void setiD(int i) {
		tempId.setiD(i);
		iD = tempId.getiD();
	}
	public void setName(String name) {
		tempPerson.setName(name);
		name = tempPerson.getName();
	}
	public void setSecondname(String secondName) {
		tempPerson.setSecondName(secondName);
		secondname = tempPerson.getSecondName();
	}
	public void setLastname(String lastName) {
		tempPerson.setLastName(lastName);
		lastname = tempPerson.getLastName();	
	}
	public void setDayOfBirth(int day) {
		tempBD.setDay(day);
		dayOfBirth = tempBD.getDay();
	}
	public void setMonthOfBirth(int month) {
		tempBD.setMonth(month);
		monthOfBirth = tempBD.getMonth();
	}
	public void setYearOfBirth(int year) {
		tempBD.setYear(year);
		yearOfBirth = tempBD.getYear();
	}
	public void setAddress(
			String country, 
			String region, 
			String city, 
			String localAddress, 
			int index) {
		tempAddress.setCountry(country);
		tempAddress.setRegion(region);
		tempAddress.setCity(city);
		tempAddress.setLocalAddress(localAddress);
		tempAddress.setIndex(index);
		
		address = tempAddress.toString();
	}
	
	public void setPhoneNumber(long phone) {
		tempPhoneN.setPhone(phone);
		phoneNumber = tempPhoneN.getPhone();
	}
	public void setFacultet(String facultet) {
		tempUniver.setFacultet(facultet);
		facultet = tempUniver.getFacultet();
	}
	public void setCourse(int course) {
		tempUniver.setCourse(course);
		course = tempUniver.getCourse();
	}
	public void setGroup(int group) {
		tempUniver.setGroup(group);
		group = tempUniver.getGroup();
	}
	
	@Override
		public String toString() {
			return String.format("ID: %d "
					+ "\nФИО: %s %s %s "
					+ "\nДата рождения: %02d-%02d-%4d "
					+ "\nНомер телефона: %d "
					+ "\nАдрес: %s "
					+ "\nФакультет: %s \nКурс: %d \nГруппа: %d", 
					this.getiD(), 
					this.getName(),
					this.getSecondname(), 
					this.getLastname(), 
					this.getDayOfBirth(), 
					this.getMonthOfBirth(), 
					this.getYearOfBirth(),
					this.getPhoneNumber(),
					this.getAddress(), 
					this.getFacultet(),
					this.getCourse(),
					this.getGroup());
		}
	
	


}
