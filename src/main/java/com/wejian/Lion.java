package com.wejian;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Lion extends Animal {
    @JsonProperty("id")
    public int id;

    @JsonCreator
    public Lion(@JsonProperty("name") String name, @JsonProperty("id") int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return  "Lion [name=" + name + ", id=" + id + "]";
    }
}
