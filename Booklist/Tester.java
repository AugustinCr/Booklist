/**
 * This class manages a menu, that the user can continuously use to
 * carry out different actions to the book collection.
 * 
 * @author Andrei Dumitrascu
 * @version JDK 17.0.7.3
 * @since 2022-06-23
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		bookAttributes bookOne = new bookAttributes("Naked Statues, Fat Gladiators, and War Elephants", "History", "Poor", "Paperback", 18.99, 288);
		bookAttributes bookTwo = new bookAttributes("Botanicum: Welcome to the Museum", "Botany", "Decent", "Hardcover", 24.74, 112);
		bookAttributes bookThree = new bookAttributes("Atomic Habits", "Psychology", "Good", "Paperback", 11.98, 320);
		
		bookAttributes bookFour = new bookAttributes("Zero To One", "Business", "Good", "Hardcover", 20.33, 224);
		bookAttributes bookFive = new bookAttributes("The Mom Test", "Business", "Decent", "Paperback", 19.99, 136);
		bookAttributes bookSix = new bookAttributes("Grimm's Complete Fairy Tales", "Fantasy", "Excellent", "Hardcover", 13.97, 676);
		
		ArrayList<bookAttributes> bookList = new ArrayList<>();
		
		bookList.add(bookOne);
		bookList.add(bookTwo);
		bookList.add(bookThree);
		
		bookList.add(bookFour);
		bookList.add(bookFive);
		bookList.add(bookSix);
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String userName = scnr.next();
		System.out.println("Welcome " + userName + ".");
		System.out.println();
		
		int userMenuOption;
		do {	// I am using a do-while loop, allowing the users to carry out as many actions as they want, until they decide to exit. 
			System.out.println();
			System.out.println("Menu: ");
			System.out.println("1. Check the attributes of the books");
			System.out.println("2. Edit the attributes of a book");
			System.out.println("3. Add a new book to your collection");
			System.out.println("4. Update the number of pages left to read");
			System.out.println("5. Calculate tax into the price");
			System.out.println("6. Exit");
			
			System.out.println();
			System.out.print("Please choose what you would like to do: ");
			userMenuOption = scnr.nextInt(); //The users simply enter a number from 1 to 6, to choose an option form the menu above. 
			
			System.out.println();
			System.out.println(); // I am using empty print statements everywhere to make the menu look nice and spaced out for the users. 
			
			switch(userMenuOption) {
			// Once a user picks an option, from 1 to 6. The program executes the appropriate case.
			case 1: 
				System.out.println("Booklist: ");
				for (int i = 0; i < bookList.size(); i++) { // This for loop is used to display all of the books and their attributes.
					System.out.println("Name: " + bookList.get(i).getBookName());
					System.out.println("Genre: " + bookList.get(i).getBookGenre());
					System.out.println("Condition: " + bookList.get(i).getBookCondition());
					System.out.println("Format: " + bookList.get(i).getBookFormat());
					System.out.println("Price: $" + bookList.get(i).getBookPrice());
					System.out.println("Pages: " + bookList.get(i).getBookPages());
					System.out.println();
				}
				break;
			
			case 2:
				int bookIndicator = 0;
				
				System.out.println("Booklist: ");
				for (int i = 0; i < bookList.size(); i++) { // This for loop displays a list of the books names.
					bookIndicator++;
					System.out.println("Book " + bookIndicator + ": " + bookList.get(i).getBookName());
					System.out.println();
				}
				
				System.out.print("Choose which book you would like to edit: ");
				System.out.println();
				int bookSelection = scnr.nextInt();
					
						System.out.println("You have selected the book: " + '"' + bookList.get(bookSelection - 1).getBookName() + '"');
						System.out.println();
						System.out.println("1. Change its name");
						System.out.println("2. Change its genre");
						System.out.println("3. Change its condition");
						System.out.println("4. Change its format");
						System.out.println("5. Change its price");
						System.out.println("6. Change number of pages left");
						System.out.println();
						System.out.print("Select your option: ");
						System.out.println();
						int editOption = scnr.nextInt(); // The users choose what they would like to edit.
						
						if (editOption == 1) { // If the users enter number 1, they can change the name, else if the users enter number 2, they can change the genre, etc...
							System.out.println("Enter new name: ");
							scnr.nextLine();
							String newBookName = scnr.nextLine();
							
							// To edit the instance variables of each individual book, I am using "bookList.get(bookSelection - 1)" to get the book out of the ArrayList
							// And ".setBookName(newBookName)" to change it to whatever the users specify. 
							bookList.get(bookSelection - 1).setBookName(newBookName);
							System.out.print("The name of the book has been changed to: " + bookList.get(bookSelection - 1).getBookName());
							System.out.println();
						}
						else if (editOption == 2) {
							System.out.println("Enter new genre: ");
							String newBookGenre = scnr.next();
							
							bookList.get(bookSelection - 1).setBookGenre(newBookGenre);
							System.out.print("The genre of the book has been changed to: " + bookList.get(bookSelection - 1).getBookGenre());
							System.out.println();
						}
						else if (editOption == 3) {
							System.out.println("Enter new condition: ");
							String newBookCondition = scnr.next();
							
							bookList.get(bookSelection - 1).setBookCondition(newBookCondition);
							System.out.print("The condition of the book has been changed to: " + bookList.get(bookSelection - 1).getBookCondition());
							System.out.println();
						}
						else if (editOption == 4) {
							System.out.println("Enter new format: ");
							String newBookFormat = scnr.next();
							
							bookList.get(bookSelection - 1).setBookFormat(newBookFormat);
							System.out.print("The format of the book has been changed to: " + bookList.get(bookSelection - 1).getBookFormat());
							System.out.println();
						}
						else if (editOption == 5) {
							System.out.println("Enter new price: ");
							Double newBookPrice = scnr.nextDouble();
							
							bookList.get(bookSelection - 1).setBookPrice(newBookPrice);
							System.out.print("The price of the book has been changed to: $" + bookList.get(bookSelection - 1).getBookPrice());
							System.out.println();
						}
						else if (editOption == 6) {
							System.out.println("Enter new number for pages: ");
							int newBookPages = scnr.nextInt();
							
							bookList.get(bookSelection - 1).setBookPages(newBookPages);
							System.out.print("The pages of the book has been changed to: " + bookList.get(bookSelection - 1).getBookPages());
							System.out.println();
						}
						break;
						
			case 3:
				bookAttributes newBook = new bookAttributes();
				//The users are asked to enter a name, genre, condition, etc... during the creation of a book.
				System.out.println("Enter a name: ");
				scnr.nextLine();
				String bookCreationName = scnr.nextLine();
				newBook.setBookName(bookCreationName);
				
				System.out.println("Enter a genre: ");
				String bookCreationGenre = scnr.nextLine();
				newBook.setBookGenre(bookCreationGenre);
				
				System.out.println("Enter a condition: ");
				String bookCreationCondition = scnr.nextLine();
				newBook.setBookCondition(bookCreationCondition);
				
				System.out.println("Enter a format: ");
				String bookCreationFormat = scnr.nextLine();
				newBook.setBookFormat(bookCreationFormat);
				
				System.out.println("Enter a price: ");
				Double bookCreationPrice = scnr.nextDouble();
				newBook.setBookPrice(bookCreationPrice);
				
				System.out.println("Enter number of pages: ");
				int bookCreationPages = scnr.nextInt();
				newBook.setBookPages(bookCreationPages);
				System.out.println();
				
				bookList.add(newBook); // At the end, the book is added to the ArrayList.
				
				System.out.println("You have listed a new book with the following attributes: ");
				System.out.println();
				System.out.println("Name: " + bookList.get(6).getBookName());
				System.out.println("Genre: " + bookList.get(6).getBookGenre());
				System.out.println("Condition: " + bookList.get(6).getBookCondition());
				System.out.println("Format: " + bookList.get(6).getBookFormat());
				System.out.println("Price: $" + bookList.get(6).getBookPrice());
				System.out.println("Pages: " + bookList.get(6).getBookPages());
				System.out.println();
				
				break;
				
			case 4:
				int bookIndicatorTwo = 0;
				System.out.println("Booklist: ");
				
				for (int i = 0; i < bookList.size(); i++) {
					bookIndicatorTwo++;
					System.out.println("Book " + bookIndicatorTwo + ": " + bookList.get(i).getBookName());
					System.out.println();
				}
				// The users pick a book from the list, and enter how many pages they have read to update the page counter.
				System.out.print("Choose a book to update: ");
				System.out.println();
				int bookSelectionTwo = scnr.nextInt();
					
				System.out.println("Book: " + '"' + bookList.get(bookSelectionTwo - 1).getBookName() + '"');
				System.out.println("You have " + bookList.get(bookSelectionTwo - 1).getBookPages() + " pages left to read.");
				System.out.println();
				System.out.print("List how many pages you read today: ");
				int pagesRead = scnr.nextInt();
				
				System.out.println();
				System.out.println("There are now " + bookList.get(bookSelectionTwo - 1).pagesLeft(pagesRead) + " pages left to read.");
				
				break;
				
			case 5:
				int bookIndicatorThree = 0;
				System.out.println("Booklist: ");
				
				for (int i = 0; i < bookList.size(); i++) {
					bookIndicatorThree++;
					System.out.println("Book " + bookIndicatorThree + ": " + bookList.get(i).getBookName());
					System.out.println();
				}
				// The users pick a book from the list, and enter the tax rate in their area, to calculate the total cost of the book after taxes.
				System.out.print("Choose a book to calculate taxes: ");
				System.out.println();
				int bookSelectionThree = scnr.nextInt();
				
				System.out.println("Book: " + '"' + bookList.get(bookSelectionThree - 1).getBookName() + '"' + 
						" costs $" + bookList.get(bookSelectionThree - 1).getBookPrice() + " before taxes.");
				
				System.out.print("Enter the tax rate(00.00) in your area: ");
				double taxRate = scnr.nextDouble();
				
				System.out.println();
				System.out.println("The book: " + '"' + bookList.get(bookSelectionThree - 1).getBookName() + '"' + 
						" will cost $" + bookList.get(bookSelectionThree - 1).bookPricePlusTax(taxRate, bookList.get(bookSelectionThree - 1).getBookPrice()) + " after taxes.");
				/*	The simplify the line above: "bookList.get(bookSelectionThree - 1).bookPricePlusTax" gets the book out of the ArrayList and calls the method to calculate taxes.
				 *  The arguments passed to the method are: The TaxRate specified by the users, and the price of the book - "bookList.get(bookSelectionThree - 1).getBookPrice()".	*/
				break;
				
			case 6:
				System.out.println("Exiting program, Good Bye!"); //The program exits when the user enters 6, and the do-while loop ends.
				break;
			}
		} while (userMenuOption != 6);
	
		scnr.close();
		
	}
}
