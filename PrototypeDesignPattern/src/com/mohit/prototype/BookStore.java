package com.mohit.prototype;

import java.util.List;

public class BookStore {
	
	private String storeName;
	private List<Book> bookList;
	
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "BookStore [storeName=" + storeName + ", bookList=" + bookList + "]";
	}
}
