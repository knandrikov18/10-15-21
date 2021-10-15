
public class Item {

	private String title;
	private boolean borrowed;
	private int year;
	private int month;
	private int dayOfMonh;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isBorrowed() {
		return borrowed;
	}

	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		
		this.month = month;
	}

	public int getDayOfMonh() {
		return dayOfMonh;
	}

	public void setDayOfMonh(int dayOfMonh) {
		this.dayOfMonh = dayOfMonh;
	}

	public void print(String title) {
		System.out.println(getTitle());
	}
}
