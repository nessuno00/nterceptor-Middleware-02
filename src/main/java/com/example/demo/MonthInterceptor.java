package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MonthInterceptor {

    private final List<Month> months;

    public MonthInterceptor() {

        months = Arrays.asList(

                new Month(1, "January", "Gennaio", "Januar"),
                new Month(2, "February", "Febbraio", "Februar"),
                new Month(3, "March", "Marzo", "März"),
                new Month(4, "April", "Aprile", "April"),
                new Month(5, "May", "Maggio", "Mai"),
                new Month(6, "June", "Giugno", "Juni"),
                new Month(7, "July", "Luglio", "Juli")
        );

    }

    public Month processMonth(Integer monthNumber) {
        if (monthNumber == null) {

            throw new IllegalArgumentException("Month number is required.");
        }

        Month month = months.stream()
                .filter(m -> m.getMonthNumber() == monthNumber)
                .findFirst()
                .orElseGet(() -> new Month(monthNumber, "nope", "nope", "nope"));
        return month;
    }
}