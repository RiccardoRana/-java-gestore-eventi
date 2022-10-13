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
    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    BigDecimal prezzo;
    LocalTime ora;

    public Concerto(String titolo, LocalDate data, int numPosti, BigDecimal prezzo, LocalTime ora) throws Exception {
        super(titolo, data, numPosti);
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
        return " Data: "+df.format(this.data)+" , " + decimalTwo.format(this.prezzo) + " "+dtf.format(this.ora)+"";
    }
}

