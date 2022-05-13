package com.springboot.spring.Books.services;
import java.util.List;

import com.springboot.spring.Books.repository.BookRepository;

public interface BookService 
{

	public List<BookRepository> getBooks();
	
	public BookRepository getbook(int bookId);
	
	public BookRepository addBook(BookRepository Book);
	
	public BookRepository updateBook(int bookId, BookRepository Book);
	
	public void deleteBook(int bookId);
}
