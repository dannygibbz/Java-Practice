Question # 1: Which class would you use to store your birthday in years, months, days, seconds, and nanoseconds?

    Answer Most likely the LocalDateTime class. To take a particular time zone into account, you would use the ZonedDateTime class. Both classes track date and time to nanosecond precision and both classes, when used in conjunction with Period, give a result using a combination of human-based units, such as years, months, and days.

Question # 2: Given a random date, how would you find the date of the previous Thursday?

    Use the previous method of a TemporalAdjuster:

    LocalDate date = ...;
    System.out.printf("The previous Thursday is: %s%n",
            date.with(TemporalAdjuster.previous(DayOfWeek.THURSDAY)));
