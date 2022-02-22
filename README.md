# Задание (текст не изменен)
Необходимо реализовать API для отправки уведомлений 3мя разными каналами. 
1) СМС 
2) push 
3) e-mail 

Решение необходимо построить на микросервисной архитектуре на стеке Spring Cloud, используя такие компоненты как Gateway, Spring Eureka, не нужно реализовывать никаких дополнительных интеграций с сервисами отправки (смс, push, email). в качестве срабатывания отправки достаточно просто написать в лог 1) "sms was sent" 2) "psuh was sent" 3) "email was sent" приложения должны запускаться в докере вариант запуска на усмотрение

# Запуск
В директориях сервисов есть Docker-файлы, с помощью которых можно собрать образы и запустить на их основе контейнеры.
    
В состоянии as-is для обращений к eureka и config-service используются hostname - запускать контейнеры необходимо 
в одной user-defined сети с именем контейнера config для config-service и eureka для eureka-service (порт для api-gateway 8080), либо изменить настройки.


# Конфигурация

- Spring проперти хранятся централизованно (кроме логирования) в config-service (resources/configs)
- Настройки логирования лежат в каждом сервисе (resources/log4j.properties) 

# Логирование

- Для логирования используется log4j и настроены 2 appender-а (терминал и graylog)
- Для корректной отправки логов в graylog необходимо убедиться, что настройки соответствуют существующему input-у на сервере

# API
Апи генерируется с помощью swagger-codegen из yaml-файлов, которые лежат в корне email-, push- и sms-service.
