package BookTasks;

public class Student {
// поля класса
	private iD newId;
	private Person newPerson;
	private BirthDate newBirthDate;
	private Address newAddress;
	private PhoneNumber newPhoneNumber;
	private Univercity newUnivercity;
// пустой конструктор
	public Student() {
		
	}
// конструктор с параметрами
	public Student(
			iD newId, 
			Person newPerson, 
			BirthDate newBirthDate, 
			Address newAddress, 
			PhoneNumber newPhoneNumber, 
			Univercity newUnivercity) {
		this.newId = newId;
		this.newPerson = newPerson;
		this.newBirthDate = newBirthDate;
		this.newAddress = newAddress;
		this.newPhoneNumber = newPhoneNumber;
		this.newUnivercity = newUnivercity;
	}


}
