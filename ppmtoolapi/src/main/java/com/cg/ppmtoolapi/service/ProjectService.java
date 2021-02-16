package com.cg.ppmtoolapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ppmtoolapi.domain.Project;
import com.cg.ppmtoolapi.exception.ProjectIdException;
import com.cg.ppmtoolapi.repository.ProjectRepository;

@Service
public class ProjectService
{
	
@Autowired
private ProjectRepository projectRepository;

public Project saveOrUpdate(Project project)
{
	return projectRepository.save(project);
}

public Project findProjectByProjectIdentifier(String projectIdentifier)
{
	Project project = projectRepository.findByProjectIdentifier(projectIdentifier.toUpperCase());
	if(project==null)
	{
		throw new ProjectIdException("Project Id :" + projectIdentifier.toUpperCase()+ "does not exist" );
	}
	return project;
}

public Iterable<Project> getAllProjects() {
	// TODO Auto-generated method stub
	Iterable<Project> project = projectRepository.findAll();
	return project;
}

public void deleteByIdTdentifier(String projectIdentifier)
{
	Project project = projectRepository.findByProjectIdentifier(projectIdentifier.toUpperCase());
	if(project==null)
	{
		throw new ProjectIdException("cannot delete project by Id :" + projectIdentifier.toUpperCase()+ "does not exist" );
	}
}

}
