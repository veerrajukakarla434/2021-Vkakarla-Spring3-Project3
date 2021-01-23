package com.vkakarla.spring5.project3;

public class Book {
	private String title;
	private String publications;
	private String author;

	public Book() {
		super();
	}

	public Book(String title, String publications, String author) {
		super();
		this.title = title;
		this.publications = publications;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublications() {
		return publications;
	}

	public void setPublications(String publications) {
		this.publications = publications;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void getBookDetails() {
		System.out.println("**Published Book Details**");
		System.out.println("Book Title        : " + title);
		System.out.println("Book Author       : " + author);
		System.out.println("Book Publications : " + publications);
	}
}