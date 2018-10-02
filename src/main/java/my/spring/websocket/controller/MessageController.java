package my.spring.websocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import my.spring.websocket.dto.Message;

@Controller
public class MessageController {

    @MessageMapping("/send")
    @SendTo("/topic/messages")
    public Message send(Message message) throws Exception {
        Thread.sleep(500); // simulated delay
        return new Message(HtmlUtils.htmlEscape(message.getName()), HtmlUtils.htmlEscape(message.getMessage()));
    }

}
