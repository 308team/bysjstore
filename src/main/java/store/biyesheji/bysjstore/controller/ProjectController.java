package store.biyesheji.bysjstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import store.biyesheji.bysjstore.entity.Project;
import store.biyesheji.bysjstore.service.ProjectService;

@Controller
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
	@RequestMapping()
	public String listProject(ModelMap map) {
		List<Project> list = projectService.listProject();
		for (Project project : list) {
			System.out.println(project.toString());
		}
		map.addAttribute("projects",list);
		return "project";
	}
	
	@RequestMapping("/{projectId}")
	public String getProjectById(@PathVariable Integer projectId,ModelMap map) {
		System.out.println("==========================");
		Project project = projectService.getProjectById(projectId);
		System.out.println(project.toString());
		map.addAttribute("project",project);
		return "projectDetail";
	}
}
