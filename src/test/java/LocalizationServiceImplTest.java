import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTest {
    @Test
    public void localeTest(){
        var localeServ = new LocalizationServiceImpl();
        var executed = localeServ.locale(Country.RUSSIA);
        var result = "Добро пожаловать";
        Assertions.assertEquals(executed,result);
    }
}