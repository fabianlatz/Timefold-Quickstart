package com.hyand.timefoldquickstart.demo.dto;

import com.hyand.timefoldquickstart.demo.Room;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;

/**
 * DTO for {@link Room}
 */
public record RoomDtoRecord(
		@NotEmpty String name,
		Boolean barrierFree
) implements Serializable {}