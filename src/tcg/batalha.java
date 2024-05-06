package tcg;

import java.util.Random;

public class batalha {
    carta player;
    carta bot;
    int atributo_luta;    

    public batalha(carta player, carta bot){
        this.player = player;
        this.bot = bot;
        Random num = new Random();
        atributo_luta = num.nextInt(5);
    }

    public carta getPlayer() {
        return player;
    }

    public void setPlayer(carta player) {
        this.player = player;
    }

    public carta getBot() {
        return bot;
    }

    public void setBot(carta bot) {
        this.bot = bot;
    }

    public int getAtributo_luta() {
        return atributo_luta;
    }

    public void setAtributo_luta(int atributo_luta) {
        this.atributo_luta = atributo_luta;
    }

    public String lutar(){

        /*int forca; 
        int destreza;
        int constituicao;
        int inteligencia;
        int sabedoria;
        int carisma;*/

        switch (atributo_luta) {
            case 0:
                if (player.forca == bot.forca) {
                    return "empate";
                } else if (player.forca > bot.forca) {
                    return "player wins";
                }else{
                    return "bot wins";
                }
            case 1:
            if (player.destreza == bot.destreza) {
                return "empate";
                } else if (player.destreza > bot.destreza) {
                    return "player wins";
                }else{
                    return "bot wins";
                }
            case 2:
                if (player.constituicao == bot.constituicao) {
                    return "empate";
                } else if (player.constituicao > bot.constituicao) {
                    return "player wins";
                } else {
                    return "bot wins";
                }
            case 3:
                if (player.inteligencia == bot.inteligencia) {
                    return "empate";
                } else if (player.inteligencia > bot.inteligencia) {
                    return "player wins";
                } else {
                    return "bot wins";
                }
            case 4:
                if (player.sabedoria == bot.sabedoria) {
                    return "empate";
                } else if (player.sabedoria > bot.sabedoria) {
                    return "player wins";
                } else {
                    return "bot wins";
                }
            case 5:
                if (player.carisma == bot.carisma) {
                    return "empate";
                } else if (player.carisma > bot.carisma) {
                    return "player wins";
                } else {
                    return "bot wins";
                }
            default:
                return "atributo inválido";
        }

    }
    
}
