package ru.sarvartdinov.service.push.service;

public interface PushService {

    /**
     * Отправить пуш-уведомление
     *
     * @param message текст уведомления
     */
    void sendPush(String message);

}
