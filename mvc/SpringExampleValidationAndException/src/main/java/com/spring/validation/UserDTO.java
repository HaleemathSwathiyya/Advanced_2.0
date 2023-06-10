package com.spring.validation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	
	@NotNull(message = "name cannot be null")
	private String name;
	@Email(message="invalid email format")
	private String email;
    @Min(18)
    @Max(60)
	private int age;
    @Pattern(regexp="^//d{10}$", message="invalid mobile number")
	private int mobileno;
	private String Gender;
//	@NotBlank
//	private String nationality;
	
//	public UserDTO() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public UserDTO(long id, String name, int age) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
//	}
//
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
	
	

}
