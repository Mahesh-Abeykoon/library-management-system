package biz.affiniti.entity;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="book")
public class Book {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column (name="book_name")
	private String bookName;
	
	@Column(name ="ISBN")
	private String isbn;
	
	@Column(name ="registered_number")
	private String registerdNumber;
	
	@Column(name ="date")
	private Date  issuedDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getRegisterdNumber() {
		return registerdNumber;
	}

	public void setRegisterdNumber(String registerdNumber) {
		this.registerdNumber = registerdNumber;
	}

	public Date getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}

	public Book(long id, String bookName, String isbn, String registerdNumber, Date issuedDate) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.isbn = isbn;
		this.registerdNumber = registerdNumber;
		this.issuedDate = issuedDate;
	}
	
}
