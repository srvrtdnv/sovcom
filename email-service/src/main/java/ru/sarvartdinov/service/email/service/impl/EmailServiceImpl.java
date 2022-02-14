package ru.sarvartdinov.service.email.service.impl;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import ru.sarvartdinov.service.email.service.EmailService;

@Component
public class EmailServiceImpl implements EmailService {
    private static final String EMAIL_LOG_FORMAT = "New email: %s";

    private Logger logger = LogManager.getLogger(EmailServiceImpl.class);

    @Override
    public void sendEmail(String message) {
        logger.info(String.format(EMAIL_LOG_FORMAT, message));
    }
}
