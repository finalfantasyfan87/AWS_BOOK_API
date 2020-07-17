package com.example.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class BookDTO implements Serializable {

	@SerializedName("isbn")
	private String isbn;

	@SerializedName("title")
	private String title;

	@SerializedName("subtitle")
	private String subtitle;

	@SerializedName("author")
	private String author;

	@SerializedName("published")
	private String published;

	@SerializedName("publisher")
	private String publisher;

	@SerializedName("pages")
	private int pages;

	@SerializedName("description")
	private String description;

	@SerializedName("website")
	private String website;

	public void setIsbn(String isbn){
		this.isbn = isbn;
	}

	public String getIsbn(){
		return isbn;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setSubtitle(String subtitle){
		this.subtitle = subtitle;
	}

	public String getSubtitle(){
		return subtitle;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public String getAuthor(){
		return author;
	}

	public void setPublished(String published){
		this.published = published;
	}

	public String getPublished(){
		return published;
	}

	public void setPublisher(String publisher){
		this.publisher = publisher;
	}

	public String getPublisher(){
		return publisher;
	}

	public void setPages(int pages){
		this.pages = pages;
	}

	public int getPages(){
		return pages;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setWebsite(String website){
		this.website = website;
	}

	public String getWebsite(){
		return website;
	}

	@Override
 	public String toString(){
		return 
			"BookDTO{" + 
			"isbn = '" + isbn + '\'' + 
			",title = '" + title + '\'' + 
			",subtitle = '" + subtitle + '\'' + 
			",author = '" + author + '\'' + 
			",published = '" + published + '\'' + 
			",publisher = '" + publisher + '\'' + 
			",pages = '" + pages + '\'' + 
			",description = '" + description + '\'' + 
			",website = '" + website + '\'' + 
			"}";
		}
}