package strings_date_time_bigdecimals_wrappers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalUnit;
import java.util.Locale;
import java.util.ResourceBundle;

public class ExerciceTwo {


    public static void stringsexp() {
        System.out.println("String is an immutable object it is saved inside a string pool any change on string creates another string");

        String a = "helloWorld", b = "helloWorld";
        System.out.println("String a = \"helloWorld\", b = \"helloWorld\" =>same ref => a == b is " + (a == b));
        String x = "helloworld", y = new String("helloworld");
        System.out.println("String x = \"helloworld\", y = new String(\"helloworld\") => not the same ref => x == y is " + (x == y));
        System.out.println("Get value from string pool => a.intern() " + a.intern() + " same ref => a.intern() == b =" + (a.intern() == b));
        System.out.println("takes 5 first chars ( index: 0 to index: 4 ) => a.substring(0, 5) = " + a.substring(0, 5));
        System.out.println("1 + 1 + \"w\" = " + (1 + 1 + "w"));
        System.out.println("a.charAt(25) throw java.lang.StringIndexOutOfBoundsException");

        System.out.println("<== String builder ==>");
        System.out.println("same as sting but mutable it can change ");
        System.out.println("it has append delete insert reverse methods added");
        var s = new StringBuilder(a);
        System.out.println("it can be created => var s = new StringBuilder(a) " + s);
        System.out.println("default capacity ( this will expand automatically ) => s.capacity() = "+ s.capacity());
        System.out.println("insert => s.insert(3, 'X') = " + s.insert(3, 'X'));
        System.out.println("insert => s.insert(40, 'X') will throw java.lang.StringIndexOutOfBoundsException");
    }

    public static void numerics() {
        System.out.println("<== Immutable : Wrapper classes ==>");
        System.out.println("Integer, Character, Byte, Double, Float");
        Integer i = Integer.valueOf(12);
        System.out.println("Boxing : create Integer class => i = Integer.valueOf(12) = " + i);
        System.out.println("Unboxing: Integer" + i.intValue());

        System.out.println("<== BigDecimals ==>");
        BigDecimal bd = BigDecimal.valueOf(15.223);
        BigDecimal bd2 = new BigDecimal(15.223);
        System.out.println("1: create BigDecimal : BigDecimal bd = BigDecimal.valueOf(15.223) = " + bd);
        System.out.println("2: create BigDecimal ( takes full size so adds other shit not needed not recommended ): BigDecimal bd2 = new BigDecimal(15.223) = " + bd2);
        System.out.println("example operations: bd.add(BigDecimal.valueOf(15)).multiply(BigDecimal.valueOf(0.5)).setScale(3, RoundingMode.HALF_UP) = " +
                bd.add(BigDecimal.valueOf(15)).multiply(BigDecimal.valueOf(0.5)).setScale(3, RoundingMode.HALF_UP));
    }

    public static void dateAndTime() {
        System.out.println("<== Immutable : LocalDate/LocalDateTime/LocalTime ==>");
        System.out.println("create date from actual date LocalDate.of(2021,10,3) = " + LocalDate.of(2021, 10, 3));
        LocalDate l = LocalDate.now();
        System.out.println("Create date now LocalDate l = LocalDate.now() = " + l);
        LocalDateTime l2 = LocalDateTime.now();
        System.out.println("Create date time now LocalDateTime l2 = LocalDateTime.now() = " + l2);
        LocalTime l3 = LocalTime.now();
        System.out.println("Create time now LocalTime l3 = LocalTime.now() = " + l3);
        System.out.println("XXX: Days, Months, Weekds, Years, DayOfMonth, DayOfYear, DayOfWeek, Minutes, Seconds, Hours");
        System.out.println("plusXXX adds time example l.plusDays(2) = " + l.plusDays(3));
        System.out.println("minusXXX removes time example l.minusDays(2) = " + l.minusDays(2));
        System.out.println("withXXX replace the value l.withDayOfMonth(15) = " + l.withDayOfMonth(15));

        System.out.println("Is Before => l.isBefore(l.plusDays(2)) " + l.isBefore(l.plusDays(2)));
        System.out.println("Is After => l.isAfter(l.plusDays(2)) " + l.isAfter(l.plusDays(2)));

        System.out.println("<== Duration/Period/Instants ==>");
        System.out.println("Duration amount of time in s(ofXXX, withXXX, plusXXX, minusXXX) Duration.ofHours(2).getSeconds()=> " + Duration.ofHours(2).getSeconds());
        System.out.println("Period amount of time between 2 points in time Period.between(l, l.plusDays(2)).getDays() = " + Period.between(l, l.plusDays(2)).getDays());
        System.out.println("Instant time-stamp ==> Instant.now() = " + Instant.now());

    }

