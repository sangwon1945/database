package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
public class ProjectService {
	private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Transactional
    public DtoProjectResponse postProject(DtoProject dtoProject) {
    	ProjectEntity projectEntity = new ProjectEntity(dtoProject);
    	projectRepository.save(projectEntity);
        return new DtoProjectResponse(projectEntity);
    }
}