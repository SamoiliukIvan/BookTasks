package BookTasks;

public class Address {
// поля класс
	private String country;
	private String region;
	private String city;
	private String localAddress;
	private int index;
// пустой конструктор
	public Address() {
		
	}
// конструктор с параметрами
	public Address(String country, String region, String city, String localAddress, int index) {
		this.country = country;
		this.region = region;
		this.city = city;
		this.localAddress = localAddress;
		this.index = index;
	}
// геттеры
	public String getCountry() {
		return country;
	}
	public String getRegion() {
		return region;
	}
	public String getCity() {
		return city;
	}
	public String getLocalAddress() {
		return localAddress;
	}
	public int getIndex() {
		return index;
	}
// сеттеры
	public void setCountry(String country) {
		this.country = country;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}
	public void setIndex(int index) {
		this.index = index;
	}
// переопределенный метод toString()
	@Override
		public String toString() {
			return String.format("%s\n%s\n%s\n%s\n%d", getCountry(), getRegion(), getCity(), getLocalAddress(), getIndex());
		}
}
