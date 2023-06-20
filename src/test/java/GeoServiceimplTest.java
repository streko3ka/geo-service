import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceimplTest {
    @Test
    public void byIPTest(){
        var geoService = new GeoServiceImpl();
        var LocationExecuted = new Location("", Country.RUSSIA,"",0);
        var executedCountry = LocationExecuted.getCountry();
        var LocationResult = geoService.byIp(GeoServiceImpl.MOSCOW_IP).getCountry();
        Assertions.assertEquals(executedCountry,LocationResult);
    }
}