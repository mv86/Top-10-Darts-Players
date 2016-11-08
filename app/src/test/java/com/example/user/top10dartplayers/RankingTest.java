package com.example.user.top10dartplayers;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 07/11/2016.
 */

public class RankingTest {

    Player player;
    Ranking top10Ranking;


//
//    Ranking emptyTop10 = new ArrayList<Player>;

    @Before
    public void before() {

        Ranking top10Ranking = new ArrayList<Player>();

        player1 = new Player("Michael van Gerwen", "The Bruiser", 1);
        player1Info = player1.getPlayerDetails();
        player2 = new Player("Jimmy James", "The Boss", 2);
        player3 = new Player("Dave Winston", "The Quiet One", 3);
        player4 = new Player("Michael van Shoe", "The Brick", 4);
        player5 = new Player("Gus Gerwen", "The Maverick", 5);
        player6 = new Player("Mac Daddy", "The Bouncer", 6);
        player7 = new Player("Brad Jones", "The Tomcat", 7);
        player8 = new Player("Mich The Kid", "The Talker", 8);
        player9 = new Player("Vince van Wen", "The Hitman", 9);
        player10 = new Player("Billy Bob", "The Dude", 10);
//        top10Ranking = {
//                player1.getPlayerDetails(),
//                player2.getPlayerDetails(),
//                player3.getPlayerDetails(),
//                player4.getPlayerDetails(),
//                player5.getPlayerDetails(),
//                player6.getPlayerDetails(),
//                player7.getPlayerDetails(),
//                player8.getPlayerDetails(),
//                player9.getPlayerDetails(),
//                player10.getPlayerDetails()
//        };


        @Test
        public void testInsertedIntoTop10Ranking () {
            top10Ranking.insertPlayerIntoTop10Table(player1Info);
            assertEquals({"Name: Michael van Gerwen. Nickname: The Bruiser. Current Ranking: 1",
                    top10Ranking[0]);
            assertEquals(1, top10Ranking.size());
        }


    }

}
