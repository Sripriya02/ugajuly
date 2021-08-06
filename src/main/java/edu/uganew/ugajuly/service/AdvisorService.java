package edu.uganew.ugajuly.service;

import edu.uganew.ugajuly.entity.Advisor;

import java.util.List;

public interface AdvisorService {

    List<Advisor> getAllAdvisors();
    Advisor saveAdvisor(Advisor advisor);
    Advisor getAdvisorById(Long id);
    Advisor updateAdvisor(Advisor advisor);
    void deleteAdvisorById(Long id);
    List<Advisor> findByStuLastName(String studendName,String majorid);

}
