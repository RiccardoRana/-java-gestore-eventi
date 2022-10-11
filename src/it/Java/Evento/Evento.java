package it.Java.Evento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {

    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String titolo;
    LocalDate data;
    int numPosti;
    int numPostiPren = 0;

    LocalDate now = LocalDate.now();

    public Evento(String titolo, LocalDate data, int numPosti) throws Exception {
        this.titolo = titolo;
        if (data.isBefore(now))
            this.data = data;
        else
            throw new Exception();
        this.numPosti = numPosti;
    }


    public String getTitolo() {
        return titolo;
    }

    public LocalDate getData() {
        return data;
    }

    public int getNumPosti() {
        return numPosti;
    }

    public int getNumPostiPren() {
        return numPostiPren;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int prenotaPosto() throws Exception {
        if (numPostiPren < numPosti) {
            return this.numPostiPren++;
        } else {
            throw new Exception();
        }
    }

    public int riduciPosto() throws Exception {
        if (this.numPostiPren > 0) {
            return numPosti = this.numPostiPren - 1;
        } else if (this.data.isBefore(now)) {
            throw new Exception();
        } else {
            throw new Exception();
        }
    }


    @Override
    public String toString() {
        return " " + this.data.format(df) + " " + this.titolo + "";
    }
}
