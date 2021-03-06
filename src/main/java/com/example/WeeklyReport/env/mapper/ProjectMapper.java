package com.example.WeeklyReport.env.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.WeeklyReport.env.entity.Project;

@Mapper
public interface ProjectMapper {

	Project findById(int projectId);
	
	List<Project> findList();
	
	List<Project> findOpenList();
	
	void create(Project project);
	
	void update(Project project);
	
	void changeStatus(@Param("id") int projectId, @Param("statusCode") String statusCode);
}
