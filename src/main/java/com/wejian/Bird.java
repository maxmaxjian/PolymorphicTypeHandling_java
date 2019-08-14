package com.wejian;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Bird extends Animal {
    @JsonProperty("sound")
    public String sound;

    @JsonCreator
    public Bird(@JsonProperty("name") String name, @JsonProperty("sound") String sound) {
        this.name = name;
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Bird [name=" + name + ", sound=" + sound + "]";
    }
}
