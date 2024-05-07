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

    public int lutar(){

        /*int forca; 
        int destreza;
        int constituicao;
        int inteligencia;
        int sabedoria;
        int carisma;*/

        switch (atributo_luta) {
            case 0:
                if (player.forca == bot.forca) {
                    return 0;
                } else if (player.forca > bot.forca) {
                    bot.setDisponivel(false);
                    return 1;
                }else{
                    player.setDisponivel(false);
                    return 2;
                }
            case 1:
            if (player.destreza == bot.destreza) {
                return 0;
                } else if (player.destreza > bot.destreza) {
                    bot.setDisponivel(false);
                    return 1;
                }else{
                    player.setDisponivel(false);
                    return 2;
                }
            case 2:
                if (player.constituicao == bot.constituicao) {
                    return 0;
                } else if (player.constituicao > bot.constituicao) {
                    bot.setDisponivel(false);
                    return 1;
                } else {
                    player.setDisponivel(false);
                    return 2;
                }
            case 3:
                if (player.inteligencia == bot.inteligencia) {
                    return 0;
                } else if (player.inteligencia > bot.inteligencia) {
                    bot.setDisponivel(false);
                    return 1;
                } else {
                    player.setDisponivel(false);
                    return 2;
                }
            case 4:
                if (player.sabedoria == bot.sabedoria) {
                    return 0;
                } else if (player.sabedoria > bot.sabedoria) {
                    bot.setDisponivel(false);
                    return 1;
                } else {
                    player.setDisponivel(false);
                    return 2;
                }
            case 5:
                if (player.carisma == bot.carisma) {
                    return 0;
                } else if (player.carisma > bot.carisma) {
                    bot.setDisponivel(false);
                    return 1;
                } else {
                    player.setDisponivel(false);
                    return 2;
                }
            default:
                return 0;
        }

    }
    

}
