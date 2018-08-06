package BookTasks;

public class Runner {

	public static void main(String[] args) {
		iD i = new iD();
		i.setiD(500);
		System.out.println(i.toString());
	    Person p = new Person("Ivan", "Evgenievich", "Samoiliuk");
	    System.out.println(p.toString());
	    Address a = new Address("Ukraine", "Kharkiv", "Kharkiv", "Shir.St, 79-278", 61144);
	    System.out.println(a.toString());
	    Student st = new Student();
	    

	}

}
