package com.example.web;

import javax.validation.constraints.NotEmpty;

public class HelloPrintForm {

	@NotEmpty
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
