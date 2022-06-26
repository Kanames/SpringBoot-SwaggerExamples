package ro.stefan.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Model retrieved from library system")
public class Book {
	@ApiModelProperty(notes = "Title of the book", example = "Inside of this hell")
	private String title;
	
	@ApiModelProperty(notes = "Author of the book", example = "Stefan P.")
	private String author;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
