package com.barclays;


import com.barclays.controller.MessageController;
import com.barclays.model.Message;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MessageControllerIntegrationTests {

    @Autowired
    MessageController messageController;

    @Test
    public void getMessage1(){
       Message message = messageController.getMessage(1);
       assertEquals("Spring is neat1", message.getContent());
    }

}
