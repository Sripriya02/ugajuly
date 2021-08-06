package edu.uganew.ugajuly.service;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import edu.uganew.ugajuly.entity.Assignment;

import java.util.List;

public interface AssignmentService {

    List<Assignment> getAllAssignments();
    Assignment saveAssignment(Assignment assignment);
//    Assignment getAssignmentbyId(Long id);
//    Assignment updateAssignment(Assignment assignment);
//
}
