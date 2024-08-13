package com.hyand.timefoldquickstart.rest;

import ai.timefold.solver.core.api.solver.SolverJob;
import ai.timefold.solver.core.api.solver.SolverManager;
import com.hyand.timefoldquickstart.domain.Timetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/timetable")
public class TimetableController {
	@Autowired
	private SolverManager<Timetable, UUID> solverManager;

	@PostMapping("/solve")
	public Timetable solve(@RequestBody Timetable problem) {
		SolverJob<Timetable, UUID> solverJob = solverManager.solve(UUID.randomUUID(), problem);
		Timetable solution;
		try {
			solution = solverJob.getFinalBestSolution();
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException("Solving failed", e);
		}
		return solution;
	}
}
