package com.gcit.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_author", catalog="library")
public class Author {
	@Id
	@Column(name="authorId", nullable=false)
	private int authorId;
	@Column(name="authorName", nullable=false)
	private String authorName;
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	

}
