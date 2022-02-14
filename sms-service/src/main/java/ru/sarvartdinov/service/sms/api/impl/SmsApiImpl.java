package ru.sarvartdinov.service.sms.api.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.sarvartdinov.service.sms.api.SmsApiDelegate;
import ru.sarvartdinov.service.sms.service.SmsService;

@Service
public class SmsApiImpl implements SmsApiDelegate {

    private SmsService smsService;

    public SmsApiImpl(SmsService smsService) {
        this.smsService = smsService;
    }

    @Override
    public ResponseEntity<Void> sendSms(String body) {
        smsService.sendSms(body);
        return ResponseEntity.ok().build();
    }
}
