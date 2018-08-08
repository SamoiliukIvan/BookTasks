package BookTasks;

public class ForID {
	iD id = new iD();
	int x;

	public ForID(iD i) {
		id = i;
		x = id.getiD();
	}

	public void show() {
		System.out.println(id.getiD());
		System.out.println(x);
	}
}
