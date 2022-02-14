# Запуск
В директориях сервисов есть Docker-файлы, с помощью которых можно собрать образы и запустить на их основе контейнеры.
    
В состоянии as-is для обращений к eureka и config-service используются hostname - запускать контейнеры необходимо 
в одной user-defined сети с именем контейнера config для config-service и eureka для eureka-service (порт для api-gateway 8080), либо изменить настройки.


# Конфигурация

- Spring проперти хранятся централизовано (кроме логирования) в config-service (resources/configs)
- Настроки логирования лежат в каждом сервисе (resources/log4j.properties) 

# Логирование

- Для логирования используется log4j и настроены 2 appender-а (теримнал и graylog)
- Для корректной отправки логов в graylog необходимо убедиться, что настройки соответствуют существующему input-у на сервере