package ua.nure.smarttravel;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Александр on 5/10/2017.
 */
@SpringBootApplication
@EnableJSONDoc
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}