package com.hyand.timefoldquickstart.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.DayOfWeek;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Timeslot {
	private DayOfWeek dayOfWeek;
	private LocalTime startTime;
	private LocalTime endTime;
}
