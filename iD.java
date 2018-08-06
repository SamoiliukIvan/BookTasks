package BookTasks;
//i
public class iD {
// поле класса
	private int iD;
// пустой конструктор
	public iD() {
		
	}
// конструктор с параметром
	public iD(int iD) {
		this.iD = iD;
	}
// геттер
	public int getiD() {
		return iD;
	}
// сеттер
	public void setiD(int iD) {
		this.iD = iD;
	}
// переопределенный метод toString()
	@Override
	public String toString() {
		
		return String.format("%d", getiD());
	}
}
