package store.biyesheji.bysjstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import store.biyesheji.bysjstore.entity.Project;
import store.biyesheji.bysjstore.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	ProjectRepository repo;

	@Override
	public List<Project> listProject() {
		return repo.findAll();
	}

	@Override
	public Project getProjectById(Integer id) {
		return repo.getOne(id);
	}

	@Override
	public List<Project> getProjectsByTags(String tags) {
		return repo.getProjectsByTags(tags);
	}

}
