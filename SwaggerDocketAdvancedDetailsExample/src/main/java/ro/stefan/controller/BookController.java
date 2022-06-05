package ro.stefan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.stefan.dto.Book;

@RestController
public class BookController {
	
	@GetMapping("/books")
	public List<Book> getBooks(){
		return new ArrayList<Book>();
	}
}
