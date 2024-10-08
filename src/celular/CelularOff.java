/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celular;

/**
 *
 * @author Lucas de Souza Moro
 */
public class CelularOff implements CelularState{
    private final Celular celular;
    
    public CelularOff(Celular celular){
        this.celular = celular;
        
    }
    @Override
    public void ligar(){
        System.out.println("Ligando celular...");
        celular.setCelularState(celular.getCelularOn());
    }
    @Override
    public void desligar(){
        System.out.println("Celular ja desligado.");
    }
    @Override
    public void desbloquear(){
        System.out.println("Necessario ligar o celular antes");
    }
    @Override
    public void chamar(){
        System.out.println("Necessario ligar e desbloquear o celular antes");
    }
    @Override
    public void desligarChamada(){
        System.out.println("Necessario ligar o celular antes");
    }
    
    @Override
    public void carregar(){
        Integer bateria = celular.getBateria();
        if (bateria==100){
            System.out.println("Celular com bateria suficiente.");
        }
        else{
            System.out.println("Carregando celular...");
            celular.setBateria(100);
            System.out.println("Bateria recarregada.");
        }
        
    }
    

}
