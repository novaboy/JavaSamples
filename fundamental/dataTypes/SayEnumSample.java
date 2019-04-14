package fundamental.dataTypes;

import java.time.DayOfWeek;

public enum SayEnumSample {
    SUNDAY(1, "Working Day"),
    MONDAY(2, "Working Day"),
    TUESDAY(3, "Working Day"),
    WEDNESDAY(4, "Working Day"),
    THURSDAY(5, "Working Day"),
    FRIDAY(6, "Holiday"),
    SATURDAY(7, "Holiday");

    private final int dayOfWeek;
    private final String workingDay;

    SayEnumSample(int d, String w) {
        this.dayOfWeek = d;
        this.workingDay = w;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java Day <day_of_week>");
            System.exit(-1);
        }

        String day = args[0].toUpperCase();
        System.out.println(day);

        for (SayEnumSample d : SayEnumSample.values()) {
            //System.out.println(d.name());
            if (day.equals(d.name())) {
                System.out.printf("%s is a %s.",
                        d.name(), d.workingDay, 7 - d.dayOfWeek);
                if (d.workingDay != "Holiday") {
                    System.out.printf("%d more days to reach next holidays.%n", 7 - d.dayOfWeek);
                } else {
                    System.out.printf("enjoy your Holiday.%n");
                }
            }

        }
    }
}

