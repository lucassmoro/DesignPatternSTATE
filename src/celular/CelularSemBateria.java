/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celular;

/**
 *
 * @author Lucas de Souza Moro
 */
public class CelularSemBateria implements CelularState {
    private final Celular celular;
    
    public CelularSemBateria(Celular celular){
        this.celular = celular;
        
    }
    
    @Override
    public void ligar(){
        System.out.println("Celular sem bateria.");
    }
    
    @Override
    public void desligar(){
        System.out.println("Celular ja desligado.");
    }
    
    @Override
    public void desbloquear(){
        System.out.println("Celular sem bateria.");
    }
    
    @Override
    public void chamar(){
        System.out.println("Celular sem bateria.");
    }
    
    @Override
    public void desligarChamada(){
        System.out.println("Celular sem bateria.");
    }
    
    @Override
    public void carregar(){
        System.out.println("Carregando celular...");
        celular.setBateria(100);
        System.out.println("Bateria recarregada.");
        celular.setCelularState(celular.getCelularOff());
    }




}
