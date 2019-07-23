package ru.milovanov.dev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.milovanov.dev.config.AppConfig;

public class App {
    private final static Logger log = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        log.info("Application start");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
