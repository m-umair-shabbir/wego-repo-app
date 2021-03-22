package com.umair.fortuneservices.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "quotes")
public class Quotes {

    @Id
    @NotNull
    private Long id;

    @Column(name = "message")
    private String message;

    public Quotes() {

    }

    public Quotes(Long id, String title) {
        this.id = id;
        this.message = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
