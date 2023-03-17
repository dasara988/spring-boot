package com.example.datefinder;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@RestController
public class MyController {
    @GetMapping("/")
    public String getDateAfter100Days() {
        LocalDate today = LocalDate.now();
        LocalDate dateAfter100Days = today.plusDays(100);
        // int day = dateAfter100Days.getDayOfMonth();
        // int month = dateAfter100Days.getMonthValue();
        // int year = dateAfter100Days.getYear();
        // return "0"+day+"-0"+month+"-"+year;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return dateAfter100Days.format(formatter);

    }
    
}
