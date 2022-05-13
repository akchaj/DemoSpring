package com.springboot.spring.Books.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.spring.Books.repository.BookRepository;
import com.springboot.spring.Books.services.BookService;

@RestController
public class MyController 
{
	@Autowired
	private BookService bookservice;
	
	@GetMapping("/books")
	public List<BookRepository> getBooks()
	{
		return this.bookservice.getBooks();
	}
	@GetMapping("/books/{bookId}")
	public BookRepository getbook(@PathVariable int bookId)
	{
		return this.bookservice.getbook(bookId);
	}
	@PostMapping("/books")
	public BookRepository addBook(@RequestBody BookRepository Book)
	{
		return this.bookservice.addBook(Book);
	}
	@PutMapping("/books/{bookId}")
	public BookRepository updateBook(@PathVariable int bookId, @RequestBody BookRepository Book)
	{
		return this.bookservice.updateBook(bookId,Book);
	}
	@DeleteMapping("/books/{bookId}")
	public BookRepository deleteBook(@PathVariable("bookId") int bookId)
	{
		this.bookservice.deleteBook(bookId);
		return null;
	}
}
