package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
public class Employer extends AbstractEntity{

    @NotBlank
    @Size(min = 2, max = 100)
    private String location;


    public Employer(@NotBlank @Size(min = 2, max = 100) String location){
        this.location = location;

    }

    public Employer(){
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
         this.location = location;
    }
}
