package com.bookswagon.crud.service;

import java.util.List;

import com.bookswagon.crud.entity.Books;

public interface BookService {

	public Books saveBook(Books books);
	
	public List<Books> saveBooks(List<Books> books);
	
	public List<Books> getBooks();
	
	public Books getBooksByID(int id);
	
	public String deleteBooks(int id);
}
