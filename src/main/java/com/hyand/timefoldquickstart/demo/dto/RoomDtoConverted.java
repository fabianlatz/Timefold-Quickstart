package com.hyand.timefoldquickstart.demo.dto;

import com.hyand.timefoldquickstart.demo.Room;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link Room}
 */
public final class RoomDtoConverted implements Serializable {
	private final @NotEmpty String name;
	private final Boolean barrierFree;

	public RoomDtoConverted(@NotEmpty String name,
	                        Boolean barrierFree) {
		this.name = name;
		this.barrierFree = barrierFree;
	}

	public @NotEmpty String name() {
		return name;
	}

	public Boolean barrierFree() {
		return barrierFree;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, barrierFree);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (obj == null ||
		    obj.getClass() != this.getClass())
			return false;
		RoomDtoConverted other = (RoomDtoConverted) obj;
		return Objects.equals(this.name, other.name) &&
		       Objects.equals(this.barrierFree,
		                      other.barrierFree);
	}

	@Override
	public String toString() {
		return "RoomDtoConverted[" +
		       "name=" + name + ", " +
		       "barrierFree=" + barrierFree + ']';
	}
}