package ru.sarvartdinov.service.email.api.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.sarvartdinov.service.email.api.EmailApiDelegate;
import ru.sarvartdinov.service.email.service.EmailService;

@Service
public class EmailApiImpl implements EmailApiDelegate {

    private EmailService emailService;

    public EmailApiImpl(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public ResponseEntity<Void> sendEmail(String body) {
        emailService.sendEmail(body);
        return ResponseEntity.ok().build();
    }
}
