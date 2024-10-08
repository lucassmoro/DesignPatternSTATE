/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celular;

/**
 *
 * @author Lucas de Souza Moro
 */
public class CelularChamar implements CelularState{
    private final Celular celular;

    
    public CelularChamar(Celular celular){
        this.celular = celular;
    }

    @Override
    public void ligar(){
        System.out.println("Celular ja ligado.");
    }

    @Override
    public void desligar(){
        System.out.println("Encerre a ligacao antes.");
    }
    
    @Override
    public void desbloquear(){
        System.out.println("Celular ja desbloqueado.");
    }
    
    @Override
    public void chamar(){
        System.out.println("Celular ja em ligacao.");
    }
    
    @Override
    public void desligarChamada(){
        System.out.println("Encerrando ligacao...");
        celular.setCelularState(celular.getCelularDesbloqueado());
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
