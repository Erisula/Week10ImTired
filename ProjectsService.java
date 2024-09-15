package projects.service;

import java.util.List;

import projects.dao.Project;
import projects.dao.ProjectDao;

public class ProjectsService {
private ProjectDao projectDao = new ProjectDao();
public Project addProject (Project project) {
	return projectDao.insertProject(project);
}
public List<Project> fetchAllProjects() {
	// TODO Auto-generated method stub
	return null;
}
public Project fetchProjectById(Integer projectId) {
	// TODO Auto-generated method stub
	return null;
}
}

