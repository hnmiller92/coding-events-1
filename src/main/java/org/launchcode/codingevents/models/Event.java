package org.launchcode.codingevents.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Event {

    @NotBlank(message="Location is required")
    private String eventLocation;

    public Event(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }
}
