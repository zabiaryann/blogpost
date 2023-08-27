package com.techtalentsouth.TechTalentBlog.BlogPosts;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BlogPost {
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    public Long id; 
    private String title;
    private String author;
    private String blogEntry;
    
    public BlogPost() {
    	
    }
    
    public BlogPost(String title, String author, String blogEntry) {
        this.title = title; 
        this.author = author;
	    this.blogEntry = blogEntry;
    }
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

    public String getBlogEntry() {
    	return blogEntry;
    }

    public void setBlogEntry(String blogEntry) {
    	this.blogEntry = blogEntry;
    }

    @Override
    public String toString() {
    	return "BlogPost [id=" + id + ", title=" + title + ", author=" + author
    			+ ", blogEntry=" + blogEntry + "]";
    }


	
}