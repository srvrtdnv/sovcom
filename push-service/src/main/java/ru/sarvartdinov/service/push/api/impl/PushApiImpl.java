package ru.sarvartdinov.service.push.api.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.sarvartdinov.service.push.api.PushApiDelegate;
import ru.sarvartdinov.service.push.service.PushService;

@Service
public class PushApiImpl implements PushApiDelegate {

    private PushService pushService;

    public PushApiImpl(PushService pushService) {
        this.pushService = pushService;
    }

    @Override
    public ResponseEntity<Void> sendPush(String body) {
        pushService.sendPush(body);
        return ResponseEntity.ok().build();
    }

}
