package com.hyand.timefoldquickstart.demo.dto;

import com.hyand.timefoldquickstart.demo.Room;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link Room}
 */
@AllArgsConstructor
@Getter
@EqualsAndHashCode @ToString
public final class RoomDtoLombokBasic implements Serializable {
	@NotEmpty
	private final String name;
	private final Boolean barrierFree;
}