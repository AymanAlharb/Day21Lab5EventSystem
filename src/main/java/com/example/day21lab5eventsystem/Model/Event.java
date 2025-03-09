package com.example.day21lab5eventsystem.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@JsonFormat(pattern = "yyyy-mm-dd")
public class Event {
    private String id;
    private String description;
    private int capacity;
    private LocalDateTime start_date;
    private LocalDateTime end_date;
}
