/**
 * 
 */
package com.baeldung.datetime;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/**
 * 
 * JUnits for {@link DateToLocalDateConverter} class.
 * 
 * @author abialas
 *
 */
public class DateToLocalDateConverterTest {

    @Test
    public void shouldReturn10thNovember2010WhenConvertViaInstant() {
        // given
        Calendar calendar = Calendar.getInstance();
        calendar.set(2010, 10, 10);
        Date dateToConvert = calendar.getTime();

        // when
        LocalDate localDate = DateToLocalDateConverter.convertToLocalDateViaInstant(dateToConvert);

        // then
        assertEquals(2010, localDate.get(ChronoField.YEAR));
        assertEquals(11, localDate.get(ChronoField.MONTH_OF_YEAR));
        assertEquals(10, localDate.get(ChronoField.DAY_OF_MONTH));
    }

    @Test
    public void shouldReturn10thNovember2010WhenConvertViaMiliseconds() {
        // given
        Calendar calendar = Calendar.getInstance();
        calendar.set(2010, 10, 10);
        Date dateToConvert = calendar.getTime();

        // when
        LocalDate localDate = DateToLocalDateConverter.convertToLocalDateViaMilisecond(dateToConvert);

        // then
        assertEquals(2010, localDate.get(ChronoField.YEAR));
        assertEquals(11, localDate.get(ChronoField.MONTH_OF_YEAR));
        assertEquals(10, localDate.get(ChronoField.DAY_OF_MONTH));
    }

    @Test
    public void shouldReturn10thNovember2010WhenConvertViaSqlDate() {
        // given
        Calendar calendar = Calendar.getInstance();
        calendar.set(2010, 10, 10);
        Date dateToConvert = calendar.getTime();

        // when
        LocalDate localDate = DateToLocalDateConverter.convertToLocalDateViaSqlDate(dateToConvert);

        // then
        assertEquals(2010, localDate.get(ChronoField.YEAR));
        assertEquals(11, localDate.get(ChronoField.MONTH_OF_YEAR));
        assertEquals(10, localDate.get(ChronoField.DAY_OF_MONTH));
    }

}
