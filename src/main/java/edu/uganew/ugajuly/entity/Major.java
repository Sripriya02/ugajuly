package edu.uganew.ugajuly.entity;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name ="majors")
public class Major {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="majorid",nullable = false)
    private String majorid;
    @Column(name="majorname",nullable = false)
    private String majorname;

    @OneToMany(mappedBy = "major")
    Set<Assignment> assignments;

//    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//    @JoinTable(name ="advisor_assignment",
//            joinColumns = {@JoinColumn(name="majorid")},
//            inverseJoinColumns = {@JoinColumn(name="id")})
//    private Set<Advisor> advisorSet= new HashSet<>();

    public Major(){

    }

    public Major(String majorid, String majorname) {
        this.majorid = majorid;
        this.majorname = majorname;
    }
    public String getMajorid() {
        return majorid;
    }

    public void setMajorid(String majorid) {
        this.majorid = majorid;
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname;
    }


}
