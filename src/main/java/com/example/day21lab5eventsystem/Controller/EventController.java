package com.example.day21lab5eventsystem.Controller;

import com.example.day21lab5eventsystem.Api.ApiResponse;
import com.example.day21lab5eventsystem.Model.Event;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
@JsonFormat(pattern = "yyyy-mm-dd")
@RestController
@RequestMapping("/api/v1/event")
public class EventController {
    ArrayList<Event> events = new ArrayList<>();

    @PostMapping("/add")
    public ApiResponse createEvent(@RequestBody Event event){
        events.add(event);
        return new ApiResponse("Event created successfully");
    }

    @GetMapping("/display-all")
    public ArrayList<Event> displayAllEvents(){
        return events;
    }

    @PutMapping("/update/{index}")
    public ApiResponse updateEvent(@PathVariable int index, @RequestBody Event event){
        events.set(index, event);
        return new ApiResponse("Event updated successfully");
    }

    @DeleteMapping("/delete/{index}")
    public ApiResponse deleteEvent(@PathVariable int index){
        events.remove(index);
        return new ApiResponse("Event deleted successfully");
    }

    @PutMapping("/update-capacity/{index}/{new_capacity}")
    public ApiResponse updateCapacity(@PathVariable int index, @PathVariable int new_capacity){
        events.get(index).setCapacity(new_capacity);
        return new ApiResponse("Capacity updated successfully");
    }

    @GetMapping("/search-by-id/{id}")
    public Event searchByID(@PathVariable String id){
        for(Event event : events) if (event.getId().equalsIgnoreCase(id)) return event;
        return null;
    }
}
