package ru.sarvartdinov.service.sms.service.impl;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import ru.sarvartdinov.service.sms.service.SmsService;

@Component
public class SmsServiceImpl implements SmsService {
    private static final String SMS_LOG_FORMAT = "New sms: %s";

    private Logger logger = LogManager.getLogger(SmsServiceImpl.class);


    @Override
    public void sendSms(String message) {
        logger.info(String.format(SMS_LOG_FORMAT, message));
    }
}
