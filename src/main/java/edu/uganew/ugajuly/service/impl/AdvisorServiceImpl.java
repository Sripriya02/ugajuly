package edu.uganew.ugajuly.service.impl;

import edu.uganew.ugajuly.entity.Advisor;
import edu.uganew.ugajuly.repository.AdvisorRepository;
import edu.uganew.ugajuly.service.AdvisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvisorServiceImpl implements AdvisorService {

    @Autowired
    private AdvisorRepository advisorRepository;

    public AdvisorServiceImpl(AdvisorRepository advisorRepository) {
        this.advisorRepository = advisorRepository;
    }

    @Override
    public List<Advisor> getAllAdvisors()
    {
        return advisorRepository.findAll();
    }
    @Override
    public Advisor saveAdvisor(Advisor advisor)
    {
        return advisorRepository.save(advisor);
    }
    @Override
    public Advisor getAdvisorById(Long id){ return advisorRepository.findById(id).get();}
    @Override
    public Advisor updateAdvisor(Advisor advisor){ return advisorRepository.save(advisor);}

    @Override
    public void deleteAdvisorById(Long id) {
        advisorRepository.deleteById(id);
    }

    public List<Advisor> findByStuLastName(String studendName, String majorid) {

        return advisorRepository.findByStuLastName(studendName.substring(0,2),majorid);
    }
}
