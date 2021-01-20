package com.temelt.issuemanagement.repo;

import com.temelt.issuemanagement.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepostory extends JpaRepository<Issue,Long> {



}
