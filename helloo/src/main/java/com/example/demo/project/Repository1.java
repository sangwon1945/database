package com.example.demo.project;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repository1 extends JpaRepository<ProjectEntity, Long> {

}
