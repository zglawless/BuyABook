package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Book;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.BookRepository;

@SpringBootApplication
public class BuyABookApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BuyABookApplication.class, args);
	}
	
	@Autowired
	BookRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Book b = appContext.getBean("book", Book.class);
		b.setAuthor("Rick Riordan");
		repo.save(b);
		
		Book a = new Book("Percy Jackson, The Sea of Monsters", "Rick Riordan", 9.99, "Fiction");
		repo.save(a);
		
		List<Book> allBooks = repo.findAll();
		for(Book books: allBooks){
			System.out.println(books.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}

}
