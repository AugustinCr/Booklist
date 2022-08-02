/**
 * This class manages the instance variables, methods, setters/getters, and constructors.
 * 
 * @author Andrei Dumitrascu
 * @version JDK 17.0.7.3
 * @since 2022-06-23
 */

public class bookAttributes {
	private String bookName;
	private String bookGenre;
	private String bookCondition;
	private String bookFormat;
	private double bookPrice;
	private int bookPages;
	
	
	public bookAttributes(String name, String genre, String condition, String format, double price,
			int pages) {
		bookName = name;
		bookGenre = genre;
		bookCondition = condition;
		bookFormat = format;
		bookPrice = price;
		bookPages = pages;
	
	}
	
	public bookAttributes() {
		bookName = "unknown";
		bookGenre = "unknown";
		bookCondition = "unknown";
		bookFormat = "unknown";
		bookPrice = 0.00;
		bookPages = 0;
	
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public String getBookCondition() {
		return bookCondition;
	}

	public void setBookCondition(String bookCondition) {
		this.bookCondition = bookCondition;
	}

	public String getBookFormat() {
		return bookFormat;
	}

	public void setBookFormat(String bookFormat) {
		this.bookFormat = bookFormat;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getBookPages() {
		return bookPages;
	}

	public void setBookPages(int bookPages) {
		this.bookPages = bookPages;
	}
	/**
	 * Allows the user to calculate the total cost of a book, including taxes.
	 * 
	 * @param taxPercent - user specified tax rate, divided by 100 to convert the percent into a decimal for calculation
	 * @param price - price of the book, multiplied by the decimal, and than added for the total cost + taxes
	 * @return bookPrice - price of the book updated to reflect the new change
	 */
	public double bookPricePlusTax(double taxPercent, double price) {
		bookPrice = ((taxPercent / 100) * price) + price;
		return bookPrice;
	}
	/**
	 * Allows the user to remove the number of pages that have been read from the page counter
	 * 
	 * @param pagesRead - number of pages subtracted from the page counter
	 * @return bookPages - page counter that is updated after subtraction
	 */
	public int pagesLeft(int pagesRead) {
		bookPages = bookPages - pagesRead;
		return bookPages;
	}
}


