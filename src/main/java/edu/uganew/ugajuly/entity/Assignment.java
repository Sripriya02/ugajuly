package edu.uganew.ugajuly.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="assignment")
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="assignmentid")
    private Long assignmentid;

    @ManyToOne
    @MapsId("majorid")
    @JoinColumn(name="majorid")
    private Major major;

    public String getMajorid() {
        return majorid;
    }

    public void setMajorid(String majorid) {
        this.majorid = majorid;
    }

    public Long getAdvisorid() {
        return advisorid;
    }

    public void setAdvisorid(Long advisorid) {
        this.advisorid = advisorid;
    }

    private String majorid;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(name="advisorid")
    private Advisor advisor;
    private Long advisorid;

    private String Alpha1;
    private String Alpha2;


    public Assignment(Long assignmentid, Major major, String majorid, Advisor advisor, Long advisorid, String alpha1, String alpha2) {
        this.assignmentid = assignmentid;
        this.major = major;
        this.majorid = majorid;
        this.advisor = advisor;
        this.advisorid = advisorid;
        Alpha1 = alpha1;
        Alpha2 = alpha2;
    }

    public Assignment()
    {

    }


    public Long getAssignmentid() {
        return assignmentid;
    }

    public void setId(Long assignmentid) {
        this.assignmentid = assignmentid;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public String getAlpha1() {
        return Alpha1;
    }

    public void setAlpha1(String alpha1) {
        Alpha1 = alpha1;
    }

    public String getAlpha2() {
        return Alpha2;
    }

    public void setAlpha2(String alpha2) {
        Alpha2 = alpha2;
    }

}
