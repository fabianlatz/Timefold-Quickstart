package com.hyand.timefoldquickstart.demo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@ToString
@Entity
public class Room {
	@Id
	private Long id;

	@NotEmpty
	private String name;

	private Boolean barrierFree;

	@PositiveOrZero
	private Integer capacity;

	@OneToOne
	@JoinColumn(name = "responsible_employee_id")
	private Employee responsibleEmployee;
}