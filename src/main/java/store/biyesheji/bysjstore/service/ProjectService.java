package store.biyesheji.bysjstore.service;

import java.util.List;

import store.biyesheji.bysjstore.entity.Project;

public interface ProjectService {
	
	List<Project> listProject();

	Project getProjectById(Integer id);

	List<Project> getProjectsByTags(String tags);

}
