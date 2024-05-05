/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcg;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author carlos
 */
public class carta {
    String nome;
    int raca; 
    // 1 -> humano = 2*carisma 
    // 2 -> elfo = 2*destreza
    // 3 -> anao = 2*constituicao
    // 4 -> orc 2*forca
    // 5 -> vampiro = 2*inteligencia
    // 6 -> fada = 2*sabedoria
    int classe;
    // 1-> guerreiro = 2*forca
    // 2-> assasino = 2*destreza
    // 3-> mago = 2*inteligencia
    // 4-> bardo = 2*sabedoria
    // 5-> clerigo = 2*carisma
    // 6-> ranger = 2*constituicao
    int forca; 
    int destreza;
    int constituicao;
    int inteligencia;
    int sabedoria;
    int carisma;
    boolean disponivel;

    public carta(int raca, int classe, int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma) {
        this.raca = raca;
        this.classe = classe;
        this.forca = forca;
        this.destreza = destreza;
        this.constituicao = constituicao;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.carisma = carisma;
        this.disponivel = true;
        switch (raca){
            case 1 -> this.carisma *= 2;         
            case 2 -> this.destreza *= 2;
            case 3 -> this.constituicao *=2;
            case 4 -> this.forca = forca*2;
            case 5 -> this.inteligencia *=2;
            case 6 -> this.sabedoria *=2;
        } 
        switch (classe){
            case 1 -> this.forca *=2;
            case 2 -> this.destreza *=2;
            case 3 -> this.inteligencia *= 2;
            case 4 -> this.sabedoria *= 2;
            case 5 -> this.carisma *= 2;
            case 6 -> this.constituicao *= 2;
        }
        
        int temp = raca*10 + classe;
        switch(temp){
            case 11: this.nome = "Guts";break;
            case 12: this.nome = "Jack the ripper";break;
            case 13: this.nome = "Fern";break;
            case 14: this.nome = "Luckhaos";break;
            case 15: this.nome = "Heiter";break;
            case 16: this.nome = "Yume";break;
            case 21: this.nome = "Drizzt";break;
            case 22: this.nome = "Astariom";break;
            case 23: this.nome = "Frieren";break;
            case 24: this.nome = "Jaskier";break;
            case 25: this.nome = "Shadowheart";break;
            case 26: this.nome = "Legolas";break;
            case 31: this.nome = "Eisen"; break;
            case 32: this.nome = "Öki"; break;
            case 33: this.nome = "Mestre dos magos"; break;
            case 34: this.nome = "Volo"; break;
            case 35: this.nome = "Baragor"; break;
            case 36: this.nome = "Robin hood"; break;
            case 41: this.nome = "Geld"; break;
            case 42: this.nome = "Souei"; break;
            case 43: this.nome = "Milim"; break;
            case 44: this.nome = "Duke"; break;
            case 45: this.nome = "Shuna"; break;
            case 46: this.nome = "orc ranger"; break;
            case 51: this.nome = "Dracula"; break;
            case 52: this.nome = "Dio"; break;
            case 53: this.nome = "Vanitas"; break;
            case 54: this.nome = "Marceline"; break;
            case 55: this.nome = "Alucard"; break;
            case 56: this.nome = "Seras"; break;
            case 61: this.nome = "WIllow"; break;
            case 62: this.nome = "Teeth"; break;
            case 63: this.nome = "Tinker bell"; break;
            case 64: this.nome = "Venti"; break;
            case 65: this.nome = "pike"; break;
            case 66: this.nome = "Winx"; break;
            default: this.nome = "desconhecido";
        }
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRaca() {
        return raca;
    }

    public void setRaca(int raca) {
        this.raca = raca;
    }

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "carta{" + "nome=" + nome + ", raca=" + raca + ", classe=" + classe + ", forca=" + forca + ", destreza=" + destreza + ", constituicao=" + constituicao + ", inteligencia=" + inteligencia + ", sabedoria=" + sabedoria + ", carisma=" + carisma + ", disponivel=" + disponivel + '}';
    }
    
    
    
}
    
