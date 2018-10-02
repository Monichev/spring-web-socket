package my.spring.websocket.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {
    private final String name;
    private final String message;

    @JsonCreator
    public Message(
            @JsonProperty("name") String name,
            @JsonProperty("message") String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }
}
