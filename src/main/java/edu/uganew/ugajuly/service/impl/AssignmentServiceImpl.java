package edu.uganew.ugajuly.service.impl;

import edu.uganew.ugajuly.entity.Assignment;
import edu.uganew.ugajuly.repository.AssignmentRepository;
import edu.uganew.ugajuly.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentServiceImpl implements AssignmentService {

    @Autowired
    private AssignmentRepository assignmentRepository;
    public AssignmentServiceImpl(AssignmentRepository assignmentRepository) {
        this.assignmentRepository = assignmentRepository;
    }

    @Override
    public List<Assignment> getAllAssignments() {
        return assignmentRepository.findAll();
    }

    @Override
    public Assignment saveAssignment(Assignment assignment) {
        return (Assignment) assignmentRepository.save(assignment);
    }

//    @Override
//    public Assignment getAssignmentbyId(Long assignmentid) {
//        return assignmentRepository.findAllById(assignmentid).get();
//    }

//    @Override
//    public Assignment updateAssignment(Assignment assignment) {
//        return assignmentRepository.save(assignment);
//    }
}
