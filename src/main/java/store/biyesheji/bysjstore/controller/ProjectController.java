package store.biyesheji.bysjstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import store.biyesheji.bysjstore.entity.Project;
import store.biyesheji.bysjstore.service.ProjectService;
/**
 * 
 * @author Jingdong
 * @date 2020年2月28日 下午5:42:30
 */
@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
	@RequestMapping()
	public String listProject(ModelMap map,@RequestParam(value = "tags", required = false) String tags) {
		List<Project> list = new ArrayList<Project>();
		if(tags != null) {
			list = projectService.getProjectsByTags(tags);
		} else {
			list = projectService.listProject();
		}
		map.addAttribute("projects",list);
		return "project";
	}
	
	
	@RequestMapping("/{projectId}")
	public String getProjectById(@PathVariable Integer projectId,ModelMap map) {
		Project project = projectService.getProjectById(projectId);
		map.addAttribute("project",project);
		return "projectDetail";
	}
}
