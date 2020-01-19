package com.example.WeeklyReport.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WeeklyReport.domain.dto.ProjectDto;
import com.example.WeeklyReport.env.entity.Project;
import com.example.WeeklyReport.env.mapper.ProjectMapper;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectMapper projectMapper;

	public List<ProjectDto> fetchList() {
		
		List<Project> projectList = projectMapper.findAll();
		
		System.out.println(projectList);
		List<ProjectDto> projectDtoList = new ArrayList<>();
		
		projectList.stream().forEach(x -> projectDtoList.add(ProjectDto.of(x)));
		System.out.println(projectDtoList.size());
		
		return projectDtoList;
	}
}
