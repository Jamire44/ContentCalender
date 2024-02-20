package com.jaydoyle.contentcalendar;

import com.jaydoyle.contentcalendar.model.Content;
import com.jaydoyle.contentcalendar.model.Status;
import com.jaydoyle.contentcalendar.model.Type;
import com.jaydoyle.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@SpringBootApplication
public class ContentCalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentCalendarApplication.class, args);
	}

}
