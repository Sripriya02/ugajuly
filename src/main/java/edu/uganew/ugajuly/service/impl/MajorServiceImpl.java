package edu.uganew.ugajuly.service.impl;

import edu.uganew.ugajuly.entity.Advisor;
import edu.uganew.ugajuly.entity.Major;
import edu.uganew.ugajuly.repository.MajorRepository;
import edu.uganew.ugajuly.service.MajorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MajorServiceImpl implements MajorService {

    private MajorRepository majorRepository;
    public MajorServiceImpl(MajorRepository majorRepository) {
        this.majorRepository = majorRepository;
    }

    @Override
    public List<Major> getAllMajors()
    {
        return majorRepository.findAll();
    }
    @Override
    public Major saveMajor(Major major  )
    {
        return majorRepository.save(major);
    }
    @Override
    public Major getMajorById(String id){ return majorRepository.findById(id).get();}
    @Override
    public Major updateMajor(Major major){ return majorRepository.save(major);}

    @Override
    public void deleteMajorById(String id) {
        majorRepository.deleteById(id);
    }

}
