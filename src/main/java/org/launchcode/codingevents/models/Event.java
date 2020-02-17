package org.launchcode.codingevents.models;

import javax.validation.constraints.*;

public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Name field cannot be blank.")
    @Size(min=3, max=50, message = "Name must be between 3 and 50 characters.")
    private String name;

    @Size(max = 500, message = "Description too long.")
    private String description;

    @NotBlank(message="Email field cannot be blank.")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    //@NotNull how does this get validated
    @NotBlank(message = "Enter a location.")
    @Size(max = 50, message = "Location too long.")
    private String location;

    //How do I validate this?
    @AssertTrue(message="You must register for this event.")
    private Boolean registered;

    public Event(String name, String description, String contactEmail, String location, Boolean registered) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.registered = registered;
        this.id = nextId;
        nextId++;
    }

    public Event() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getRegistered() {
        return registered;
    }

    public void setRegistered(Boolean registered) {
        this.registered = registered;
    }

    @Override
    public String toString() {
        return name;
    }


}
