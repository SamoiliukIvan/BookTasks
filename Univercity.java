package BookTasks;

public class Univercity {
// поля класса
	private String facultet;
	private int course;
	private int group;
// пустой конструктор
	public Univercity() {
		
	}
// конструктор с параметрами
	public Univercity(String facultet, int course, int group) {
		this.facultet = facultet;
		this.course = course;
		this.group = group;
	}
// геттеры
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
	public void setFacultet(String facultet) {
		this.facultet = facultet;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public void setGroup(int group) {
		this.group = group;
	}
// переопределенный метод toString()
	@Override
		public String toString() {
			return String.format("%s\n%d\n%d", getFacultet(), getCourse(), getGroup());
		}
}
