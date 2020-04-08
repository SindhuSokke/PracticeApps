package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import com.example.demo.Demo1Application;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown=true)
public class NewsPojo extends Demo1Application {
	
	public NewsPojo() {
	}
	private String author;
	private String[] category;
	private String description;
	private String id;
	private String image;
	private String language;
	private String published;
	private String title;
	private String url;
	
	List<NewsPojo> news=new ArrayList<NewsPojo>();
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String[] getCategory() {
		return category;
	}
	public void setCategory(String[] category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getPublished() {
		return published;
	}
	public void setPublished(String published) {
		this.published = published;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public NewsPojo(String author, String[] category, String description, String id,
            String image, String language, String published, String title, String url) {
        this.author = author;
        this.category = category;
        this.description = description;
        this.id = id;
        this.image = image;
        this.language = language;
        this.published= published;
        this.title=title;
        this.url=url;
	}
}
