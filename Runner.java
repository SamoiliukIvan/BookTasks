package BookTasks;
//i
public class Runner {

	public static void main(String[] args) {
		Student2 st2 = new Student2(
				new iD(1), 
				new Person("Piter", "Johnathan", "Smith"), 
				new BirthDate(4, 7, 1767), 
				new Address("UK", "London district", "London", "Baker St., 12", 12376), 
				new PhoneNumber(1425262626), 
				new Univercity("Mathematics", 5, 123));
		System.out.println(st2.toString());
		
		System.out.println();
		
		Student2 st3 = new Student2();
		st3.setiD(1);
		st3.setName("Andrey");
		st3.setSecondname("Evgenievich");
		st3.setLastname("Samoiliuk");
		st3.setAddress("Ukraine", "Kharkiv district", "Kharkiv", "Gv.Shir.m,79", 12345);
		st3.setDayOfBirth(3);
		st3.setMonthOfBirth(5);
		st3.setYearOfBirth(1985);
		st3.setPhoneNumber(234567890);// !!! спросить у Андрея каким типом записывать номера
		st3.setCourse(3);
		st3.setFacultet("Economics");
		st3.setGroup(5);
		
		System.out.println(st3.toString());
	}

}
