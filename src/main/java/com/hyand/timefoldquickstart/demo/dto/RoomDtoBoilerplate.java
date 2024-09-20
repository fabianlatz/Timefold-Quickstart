package com.hyand.timefoldquickstart.demo.dto;

import com.hyand.timefoldquickstart.demo.Room;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link Room}
 */
public class RoomDtoBoilerplate implements Serializable {
	@NotEmpty
	private final String name;

	private final Boolean barrierFree;

	public RoomDtoBoilerplate(String name, Boolean barrierFree) {
		this.name = name;
		this.barrierFree = barrierFree;
	}

	public String getName() {
		return name;
	}

	public Boolean getBarrierFree() {
		return barrierFree;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, barrierFree);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass())
			return false;
		RoomDtoBoilerplate other = (RoomDtoBoilerplate) o;
		return Objects.equals(this.name, other.name) &&
		       Objects.equals(this.barrierFree,
		                      other.barrierFree);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "(" +
		       "name = " + name + ", " +
		       "barrierFree = " + barrierFree + ")";
	}
}