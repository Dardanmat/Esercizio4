
package es4.esercizio4;


public class Dipendente {
    
    public static int codice = 0; //codice che identifica il dipendente
    
    private String nome;
    private String cognome;
    private double stipendio;
    private int code;

    
    //COSTRUTTORI
    public Dipendente(String nome, String cognome, double stipendio) {
        this.nome = nome;
        this.cognome = cognome;
        this.stipendio = stipendio;
        code = codice;
        codice++;
    }

    public Dipendente() {
        nome = "";
        cognome = "";
        stipendio = 0;
        code = codice;
        codice++;
    }
    
    
    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public int getCodice() {
        return code;
    }

    public void setCodice(int codice) {
        this.code = codice;
    }
    
}
