
package test;

import sistema.*;
public class Sistema {
    public static void main(String[] args) {
        PartidoPolitico p1 = new PartidoPolitico("Area verde", "a", "b", "Pepito");
        PartidoPolitico p2 = new PartidoPolitico("Chupetines", "a", "b", "Pepite");
        PartidoPolitico p3 = new PartidoPolitico("Avanza peru", "a", "b", "Pepita");
        Candidato c1 = new Candidato(704089, "Juan", "Martinez", p1);
        Candidato c2 = new Candidato(704569, "Laura", "Rojas", p2);
        Candidato c3 = new Candidato(704899, "Fabricio", "Reyes", p3);
        RegistroCandidatos r1 = new RegistroCandidatos();
       
        Eleccion e1 = new Eleccion("Junio-29", "Municipal", "..", "...");
        
    }
    
}
