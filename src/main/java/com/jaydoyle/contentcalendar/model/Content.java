package com.jaydoyle.contentcalendar.model;

import java.time.LocalDateTime;

public record Content(
        Integer id,
        String title,
        String desc,
        Status status,
        Type article,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url) {
}
