package com.example.HibernateSpringBootCheFunziona.entity;

import jakarta.persistence.*;

import java.util.List;

@Table
@Entity
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "classes")
    private List<Enrollments> enrollments;

    public Classes(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Classes() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

