/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celular;

/**
 *
 * @author Lucas de Souza Moro
 */
public class CelularDesbloqueado implements CelularState{
    private final Celular celular;

    
    
    public CelularDesbloqueado(Celular celular){
        this.celular = celular;
    }

    @Override
    public void ligar(){
        System.out.println("Celular ja ligado");
    }
    @Override
    public void desligar(){
        System.out.println("Desligando celular...");
        celular.setCelularState(celular.getCelularOff());
    }
    @Override
    public void desbloquear(){
        System.out.println("Celular ja desbloqueado.");
        
    }
    @Override
    public void chamar(){
        Integer bateria=celular.getBateria();
        bateria=bateria-50;
        celular.setBateria(bateria);
        System.out.println("Chamando...");
        if(bateria>0){
        System.out.printf("Bateria em %d%% \n",bateria);
        celular.setCelularState(celular.getCelularChamando());
        }
        else{
            System.out.println("Celular sem bateria.");
            celular.setCelularState(celular.getCelularSemBateria());
        }
    }
    
    @Override
    public void desligarChamada(){
        System.out.println("Nenhuma chamada em andamento.");
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
