package edu.uganew.ugajuly.service;

import edu.uganew.ugajuly.entity.Major;

import java.util.List;

public interface MajorService {

    List<Major> getAllMajors();
    Major saveMajor(Major major);
    Major getMajorById(String id);
    Major updateMajor(Major major);
    void deleteMajorById(String id);
}
