package com.nashlincoln.blink.model;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table DEVICE_TYPE.
 */
public class DeviceType {

    private Long id;
    private String description;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public DeviceType() {
    }

    public DeviceType(Long id) {
        this.id = id;
    }

    public DeviceType(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
