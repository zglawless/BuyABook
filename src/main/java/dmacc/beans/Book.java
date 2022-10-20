/**
 * 
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author zakgl
 *
 */
@Entity
public class Book {
	@Id
	@GeneratedValue
	public int id;
	public String bookName;
	public String author;
	public double price;
	public String genre;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(String bookName) {
		super();
		this.bookName = bookName;
	}
		


	public Book(String bookName, String author, double price, String genre) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.genre = genre;
		this.author = author;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	


	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", author=" + author + ", price=" + price + ", genre="
				+ genre + "]";
	}


}
