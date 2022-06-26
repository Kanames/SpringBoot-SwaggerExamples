package ro.stefan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ro.stefan.dto.Book;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@Api( tags = "Book Store | API annotation")
public class BookController {
	
	@ApiOperation(value = "Recover the collection of all books from the store | API Operation annotation.")
	@GetMapping("/books")
	public List<Book> getBooks(){
		return new ArrayList<Book>();
	}
	
	//@ApiIgnore 
	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}
}
