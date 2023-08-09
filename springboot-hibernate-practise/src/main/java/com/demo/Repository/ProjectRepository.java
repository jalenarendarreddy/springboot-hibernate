package com.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
