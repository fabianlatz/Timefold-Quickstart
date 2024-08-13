package com.hyand.timefoldquickstart.domain;

import ai.timefold.solver.core.api.domain.autodiscover.AutoDiscoverMemberType;
import ai.timefold.solver.core.api.domain.solution.PlanningSolution;
import ai.timefold.solver.core.api.domain.valuerange.ValueRangeProvider;
import ai.timefold.solver.core.api.score.buildin.hardsoft.HardSoftScore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@PlanningSolution(autoDiscoverMemberType = AutoDiscoverMemberType.FIELD)
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Timetable {
	@ValueRangeProvider
	private List<Timeslot> timeslots;

	@ValueRangeProvider
	private List<Room> rooms;

	private List<Lesson> lessons;

	private HardSoftScore score;

}
