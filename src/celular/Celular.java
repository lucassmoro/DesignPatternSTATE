/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celular;

/**
 *
 * @author Lucas de Souza Moro
 */
public class Celular implements CelularState {
    
    private CelularState celularOn;
    private CelularState celularOff;
    private CelularState celularDesbloqueado;
    private CelularState celularChamando;
    private CelularState celularSemBateria;
    private CelularState state;
    
    private Integer bateria = 100;
    
    public Celular(){
        this.celularOn=new CelularOn(this);
        this.celularOff = new CelularOff(this);
        this.celularDesbloqueado = new CelularDesbloqueado(this);
        this.celularChamando = new CelularChamar(this);
        this.celularSemBateria = new CelularSemBateria(this);
        this.state = celularOff;
    }
    
    public void setCelularState(CelularState state){
        this.state=state;
    }
    
    @Override
    public void ligar(){
        state.ligar();
    }
    @Override
    public void desligar(){
        state.desligar();
    }
    @Override
    public void desbloquear(){
        state.desbloquear();
    }
    @Override
    public void chamar(){
        state.chamar();
    }
    @Override
    public void carregar(){
        state.carregar();
    }
    @Override
    public void desligarChamada(){
        state.desligarChamada();
    }
    
    
    public CelularState getCelularOn() {
        return celularOn;
    }
    public CelularState getCelularOff() {
        return celularOff;
    }
    public CelularState getCelularDesbloqueado() {
        return celularDesbloqueado;
    }
    public CelularState getCelularChamando() {
        return celularChamando;
    }
    public CelularState getState() {
        return state;
    }
    public CelularState getCelularSemBateria() {
        return celularSemBateria;
    }
    public Integer getBateria() {
        return bateria;
    }
    public void setBateria(Integer bateria) {
        this.bateria = bateria;
    }

   
    
    

}

