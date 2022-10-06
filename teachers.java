package com.tele.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Teacher {
	
	
    @Id
    @PrimaryKeyJoinColumn
	private String name;
    private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@OneToMany(cascade= CascadeType.ALL)
	List<Courses> course = new ArrayList<Courses>();
	
//getter and setter
	public List<Courses> getCourse() {
		return course;
	}

	public void setCourse(List<Courses> course) {
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
