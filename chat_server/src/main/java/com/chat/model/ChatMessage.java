package com.chat.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name = "chatMessage")
public class ChatMessage {
	 @Id
    private String messageId; 
    private String senderId; 
    private String receiverId; 
    private String groupId; 
    private String content; 
    private String fileUrl; 
    private Date timestamp; 
}
