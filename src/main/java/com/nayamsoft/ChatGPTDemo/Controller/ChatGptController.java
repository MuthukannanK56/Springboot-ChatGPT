package com.nayamsoft.ChatGPTDemo.Controller;

import com.nayamsoft.ChatGPTDemo.DTO.ChatDPTRequest;
import com.nayamsoft.ChatGPTDemo.DTO.ChatGPTResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/bot")
public class ChatGptController {



    @Value("${openai.model}")
    public String model;
    @Value("${openai.restUrl}")
    public String reurl;

    @Autowired
    private RestTemplate template;

@GetMapping("/chat")
    public String chatGPTResponse(@RequestParam("prompt") String prompt){
          ChatDPTRequest request = new ChatDPTRequest(model, prompt);

        ChatGPTResponse chatGPTResponse=  template.postForObject(reurl, request, ChatGPTResponse.class);
          return chatGPTResponse.getChoiceList().get(0).getMessage();
    }


}
