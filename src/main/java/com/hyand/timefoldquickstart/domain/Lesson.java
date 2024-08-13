package com.hyand.timefoldquickstart.domain;

import ai.timefold.solver.core.api.domain.entity.PlanningEntity;
import ai.timefold.solver.core.api.domain.lookup.PlanningId;
import ai.timefold.solver.core.api.domain.variable.PlanningVariable;
import lombok.*;

@PlanningEntity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Lesson {

	@PlanningId
	private String id;

	private String subject;
	private String teacher;
	private String studentGroup;

	@PlanningVariable
	@Setter
	private Timeslot timeslot;

	@PlanningVariable
	@Setter
	private Room room;
}