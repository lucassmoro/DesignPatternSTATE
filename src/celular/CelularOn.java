/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celular;

/**
 *
 * @author Lucas de Souza Moro
 */
public class CelularOn implements CelularState{
    private final Celular celular;
    
    public CelularOn(Celular celular){
        this.celular = celular;
    }
    
    
    @Override
    public void ligar(){
        System.out.println("Celular ja ligado.");
    }

    /**
     *
     */
    @Override
    public void desligar(){
        System.out.println("Desligando celular..");
        celular.setCelularState(celular.getCelularOff());
    }
    @Override
    public void desbloquear(){
        System.out.println("Desbloqueando celular..");
        celular.setCelularState(celular.getCelularDesbloqueado());
    }
    @Override
    public void chamar(){
        System.out.println("Necessario desbloquear o celular antes.");
    }
    @Override
    public void desligarChamada(){
        System.out.println("Necessario desbloquear o celular antes.");
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

