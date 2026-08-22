package com.example.demo.Controller;
import com.example.demo.Service.AiService;
import com.example.demo.dto.AiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



//spring.ai.google.genai.api-key=AQ.Ab8RN6JkRVEeQv9BtKyWFcX4KFEdjqYHONvAtbFkx43cdx80wg
//spring.ai.google.genai.chat.options.model=gemini-3.6-flash
//management.endpoints.web.exposure.include=*
//AQ.Ab8RN6JkRVEeQv9BtKyWFcX4KFEdjqYHONvAtbFkx43cdx80wg

@RestController
@RequestMapping("/api/v1/ai")
public class AiController {

    private final AiService aiService;

    public AiController(AiService aiService) {
        this.aiService = aiService;
    }

    @PostMapping
    public ResponseEntity<AiResponse> askFromAi(@RequestParam("query") String query){
        AiResponse aiResponse = aiService.askAi(query);
        return ResponseEntity.ok(aiResponse);
    }
}
