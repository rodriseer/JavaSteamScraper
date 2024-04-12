
public class Game {
	
	private String title;
	private String price;

	//constructor
	public Game(String title, String price) {
		this.title = title;
		this.price = price;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		return "\nGame Title: " + title +"\nPrice: " + price;
		
		
	}
	

}
