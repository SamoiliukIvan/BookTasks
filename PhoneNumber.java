package BookTasks;

public class PhoneNumber {
// поле класса
	private long phone;
// пустой конструктор
	public PhoneNumber() {
		
	}
// конструктор с параметром
	public PhoneNumber(long phone) {
		this.phone = phone;
	}
// геттер
	public long getPhone() {
		return phone;
	}
// сеттер
	public void setPhone(long phone) {
		this.phone = phone;
	}
// переопределенный метод toString()
	@Override
	public String toString() {
		return String.format("%d", getPhone());
	}
}
