package org.Rifqi.entity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date {
    private final LocalDate dateA;
    private final LocalDate dateB;

    public Date(LocalDate dateA, LocalDate dateB) {
        this.dateA = dateA;
        this.dateB = dateB;
    }

    public long calculateDate() {
        return Math.abs(ChronoUnit.DAYS.between(dateA, dateB));
    }
}
