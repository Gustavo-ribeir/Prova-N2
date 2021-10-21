package br.com.gustavoribeiro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "games")
public class Game {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String title;
	private String publishingCompany;
	private String developers;
	public Game(int id, String title, String publishingCompany, String developers) {
		this.id = id;
		this.title = title;
		this.publishingCompany = publishingCompany;
		this.developers = developers;
	}
	public Game() {	}
	public int getId() {
		return id;
	}
	public String getPublishingCompany() {
		return publishingCompany;
	}
	public String getDevelopers() {
		return developers;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
	public void setDevelopers(String developers) {
		this.developers = developers;
	}
	
	
	
}
