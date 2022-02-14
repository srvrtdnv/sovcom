package ru.sarvartdinov.service.email.service;

public interface EmailService {

    /**
     * Отпарвить  эл. письмо
     *
     * @param message текст письма
     */
    void sendEmail(String message);

}
