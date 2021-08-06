package edu.uganew.ugajuly.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name ="advisors")
public class Advisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="first_name",nullable = false)
    private String FirstName;
    @Column(name ="last_name")
    private String LastName;
    @Column(name ="email")
    private String Email;
    @Column(name ="title")
    private String Title;
    @Column(name ="office")
    private String Office;
    @Column(name ="Phone")
    private String Phone;
    @Column(name="Description")
    private String Description;
//    @Column(name="photo");
    private String Photo;
//    @Column(name="link");
    private String Link;

    @OneToMany(mappedBy = "advisor")
    Set<Assignment> assignments;
//    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "advisorSet")
//    private Set<Major> majorSet= new HashSet<>();

    public Advisor()
    {

    }
    public Advisor(Long id, String firstName, String lastName, String email, String title, String office, String phone,String description,String photo,String link) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Title = title;
        Office = office;
        Phone = phone;
        Description = description;
        Photo = photo;
        Link = link;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getOffice() {
        return Office;
    }

    public void setOffice(String office) {
        Office = office;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        this.Link = link;
    }

}
