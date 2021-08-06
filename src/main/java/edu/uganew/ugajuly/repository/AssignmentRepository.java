package edu.uganew.ugajuly.repository;

import edu.uganew.ugajuly.entity.Advisor;
import edu.uganew.ugajuly.entity.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment,Long> {


}
