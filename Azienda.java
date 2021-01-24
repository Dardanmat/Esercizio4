
package es4.esercizio4;
import  java.util.ArrayList;

public class Azienda {
    
    private String nome;
    private String indirizzo;
    
    ArrayList<Dipendente> impiegati = new ArrayList<>();

    
    //COSTRUTTORI
    public Azienda(String nome, String indirizzo) {
        this.nome = nome;
        this.indirizzo = indirizzo;
    }

    
    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    
    public void addDipendente(Dipendente d){
        impiegati.add(d);
    }
    
    public boolean removeDipendente(int codice){
        
        int i = cercaDipendente(codice);
        
        if(i == -1) return false;
        else impiegati.remove(i);
        
        return true;
        
    }
    
    public int cercaDipendente(int codice){
        
        for(int i = 0; i < impiegati.size(); i++){
            
            if(impiegati.get(i).getCodice() == codice){
                return i;
            }
            
        }
        return -1;
        
    }
    
    public Dipendente dipendenteConStipendioMaggiore(){
        
        int max = 0;
        
        for(int i = 0; i < impiegati.size(); i++){
            
            if(impiegati.get(i).getStipendio() > impiegati.get(max).getStipendio()){
                
                max = i;
                
            }
            
        }
        
        return impiegati.get(max);
    }
    
    public void listaDipendenti(){
        
        for(int i = 0; i < impiegati.size(); i++){
            
            System.out.println(impiegati.get(i).getNome() + " "
                               + impiegati.get(i).getCognome() 
                               + "   Stipendio: " 
                               + impiegati.get(i).getStipendio());
            
        }

    }

}

