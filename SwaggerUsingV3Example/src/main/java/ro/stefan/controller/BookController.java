package ro.stefan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ExternalDocs;
import ro.stefan.dto.Book;

@RestController
@Api(tags = "Book Controller")
public class BookController {
	
	@GetMapping("/books")
	public List<Book> getBooks(){
		return new ArrayList<Book>();
	}
	
	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}
}
