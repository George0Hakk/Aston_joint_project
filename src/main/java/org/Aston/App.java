package org.Aston;

import lombok.var;
import org.Aston.Bot.Bot;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@SpringBootApplication
public class App {
    public static void main(String[] args) throws TelegramApiException {
        //через ${} не получилось вставит токен и имя бота из application.properties
       Bot bot = new Bot("Aston_joint_project", "7696883256:AAGNUHB25c3EnaNJN6N2E_yGDxEGhdHQiZA") ;
       System.out.println("Все работает!");
    }
}
