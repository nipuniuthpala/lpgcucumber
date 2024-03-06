package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Users {

    public String getName() {
        return name;
    }

    public String job() {
        return job;
    }

    @JsonProperty("name")
    private String name;
    @JsonProperty("job")
    private String job;

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
