package com.example.amigoscode.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "Mariam.jamal@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 5)


            );
            Student hnin = new Student(
                    "Hnin",
                    "hnin@gmail.com",
                    LocalDate.of(2005, Month.APRIL, 5)

            );
            repository.saveAll(
                    List.of(mariam, hnin)
            );

        };
    }
}
