package it.Java.Evento;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {

    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String titolo;
    LocalDate data;
    int numPosti;
    int numPostiPren, numPostiElim = 0;

    LocalDate now = LocalDate.now();

    public Evento(String titolo, LocalDate data, int numPosti) throws Exception {
        this.titolo = titolo;
        if (data.isAfter(now))
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

    public int prenotaPosto(int posti) throws Exception {
        if (this.numPosti >= posti) {
            this.numPosti = this.numPosti - posti;
            this.numPostiPren = this.numPostiPren + posti;
            return numPostiPren;
        } else {
            throw new Exception();
        }
    }

    public int riduciPosto(int posti) throws Exception {
        if (this.numPostiPren >= posti) {
            this.numPostiPren = this.numPostiPren - posti;
            this.numPostiElim = this.numPostiElim + posti;
            return numPostiElim;
        } else {
            throw new Exception();
        }
    }

    public Evento() {
        super();
    }

    @Override
    public String toString() {
        return " " + this.data.format(df) + " " + this.titolo + "";
    }
}
