import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.javaqa.domjavanetz5.services.BonusService;

public class BonusServiceTest {

    @Test
    void calculationPossibilityRestInNextMonth3() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        int expected = 3;
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

@Test
void calculationPossibilityRestInNextMonth6() {
    BonusService service = new BonusService();

    // подготавливаем данные:
    int expected = 6;
    int income = 100_000;
    int expenses = 60_000;
    int threshold = 150_000;

    int actual = service.calculate(income, expenses, threshold);

    // производим проверку (сравниваем ожидаемый и фактический):
    Assertions.assertEquals(expected, actual);
}
}
