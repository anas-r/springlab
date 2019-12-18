package com.emse.spring.faircorp.model;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class Light {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private Integer level;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @ManyToOne(optional = false)
    private Room room;

    public Light() {
    }

    public Light(Integer level, Status status, Room room) {
        this.room = room;
        this.level = level;
        this.status = status;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Room getRoom() {
        return room;
    }
}
