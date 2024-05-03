package com.nayamsoft.ChatGPTDemo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatDPTRequest {

    public String model;
    public List<Message> message;


    public ChatDPTRequest(String model, String prompt) {
        this.model = model;
        this.message = new ArrayList<>();
        this.message.add(new Message("user", prompt));

    }
}
