package com.tpe.repository;

import com.tpe.domain.Message;
import org.springframework.stereotype.Component;

@Component
public class DbRepository implements Repository{
    @Override
    public void SaveMessage(Message message) {
        System.out.println("Mesajiniz Veri Tabanina eklendi "+message.getMessage());
    }
}
