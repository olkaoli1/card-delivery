package ru.netology.data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataGenerator {
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd.MM.yyyy");

    private DataGenerator() { }     // запрет создавать объекты

    public static String plusDays(int days) {
        return LocalDate.now().plusDays(days).format(FORMATTER);
    }
}
