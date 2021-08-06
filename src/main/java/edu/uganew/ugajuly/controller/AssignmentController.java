package edu.uganew.ugajuly.controller;

import edu.uganew.ugajuly.entity.Advisor;
import edu.uganew.ugajuly.entity.Assignment;
import edu.uganew.ugajuly.entity.Major;
import edu.uganew.ugajuly.service.AssignmentService;
import edu.uganew.ugajuly.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AssignmentController {

    @Autowired
    private AssignmentService assignmentService;

    @Autowired
    private MajorService majorService;

    public AssignmentController(AssignmentService assignmentService) {
        this.assignmentService = assignmentService;
    }

//    @GetMapping("/assignments")
//    public String listAssignment(Model model)
//    {
//        model.addAttribute("assignments",assignmentService.getAllAssignments());
//        return "assignment_advisor";
//    }
    @GetMapping("/assignments/{id}")
    public String addassignment(Model model)
    {
        Assignment assignment = new Assignment();
        model.addAttribute("assignment",assignment);
        model.addAttribute("majors",majorService.getAllMajors());
        model.addAttribute("assignments",assignmentService.getAllAssignments());
        return "assignment_advisor";
    }

    @PostMapping("/assignments")
    public String saveAssignment(@ModelAttribute("assignment") Assignment assignment)
    {
        assignmentService.saveAssignment(assignment);
        return "redirect:/assignments";
    }

//    @GetMapping("/advisors/assignments/{id}")
//   public String advisorAssignmentForm(@PathVariable Long id, Model model)
//    {
//      model.addAttribute("advisor",advisorService.getAdvisorById(id));
//       return "assignment_advisor";
//    }
}
