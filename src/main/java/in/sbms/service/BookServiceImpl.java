package in.sbms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.sbms.entity.Book;
import in.sbms.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	BookRepository bookRepository;
	
	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	@Override
	public String upsertBook(Book book) {
		Integer bookId=book.getBookId();
		
		Book saveBook =bookRepository.save(book);

		if(bookId == null) {
			return "Record Insert Successfully...";
		}else {
			return "Record Update Successfully...";
		}
		
	}

	@Override
	public List<Book> getBook() {

		return bookRepository.findAll();
	}

	@Override
	public String deleteBook(Integer bookId) {

		bookRepository.deleteById(bookId);
		
		return "Book Deleted..";
	}

}
