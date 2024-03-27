package com.mohit.prototype;

import java.util.ArrayList;
import java.util.List;

public class ClientCall {
	
	public static void main(String args[]) {
	PrototypeCache.loadDataFirstTime();
	BookStore store= new BookStore();
	List<Book> books= new ArrayList<Book>();
	books.add(PrototypeCache.getClonedBook(1));
	books.add(PrototypeCache.getClonedBook(2));
	books.add(PrototypeCache.getClonedBook(3));
	books.add(PrototypeCache.getClonedBook(4));
	books.add(PrototypeCache.getClonedBook(5));
	books.add(PrototypeCache.getClonedBook(6));
	books.add(PrototypeCache.getClonedBook(7));
	books.add(PrototypeCache.getClonedBook(8));
	books.add(PrototypeCache.getClonedBook(9));
	books.add(PrototypeCache.getClonedBook(10));
	store.setStoreName("Store_A");
	store.setBookList(books);
	BookStore store_b= new BookStore();
	store_b.setStoreName("Store_B");
	store_b.setBookList(books);
	
	System.out.println(store);
	System.out.println(store_b);
	
	  }

}
