package com.example.day21lab5eventsystem.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@JsonFormat
public class Event {
    private String id;
    private String description;
    private int capacity;
    private Date start_date;
    private Date end_date;
}
