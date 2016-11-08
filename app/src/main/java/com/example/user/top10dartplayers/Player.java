package com.example.user.top10dartplayers;

import java.util.ArrayList;

/**
 * Created by user on 07/11/2016.
 */

public class Player {

    private String name;
    private String nickname;
    private int currentRanking;

    public Player(String name, String nickname, int currentRanking) {
        this.name = name;
        this.nickname = nickname;
        this.currentRanking = currentRanking;
    }

    public String getName() {
        return this.name;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getCurrentRanking() {
        return this.currentRanking;
    }

    public String getPlayerDetails() {
        return "Name: " + name.toString() + ". Nickname: "
                + nickname.toString() + ". Current Ranking: "
                + currentRanking;
    }

//    public ArrayList<Player> insertPlayerIntoTop10Table() {
//        String playerInfo = "Name: " + name.toString() + ". Nickname: "
//                + nickname.toString() + ". Current Ranking: "
//                + currentRanking;
//        top10Ranking.add(playerInfo);
//        return top10Ranking;
//    }
}

