package store.biyesheji.bysjstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import store.biyesheji.bysjstore.entity.Project;
import store.biyesheji.bysjstore.entity.ProjectImage;
import store.biyesheji.bysjstore.repository.ProjectImageRepository;
import store.biyesheji.bysjstore.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	ProjectRepository repo;
	
	@Autowired
	ProjectImageRepository imageRepo;

	@Override
	public List<Project> listProject() {
		return repo.findAll();
	}

	@Override
	public Project getProjectById(Integer id) {
		Project project = repo.getOne(id);
		List<ProjectImage> projectImages = imageRepo.getProjectImagesByProjectId(project.getId());
		project.setProjectImages(projectImages);
		return repo.getOne(id);
	}

	@Override
	public List<Project> getProjectsByTags(String tags) {
		return repo.getProjectsByTags(tags);
	}

}
