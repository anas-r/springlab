package com.emse.spring.faircorp.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Room {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false, length=255)
    private String name;

    @Column(nullable = false)
    private Long floorNb;

    @OneToMany(mappedBy = "room")
    private List<Light> lightList;

    public Room(Integer id, String name, Long floorNb, List<Light> lightList) {
        this.id = id;
        this.name = name;
        this.floorNb = floorNb;
        this.lightList = lightList;

    }
    public Room() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getFloorNb() {
        return floorNb;
    }

    public void setFloorNb(Long floorNb) {
        this.floorNb = floorNb;
    }

    public List<Light> getLightList() {
        return lightList;
    }

    public void setLightList(List<Light> lightList) {
        this.lightList = lightList;
    }
}