    public static void localization() {
        System.out.println("<== ZonedDateTime ==>");
        System.out.println("Default Time zone : ZoneId.systemDefault() = " + ZoneId.systemDefault());
        System.out.println("Time zone from ID ZoneId.of(\"Europe/London\") = " + ZoneId.of("Europe/London"));
        LocalDateTime l = LocalDateTime.of(2021, 12, 3, 1, 3, 0);
        System.out.println("LocalDateTime  l = LocalDateTime.of(2021,12,3,1,3,0) = " + l);
        ZonedDateTime z = ZonedDateTime.of(l, ZoneId.of("Europe/London"));
        System.out.println("ZonedDateTime ZonedDateTime.of(l, ZoneId.of(\"Europe/London\")) = " + z);
        System.out.println("time in another time zone z.withZoneSameInstant(ZoneId.of(\"GMT+3\")) = " + z.withZoneSameInstant(ZoneId.of("GMT+3")));
        System.out.println("ZonedDateTime offset => ZonedDateTime.of(l, ZoneId.of(\"Asia/Katmandu\")).getOffset() = "+ ZonedDateTime.of(l, ZoneId.of("Asia/Katmandu")).getOffset());
        System.out.println("<== Locale language ==>");
        System.out.println("Create/GET Locale => Locale locale = Locale.US = " + Locale.US);
        System.out.println("Create/GET Locale => Locale locale = new Locale(\"en\",\"US\") = " + new Locale("en", "US"));
        System.out.println("Create/GET Locale => Locale locale = new Locale.Builder().setLanguage(\"en\").setRegion(\"GB\").build() = " + new Locale.Builder().setLanguage("en").setRegion("GB").build());
        System.out.println("Create/GET Locale => Locale locale = Locale.forLanguageTag(\"en-GB\") = " + Locale.forLanguageTag("en-GB"));
        System.out.println("<== NumberFormat ==>");

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.CHINA) = " + currencyFormat);
        System.out.println("Format to Currency currencyFormat.format(1458) = " + currencyFormat.format(1458));

        NumberFormat percentFormat = NumberFormat.getPercentInstance(Locale.CHINA);
        System.out.println("NumberFormat percentFormat = NumberFormat.getPercentInstance(Locale.CHINA) = " + percentFormat);
        System.out.println("Format to Percentage percentFormat.format(0.32) = " + percentFormat.format(0.32));

        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.CHINA);
        System.out.println("NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.CHINA)" + numberFormat);
        System.out.println("Format to Number numberFormat.format(1458) = " + numberFormat.format(1458));
        percentFormat.setMaximumFractionDigits(2);
        System.out.println("set fraction formatting => percentFormat.setMaximumFractionDigits(2) => percentFormat.format(0.3222369) = " + percentFormat.format(0.3222369));

        try {
            System.out.println("get value from formatted number numberFormat.parse(\"1,458\") = " + numberFormat.parse("1,458"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("If value can't be formatted it throws ParseException");

        System.out.println("<=== DateTimeFormatter ===>");
        LocalDate myDate = LocalDate.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy dd MM");
        System.out.println("DateTimeFormatter df = DateTimeFormatter.ofPattern(\"yyyy dd MM\") => df.format(myDate) = " + df.format(myDate));
        System.out.println("Create Formatter date LocalDate.parse(\"2012 03 20\", df) = " + LocalDate.parse("2012 03 12", df));
        var localizedDateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(Locale.CHINA);
        System.out.println("Format Date by Locale: var localizedDateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(Locale.CHINA)" + localizedDateFormatter);
        System.out.println("myDate.format(localizedDateFormatter) = " + myDate.format(localizedDateFormatter));

        System.out.println("<=== Localized resources ===>");
        ResourceBundle rs = ResourceBundle.getBundle("myprops", new Locale("en", "GB"));
        System.out.println("ResourceBundle rs = ResourceBundle.getBundle(\"myprops\", new Locale(\"en\", \"GB\")) => rs.getString(\"test\") = " + rs.getString("test"));
        System.out.println("default resources  ResourceBundle.getBundle(\"myprops\").getString(\"test\") = " + ResourceBundle.getBundle("myprops").getString("test"));


        System.out.println("<=== MessageFormat ===>");

        System.out.println("used to replace {number} => MessageFormat.format(\"test {0} haha {1}\", \"messageformat\", \"goodstuff\") = " + MessageFormat.format("test {0} haha {1}", "messageformat", "goodstuff"));
    }

}
