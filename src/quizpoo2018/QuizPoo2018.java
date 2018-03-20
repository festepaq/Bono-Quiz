/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizpoo2018;

import Person.Person;
import Person.Universe;

/**
 *
 * @author acer
 */
public class QuizPoo2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Universe u_1= new Universe();
        u_1.agregarPesona("male", "Farid");
        u_1.agregarPesona("female", "Maria");
        u_1.agregarPesona("male", "Jose");
        u_1.agregarPesona("female", "Sofia");
        u_1.agregarPesona("female","Lola");
        
    //Se le asignan los padres a Farid    
     u_1.addParents("Farid",u_1.getPerson(1),u_1.getPerson(2));
     
     // Se le asigna solo 1 parents a Sofia
u_1.addParents("Sofia", u_1.getPerson(3),null);
    
//Ingresar 2 hijos a Lola
System.out.println("Lola");
u_1.addChildren("Lola",2);
        
 for(Person a : u_1.listarPeople())
 {
     System.out.println("Persona: " + a.getName() +"\n"+"Hijos:");
     if(a.getChildren().size() !=0 )
     {
        for(Person b : a.getChildren())
        {
            System.out.println(b.getName());
        }
     }
     else
         System.out.println("Sin Hijos");
 }
 u_1.contarPersonasConHijas();
    }
    
}
