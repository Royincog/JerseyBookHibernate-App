package com.jerseyapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "book_details")
@XmlRootElement
public class Book {

	//We are designing the book entity

	@Id
	@Column(name = "book_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookID;
	
	@Column(name = "book_name")
	private String bookName;
	
	@Column(name = "book_author")
	private String bookAuthor;
	
	@Column (name = "book_publisher")
	private String bookPublisher;
	
	@Column(name = "num_pages")
	private int numOfPages;
	
	
	public Book() {
		
	}


	public Book(String bookName, String bookAuthor, String bookPublisher, int numOfPages) {
		super();
		
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPublisher = bookPublisher;
		this.numOfPages = numOfPages;
	}


	public void setBookID(int bookID) {
		this.bookID = bookID;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}


	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}


	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}


	public int getBookID() {
		return bookID;
	}


	public String getBookName() {
		return bookName;
	}


	public String getBookAuthor() {
		return bookAuthor;
	}


	public String getBookPublisher() {
		return bookPublisher;
	}


	public int getNumOfPages() {
		return numOfPages;
	}


	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPublisher="
				+ bookPublisher + ", numOfPages=" + numOfPages + "]";
	}
	
}
