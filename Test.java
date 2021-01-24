package es4.esercizio4;

public class Test {
    
    public static void main(String[] args){
        
        Azienda compagnia =  new Azienda("Techno Corp","Via Santo Stefano 2");
        
        Dipendente d1 = new Dipendente("Aldo", "Cassa", 4500);
        Dipendente d2 = new Dipendente("Gionni", "Cestino", 200);
        Dipendente d3 = new Dipendente("Ugo", "Carrello", 2100);
        
        compagnia.addDipendente(d1);
        compagnia.addDipendente(d2);
        compagnia.addDipendente(d3);
        
        compagnia.listaDipendenti();
        
        if(compagnia.removeDipendente(0)){
            
            System.out.println("Rimosso");
            
        }else System.out.println("Errore, dipendente non trovato");
        
        compagnia.listaDipendenti();
        
        d2 = compagnia.dipendenteConStipendioMaggiore();
        
        System.out.println(d2.getNome());
        
    }
    
}
