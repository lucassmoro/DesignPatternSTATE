/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celular;

/**
 *
 * @author Lucas de Souza Moro
 */
public class CelularTest {
    public static void main(String args[]){
        Celular celular = new Celular();
        
       celular.desbloquear();
       celular.chamar();
       celular.desligarChamada();
       celular.carregar();
       celular.ligar(); 
       
       //Celular no estado CelularOn
       celular.ligar(); 
       celular.desbloquear();
       
       //Celular no estado CelularDesbloqueado
       celular.desbloquear(); 
       celular.chamar();
       
       //Celular no estado CelularChamar
       celular.desligar();
       celular.chamar();
       celular.desligarChamada();
       
       //Celular de volta pro estado CelularDesbloqueado
       celular.chamar();
       
       //Celular no estado CelularSemBateria
       celular.ligar();
       celular.carregar();
       
       //Celular de volta no estado Desbloqu
       celular.ligar();
       
       
       
       
    }
    
}
