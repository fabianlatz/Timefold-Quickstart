package com.hyand.timefoldquickstart.solver;

import ai.timefold.solver.core.api.score.buildin.hardsoft.HardSoftScore;
import ai.timefold.solver.core.api.score.stream.Constraint;
import ai.timefold.solver.core.api.score.stream.ConstraintFactory;
import ai.timefold.solver.core.api.score.stream.ConstraintProvider;
import ai.timefold.solver.core.api.score.stream.Joiners;
import com.hyand.timefoldquickstart.domain.Lesson;

public class TimetableConstraintProvider implements ConstraintProvider {
	@Override
	public Constraint[] defineConstraints(ConstraintFactory constraintFactory) {
		return new Constraint[]{
				roomConflict(constraintFactory),
				teacherConflict(constraintFactory),
				studentGroupConflict(constraintFactory)
		};
	}

	private Constraint studentGroupConflict(ConstraintFactory constraintFactory) {
		return constraintFactory.forEachUniquePair(
						Lesson.class,
						Joiners.equal(Lesson::getTimeslot),
						Joiners.equal(Lesson::getStudentGroup))
				.penalize(HardSoftScore.ONE_HARD)
				.asConstraint("Student Group Conflict");
	}

	private Constraint roomConflict(ConstraintFactory constraintFactory) {
		return constraintFactory.forEachUniquePair(
						Lesson.class,
						Joiners.equal(Lesson::getTimeslot),
						Joiners.equal(Lesson::getRoom))
				.penalize(HardSoftScore.ONE_HARD)
				.asConstraint("Room Conflict");
	}

	private Constraint teacherConflict(ConstraintFactory constraintFactory) {
		return constraintFactory.forEachUniquePair(
						Lesson.class,
						Joiners.equal(Lesson::getTimeslot),
						Joiners.equal(Lesson::getTeacher))
				.penalize(HardSoftScore.ONE_HARD)
				.asConstraint("Teacher Conflict");
	}
}
