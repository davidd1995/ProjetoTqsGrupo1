/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managBeans;
import list.Jogo;
import facades.GameFacade;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
/**
 *
 * @author david-pc
 */
@Named(value = "Game")
@ViewScoped
public class Game implements Serializable{

    @EJB
    private GameFacade gameFacade = new GameFacade();
    private List<Jogo> games;
    private Jogo listgames;
    @PostConstruct
    public void init() {
        games = gameFacade.findAll();
        listgames = gameFacade.find(Long.valueOf(2));
    }
    public List<Jogo> getGame(){
        return games;
    }
    
    public void getGameByName(String Name){
        games = gameFacade.getGameByName(Name);
    }

    public Jogo getSelectedGame() {
        return listgames;
    }

    public void setSelectedGame(Jogo gamechoose) {
        this.listgames = gamechoose;
    }
    
    
}
