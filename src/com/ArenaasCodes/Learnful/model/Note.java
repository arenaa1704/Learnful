package com.ArenaasCodes.Learnful.model;

import java.time.LocalDateTime;

public class Note {
	
	private int id;
	private String title;
	private String content;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	//Constructor
	
	/**
	 * @param title
	 * @param content
	 */
	public Note(String title, String content) {
		this.title = title;
		this.content = content;
		
		//Fix for createdAt/updatedAt
		LocalDateTime now = LocalDateTime.now();//read the clock once
		this.createdAt = now;
		this.updatedAt = now;
	}
	
	//Getters/Setters
	
	/**
	 * @return Returns the ID
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
		this.updatedAt = LocalDateTime.now();
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
		this.updatedAt = LocalDateTime.now();
	}

	/**
	 * @return the createdAt
	 */
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	/**
	 * @return the updatedAt
	 */
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	
}
