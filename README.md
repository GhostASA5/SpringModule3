# Веб приложение Менеджер контактов

## Описание проекта
Проект реализует контактную книжку. Вы можете просмотреть, создать, изменить или
удалить разные контакты.

После запуска приложения перейдите по ссылке http://localhost:8080/
На главной странице высветится список контактов. Каждый контакт можно изменить или удалить.
Также ниже присутствует кнопка Create contact. Нажав на нее у вас появится форма
по созданию нового контакта. При создании нового контакта, должны быть заполнены все поля.


## Используемые технологии

- Spring Boot 3
- Gradle 8.6
- Lombok
- JDK 17

## Запуск проекта
Проект можно запустить двумя способами:
1. Запустить SpringModul3Application.java по расположению src/main/java/com/example/SpringModul3/SpringModul3Application.java

2. Запустить docker-compose.yaml. Для этого перейдите в папку docker и запустите 
команду:
```shell
docker-compose up
```
