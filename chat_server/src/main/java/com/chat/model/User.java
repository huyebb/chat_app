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
@Table(name = "user")
public class User {
	@Id
    private String id; 
    private String username; 
    private String password; 
    private String email; 
    private String avatar; 
    private String invitationCode; 
    private String status; 
    private Date lastLogin; 
}
