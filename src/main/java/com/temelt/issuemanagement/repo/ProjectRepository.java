package com.temelt.issuemanagement.repo;

import com.temelt.issuemanagement.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project,Long> {
//sorgular
    List<Project> getAllByProjectCode(String projectCode); //proje koduyla eşleşen kayıtları getirsin,get: ilgili parametereye göre kayıtları getir
    List<Project> getAllByProjectCodeAndIdNotNull (String projectCode);
    List<Project> getAllByProjectCodeAndProjectNameContains (String projectCode, String name); // name i de içerecek şekilde arıyor



}
