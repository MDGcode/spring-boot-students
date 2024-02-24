package org.etti.students.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student andrei = new Student(
                    "Andrei",
                    LocalDate.of(2000,1,22),
                    "andrei@gmail.com");
            Student stefan = new Student(
                    "Stefan",
                    LocalDate.of(2008,1,22),
                    "stefan@gmail.com");
            repository.saveAll(List.of(stefan,andrei));
        };
    }
}
