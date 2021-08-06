package edu.uganew.ugajuly.repository;

import edu.uganew.ugajuly.entity.Major;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MajorRepository extends JpaRepository<Major,String> {
}
