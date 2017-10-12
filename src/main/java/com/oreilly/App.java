package com.oreilly;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;

public class App {

  public static void main(String[] args) {

    Instant start = Instant.now();

    int year = 2017;
    Month month = Month.MAY;
    int day = 5;
    int numberOfDays = 3;

    GamePageParser parser = new GamePageParser();
    parser.printGames(LocalDate.of(year, month, day), numberOfDays);

    Instant end = Instant.now();

    Duration duration = Duration.between(start, end);

    System.out.println(duration.getSeconds() + " seconds");

  }

}
