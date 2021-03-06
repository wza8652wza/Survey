package com.survey.model;

import java.util.HashSet;
import java.util.Set;

public class Page extends BaseEntity{

	private static final long serialVersionUID = -4231641672423591252L;
	private transient Survey survey;
	private Set<Question> questions = new HashSet<Question>();

	private Integer id;
	private String title = "新page";
	private String description;

	private float orderno;

	public void setOrderno(float orderno) {
		this.orderno = orderno;
	}

	public float getOrderno() {
		return orderno;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
		if(id != null){
			orderno = id;
		}
	}

	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

	public Set<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

//	@Override
//	public String toString() {
//		return "Page [survey=" + survey.getId() + ", questions=" + questions
//				+ ", id=" + id + ", title=" + title + ", description="
//				+ description + "]";
//	}

}
