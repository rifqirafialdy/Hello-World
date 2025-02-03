package org.Rifqi.entity;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date {
    private LocalDate dateA;
    private LocalDate dateB;
    public Date(LocalDate dateA,LocalDate dateB){
        this.dateA= dateA;
        this.dateB=dateB;
    }
    public long calculateDate(){
        return ChronoUnit.DAYS.between(dateA,dateB);
    }
}
