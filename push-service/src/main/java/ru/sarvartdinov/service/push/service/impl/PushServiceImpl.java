package ru.sarvartdinov.service.push.service.impl;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import ru.sarvartdinov.service.push.service.PushService;

@Component
public class PushServiceImpl implements PushService {
    private static final String PUSH_LOG_FORMAT = "New push: %s";

    private Logger logger = LogManager.getLogger(PushServiceImpl.class);

    @Override
    public void sendPush(String message) {
        logger.info(String.format(PUSH_LOG_FORMAT, message));
    }
}
