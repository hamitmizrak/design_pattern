package com.hamitm.creational.builder;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LombokBuilder {
	private String name;
	private String surname;
	private String country;
	private int age;
	private String emailAddres;
	private Date date;
	
}
