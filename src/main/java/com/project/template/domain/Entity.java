package com.project.template.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@javax.persistence.Entity(name = "tablename")
public class Entity {

    /*@Id
    private long id;

    @Column(name = "field2")
    private String field2;

    @Column(name = "field3")
    @Size(max = 255)
    private String field3;

    public Entity(long id, String field2, String field3) {
        this.id = id;
        this.field2 = field2;
        this.field3 = field3;
    }*/
}