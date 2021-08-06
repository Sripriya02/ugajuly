package edu.uganew.ugajuly.controller;

import edu.uganew.ugajuly.entity.Advisor;
import edu.uganew.ugajuly.entity.Major;
import edu.uganew.ugajuly.service.MajorService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MajorController {

    private MajorService majorService;

    public MajorController(MajorService majorService) {
        this.majorService = majorService;
    }


    @GetMapping("/majors")
    public String addmajor(Model model)
    {
//        model.addAttribute("majors",majorService.getAllMajors());
        Major major = new Major();
        model.addAttribute("Major",major);
        model.addAttribute("majors",majorService.getAllMajors());
        return "majors";
    }

    @PostMapping("/majors")
    public String saveMajor(@ModelAttribute("major") Major major)
    {
        majorService.saveMajor(major);
        return "redirect:/majors";
    }
    @GetMapping("/majors/edit/{id}")
    public String editMajorForm(@PathVariable String id, Model model)
    {
        model.addAttribute("major",majorService.getMajorById(id));
        return "majors";
    }

    @PostMapping("/majors/{id}")
    public String updateAdvisor(@PathVariable String id, @ModelAttribute("major") Major major)
    {
        //get advisor from database by id
        Major existingMajor = majorService.getMajorById(id);
        existingMajor.setMajorid(major.getMajorid());
        existingMajor.setMajorname(major.getMajorname());
        //save update major object
        majorService.updateMajor(existingMajor);
        return "redirect:/majors";
    }

    //handler method to handle delete major
    @GetMapping("/majors/{id}")
    public String deleteMajor(@PathVariable String id)
    {
        majorService.deleteMajorById(id);
        return "redirect:/majors";
    }



}
