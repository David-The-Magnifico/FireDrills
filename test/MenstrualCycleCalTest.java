import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.*;

class MenstrualCycleCalTest {

    @Test
    void testGenerateFlowReport() {
        String name = "Test User";
        int cycleLength = 28;
        int months = 3;
        String inputDate = "20/01/2022";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate lastFlowDate = LocalDate.parse(inputDate, formatter);

        try {
            assertEquals(name, "Test User");
            assertEquals(cycleLength, 28);
            assertEquals(months, 3);
            assertEquals(inputDate, "20/01/2022");

            String showReport = "Yes";
            for (int i = 0; i < months; i++) {
                System.out.println("=====================================");
                System.out.println("Flow report for Month " + (i + 1));
                System.out.println("=====================================");

                LocalDate nextFlowDate = lastFlowDate.plusDays(cycleLength);
                assertEquals(nextFlowDate.format(formatter), "17/02/2022");

                LocalDate ovulationDate = lastFlowDate.plusDays(cycleLength - 14);
                assertEquals(ovulationDate.format(formatter), "03/02/2022");

                LocalDate fertileStart = ovulationDate.minusDays(3);
                assertEquals(fertileStart.format(formatter), "03/02/2022");
                LocalDate fertileEnd = ovulationDate.plusDays(4);
                assertEquals(fertileEnd.format(formatter), "07/02/2022");

                LocalDate freePeriodStart1 = lastFlowDate.plusDays(4);
                assertEquals(freePeriodStart1.format(formatter), "24/01/2022");
                LocalDate freePeriodEnd1 = lastFlowDate.plusDays(9);
                assertEquals(freePeriodEnd1.format(formatter), "02/02/2022");
                LocalDate freePeriodStart2 = nextFlowDate.minusDays(9);
                assertEquals(freePeriodStart2.format(formatter), "01/03/2022");
                LocalDate freePeriodEnd2 = nextFlowDate.minusDays(4);
                assertEquals(freePeriodEnd2.format(formatter), "28/02/2022");

                LocalDate nextFlowPeriodStart = nextFlowDate.minusDays(3);
                assertEquals(nextFlowPeriodStart.format(formatter), "29/02/2022");
                LocalDate nextFlowPeriodEnd = nextFlowDate.plusDays(3);
                assertEquals(nextFlowPeriodEnd.format(formatter), "04/03/2022");

                lastFlowDate = nextFlowDate;
            }
        } catch (DateTimeParseException e) {
            fail("Input date format is incorrect");
        }
    }
}