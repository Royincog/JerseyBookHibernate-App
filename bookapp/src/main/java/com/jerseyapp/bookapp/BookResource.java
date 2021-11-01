package com.jerseyapp.bookapp;

import java.util.List;

import com.jerseyapp.model.Book;
import com.jerseyapp.repo.BookRepository;


import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path(value = "books")
public class BookResource {
	//Get the Book Repo
	private BookRepository repo = new BookRepository();


	
	
	@GET
	@Path(value = "showall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Book> showListOfBooks(){
		return repo.showListofBooks(); 
	}
	
	@POST
	@Path(value = "create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Book createBook(Book book) {
		repo.createBook(book);
		return book;
	}
	
	@POST
	@Path(value = "/delete/{bookID}")
	public void deleteBook(@PathParam ("bookID") long bookId) {
		System.out.println("Book id requested " + bookId);
		repo.deleteBook((int) bookId);
		
	}
}
