package com.cg.ppmtoolapi.repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.ppmtoolapi.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>
{
	Project findByProjectIdentifier(String projectIdentifier);
	
	@Override
	Iterable<Project> findAll();
	
	@Override
	void deleteById(Long id);
	
	
}
