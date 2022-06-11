package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
public class SchedulerService {
	private final SchedulerRepository schedulerRepository;

    public SchedulerService(SchedulerRepository schedulerRepository) {
        this.schedulerRepository = schedulerRepository;
    }

    @Transactional
    public DtoSchedulerResponse postScheduler(DtoScheduler dtoScheduler) {
    	SchedulerEntity schedulerEntity = new SchedulerEntity(dtoScheduler);
    	schedulerRepository.save(schedulerEntity);
        return new DtoSchedulerResponse(schedulerEntity);
    }
}
// Scheduler   scheduler