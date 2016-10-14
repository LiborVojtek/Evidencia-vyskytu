package sk.upjs.ics.evidenciavyskytu;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class VyskytDaoTest {
    
    PamatovyVyskytDao vyskytDao;
    
    public VyskytDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        vyskytDao = new PamatovyVyskytDao();
        Vyskyt vyskyt = new Vyskyt();
        vyskyt.setMeno("Judita");
        vyskyt.setPriezvisko("Jusková");
        vyskyt.setAkcia("Paz1c v P3 - 2.cvičenie");
        vyskyt.setKedy(LocalDateTime.of(2016, Month.SEPTEMBER, 30, 7, 4));
        vyskytDao.vlozVyskyt(vyskyt);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testDajVyskyty() {
        List<Vyskyt> vyskyty = vyskytDao.dajVyskyty();
        Assert.assertNotNull(vyskyty);
    }
    
    @Test
    public void testVlozVyskyt() {
        Vyskyt vyskyt = new Vyskyt();
        vyskyt.setMeno("Erika");
        vyskyt.setPriezvisko("Buffová");
        vyskyt.setAkcia("Paz1c v P3 - 2.cvičenie");
        vyskyt.setKedy(LocalDateTime.of(2016, Month.SEPTEMBER, 30, 7, 6));
        vyskytDao.vlozVyskyt(vyskyt);
        List<Vyskyt> vyskyty = vyskytDao.dajVyskyty();
        Assert.assertEquals(2, vyskyty.size());
    }
    
//    @Test
//    public void testVymazVyskyt(){
//        int idVyskyt = 1;
//        vyskytDao.vymazVyskyt(idVyskyt);
//        List<Vyskyt> vyskyty = vyskytDao.dajVyskyty();
//        Assert.assertEquals(0, vyskyty.size());
//    }
    
}
