package BookTasks;
//i
public class BirthDate {
// поля класса
	private int day;
	private int month;
	private int year;
// пустой конструктор
	public BirthDate() {
		
	}
// конструктор с параметрами
	public BirthDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
// геттеры
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
// сеттеры
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
// переопределенный метод toString()
	@Override
		public String toString() {
			return String.format("%02d.%02d.%4d", getDay(), getMonth(), getYear());
		}
}
