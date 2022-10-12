package it.Java.Evento;

import java.math.BigDecimal;
import java.text.Bidi;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento {

    DecimalFormat decimalTwo = new DecimalFormat("##,##€");
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");
    BigDecimal prezzo;
    LocalTime ora;

    public Concerto(String titolo, LocalDate data, int numPosti) throws Exception {
        super(titolo, data, numPosti);
    }

    public Concerto(BigDecimal prezzo, LocalTime ora) {
        this.prezzo = prezzo;
        this.ora = ora;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public LocalTime getOra() {
        return ora;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public void setOra(LocalTime ora) {
        this.ora = ora;
    }

    @Override
    public String toString() {
        return "" + decimalTwo.format(prezzo) + "";
    }
}

