package com.springboot.spring.Books.repository;

public class BookRepository 
{

	private long id;
	private String name;
	private String author;
	
	public BookRepository(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	public BookRepository()
	{
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "BookRepository [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	
}
