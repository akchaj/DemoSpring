package com.springboot.spring.Books.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.spring.Books.repository.BookRepository;
@Service
public class BookServiceImp implements BookService {
	
	List<BookRepository> list;
	
	
	public BookServiceImp() {
		list = new ArrayList<>();
		list.add(new BookRepository(101, "Java Programming Langauage", "XYZ"));
		
	}

	@Override
	public List<BookRepository> getBooks() {
		
		return list;
	}

	@Override
	public BookRepository getbook(int bookId) 
	{
		BookRepository b = null;
		for(BookRepository book : list)
		{
			if(book.getId()== bookId)
			{
				b=book;
				break;
			}
		}
		return b;
	}

	@Override
	public BookRepository addBook(BookRepository Book) 
	{
		list.add(Book);
		return Book;
	}

	@Override
	public BookRepository updateBook(int bookId, BookRepository Book) 
	{
		for(BookRepository b:list)
		{
			if(b.getId()== bookId)
			{
				b.setName(Book.getName());
				b.setAuthor(Book.getAuthor());
			}
		}
		return Book;
	}

	@Override
	public void deleteBook(int bookId) 
	{
		for(BookRepository book: list)
		{
			if(book.getId() == bookId)
			{
				list.remove(book);
			}
		}
		
	}
	
}


