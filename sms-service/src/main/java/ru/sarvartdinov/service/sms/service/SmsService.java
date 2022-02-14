package ru.sarvartdinov.service.sms.service;

/**
 * Сервис, отвечающий за работу с смс
 */
public interface SmsService {

    /**
     * Отправить смс
     *
     * @param message текст смс
     */
    void sendSms(String message);

}
