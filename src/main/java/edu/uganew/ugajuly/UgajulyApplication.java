package edu.uganew.ugajuly;

import edu.uganew.ugajuly.entity.Advisor;
import edu.uganew.ugajuly.entity.Major;
import edu.uganew.ugajuly.repository.AdvisorRepository;
import edu.uganew.ugajuly.repository.MajorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UgajulyApplication// implements CommandLineRunner
 {

//    @Autowired
//    private AdvisorRepository advisorRepository;
//
//    @Autowired
//    private MajorRepository majorRepository;

    public static void main(String[] args) {
        SpringApplication.run(UgajulyApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        Advisor advisor = new Advisor(2L,"c","a","g","h","h","j");
//        Major major = new Major("11","be");
//        Major major1 = new Major("12","df");
//        advisor.getmajor
//    }
}
