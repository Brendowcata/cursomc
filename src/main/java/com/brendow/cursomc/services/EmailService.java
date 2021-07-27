package com.brendow.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.brendow.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
