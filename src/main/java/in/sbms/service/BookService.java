package in.sbms.service;

import java.util.List;

import in.sbms.entity.Book;

public interface BookService {

	 public String upsertBook(Book book);
	 public List<Book> getBook();
	 public String deleteBook(Integer bookId);
}
