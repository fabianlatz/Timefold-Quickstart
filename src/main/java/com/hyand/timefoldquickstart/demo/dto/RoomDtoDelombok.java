package com.hyand.timefoldquickstart.demo.dto;

import com.hyand.timefoldquickstart.demo.Room;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;

/**
 * DTO for {@link Room}
 */
public final class RoomDtoDelombok implements Serializable {
	@NotEmpty
	private final
	String name;
	private final Boolean barrierFree;

	public RoomDtoDelombok(@NotEmpty String name, Boolean barrierFree) {
		this.name = name;
		this.barrierFree = barrierFree;
	}

	public @NotEmpty String getName() {
		return this.name;
	}

	public Boolean getBarrierFree() {
		return this.barrierFree;
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof RoomDtoDelombok)) return false;
		final RoomDtoDelombok other = (RoomDtoDelombok) o;
		final Object this$name = this.getName();
		final Object other$name = other.getName();
		if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
		final Object this$barrierFree = this.getBarrierFree();
		final Object other$barrierFree = other.getBarrierFree();
		if (this$barrierFree == null ? other$barrierFree != null : !this$barrierFree.equals(other$barrierFree)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $name = this.getName();
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		final Object $barrierFree = this.getBarrierFree();
		result = result * PRIME + ($barrierFree == null ? 43 : $barrierFree.hashCode());
		return result;
	}

	public String toString() {
		return "RoomDtoDelombok(name=" + this.getName() + ", barrierFree=" + this.getBarrierFree() + ")";
	}
}