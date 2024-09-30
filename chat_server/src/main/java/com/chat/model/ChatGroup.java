package com.chat.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "chatGroup")
public class ChatGroup {
	@Id
    private String groupId; 
    private String groupName; 
    private String groupAvatar; 
    private List<String> members; 
}
