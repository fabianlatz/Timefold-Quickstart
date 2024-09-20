package com.hyand.timefoldquickstart.demo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@ToString
@Entity
public class Employee {
	@Id
	private Long id;

	@NotBlank
	private String firstName;

	@NotBlank
	private String lastName;

	@Email
	private String email;

	@OneToOne(mappedBy = "responsibleEmployee")
	private Room roomResponsibility;
}