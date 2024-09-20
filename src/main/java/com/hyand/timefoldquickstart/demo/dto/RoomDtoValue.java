package com.hyand.timefoldquickstart.demo.dto;

import com.hyand.timefoldquickstart.demo.Room;
import jakarta.validation.constraints.NotEmpty;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Room}
 */
@Value
public class RoomDtoValue implements Serializable {
	@NotEmpty
	String name;
	Boolean barrierFree;
}