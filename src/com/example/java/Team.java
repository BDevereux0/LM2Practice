package com.example.java;


import java.util.ArrayList;

public class Team<T extends Player> {
    String teamName;
    ArrayList<T> players;
    int won;
    int lost;
    int gamePlayed;

    public void play(Team<T> otherTeam){  //this will mean calling team wins
        won++;
        gamePlayed++;

        otherTeam.lost++;
        otherTeam.gamePlayed++;
    }
    public Team(String teamName){
        this.teamName = teamName;
        players = new ArrayList<>();
    }

    public void addPlayer(T player){
        players.add(player);
    }

    public void printPlayers(){
        for (T player : players){
            System.out.println(player.getName());
        }
    }

    public static void main(String[] args) {
        HockeyPlayer hockeyPlayer = new HockeyPlayer("hockeyPlayer");
        BaseballPlayer baseballPlayer = new BaseballPlayer("baseballPlayer");
        Team<HockeyPlayer> hockeyTeam = new Team("hockeyTeam");
        Team<BaseballPlayer> baseballTeam = new Team("baseballTeam");
        hockeyTeam.addPlayer(hockeyPlayer);
        //hockeyTeam.addPlayer(baseballPlayer); //this fails because hockeyTeam is of type <HockeyPlayer>
        hockeyTeam.printPlayers();
        //the 4 lines below are valid if there is only a generic non-bound type.
        //It would throw runtime error because a string is not an Player object, but the compiler allows it.
        //binding the generic is how to prevent this.
        /*Team<String> invalidTeam = new Team<>("invalid team");
        String myStr = "hi";
        invalidTeam.addPlayer(myStr);
        invalidTeam.printPlayers();*/
        hockeyTeam.play(hockeyTeam);


    }

}
