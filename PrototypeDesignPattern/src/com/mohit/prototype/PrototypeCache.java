package com.mohit.prototype;

import java.util.HashMap;

public class PrototypeCache {
	
	private static HashMap<Integer,Book> cacheMap= new HashMap<Integer, Book>();
	
	public static void loadDataFirstTime() {
		
		int numberOfRecors=10;
		
		for(int i=1;i<=numberOfRecors;i++) {
			Book book=new Book();
			book.setBookId(i);
			book.setAuthor("Book-Author_"+i);
			book.setBookName("Book-Name_"+i);
			cacheMap.put(book.getBookId(), book);
		}
	}
	
	public static Book getClonedBook(Integer bookId) {
		Book cachedBook= new Book();
		cachedBook=cacheMap.get(bookId);
		try {
			return (Book) cachedBook.clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	       return cachedBook;
	}

}
