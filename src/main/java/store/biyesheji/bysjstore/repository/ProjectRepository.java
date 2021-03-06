package store.biyesheji.bysjstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import store.biyesheji.bysjstore.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{

	List<Project> getProjectsByTags(String tags);

}
