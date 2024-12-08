package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Message;
import com.example.demo.repository.MessageRepository;

@Service
public class MessageService implements MessageServiceInterface {

    @Autowired
    private MessageRepository messageRepository;

    public void saveMessage1(Message message) {
        messageRepository.save(message);
    }

	@Override
	public void saveMessage(Message message) {
		 messageRepository.save(message);
		// TODO Auto-generated method stub
		
	}
}
