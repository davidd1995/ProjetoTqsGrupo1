/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Jorge-pc
 */
class Car {
    private List<Games> games;
    private static final long serialVersionUID = 746972771702940782L;
    public Car(){
        games = new ArrayList<>();
    }
    
    public void addGames(Games p){
        games.add(p);
    }
    
    public void removeGames(Games p){
        games.remove(p);
    }
    
    public void clearGames(){
        games.clear();
    }
    
    public Games getGame(Games p){
        return games.get(games.indexOf(p));
    }
    public Games getGame(long gameId){
        Games searchGame = null;
        for(Games g : games){
            if(g.getGameId() == gameId){
                searchGame = g;
            }
        }
        return searchGame;
    }
    public List<Games> getProducts(){
        return cloneList(games);
    }
    
    private List<Games> cloneList(List<Games> list){
        List<Games> clone = new ArrayList<>();
        for(Iterator<Games> it = list.iterator(); it.hasNext(); ){
            clone.add(it.next());
        }
        return clone;
    }
    
    public int getGamesAmount(Games p ){
        int amount = 0;
        for(Games prod: games){
            if(prod == p)
                amount++;
        }
        return amount;
    }
    
    @Override
    public String toString(){
        return games.toString();
    }
}
