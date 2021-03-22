package com.umair.fortuneservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


public class HealthCheck {

    private Boolean health;
    private String message;

    public HealthCheck() {

    }
    public HealthCheck(Boolean health, String message) {
        this.health = health;
        this.message = message;
    }
    public Boolean getHealth() {
        return health;
    }
    public void setHealth(Boolean health) {
        this.health = health;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
