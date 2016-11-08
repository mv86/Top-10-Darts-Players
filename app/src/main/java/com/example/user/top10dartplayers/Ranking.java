package com.example.user.top10dartplayers;

import java.util.ArrayList;

/**
 * Created by user on 07/11/2016.
 */

public class Ranking {

    protected ArrayList<Player> top10Ranking;


    public ArrayList<Player> insertPlayerIntoTop10Table(String playerInfo) {
        top10Ranking.add(playerInfo);
        return top10Ranking;
    }




}
