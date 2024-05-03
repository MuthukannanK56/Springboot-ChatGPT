package com.nayamsoft.ChatGPTDemo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    //user
    private String role;

    //prompt
    private String content;

}
