package com.nayamsoft.ChatGPTDemo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatGPTResponse {

    private List<Choice> choiceList;
@Data
    public static class Choice{
        private int index;
        private String message;
    }


}
