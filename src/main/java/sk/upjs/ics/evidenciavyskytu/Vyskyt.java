package sk.upjs.ics.evidenciavyskytu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Vyskyt {
    private int id;
    private String meno;
    private String priezvisko;
    private LocalDateTime kedy;
    private String akcia;

    public Vyskyt() {
        
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public LocalDateTime getKedy() {
        return kedy;
    }

    public void setKedy(LocalDateTime kedy) {
        this.kedy = kedy;
    }

    public String getAkcia() {
        return akcia;
    }

    public void setAkcia(String akcia) {
        this.akcia = akcia;
    }

    @Override
    public String toString() {
        String stringKedy = kedy.format(DateTimeFormatter.ofPattern("dd.mm.yyyy hh:mm:ss"));
        return id + ". " + meno + " " + priezvisko + " " + stringKedy;
    }
    
    
}
