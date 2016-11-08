package com.example.user.top10dartplayers;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 07/11/2016.
 */

public class PlayerTest {

    Player player;

    @Before
    public void before() {
        player = new Player("Michael van Gerwen", "The Bruiser", 1);
        player2 = new Player("Jimmy James", "The Boss", 2);
        player3 = new Player("Dave Winston", "The Quiet One", 3);
        player4 = new Player("Michael van Shoe", "The Brick", 4);
        player5 = new Player("Gus Gerwen", "The Maverick", 5);
        player6 = new Player("Mac Daddy", "The Bouncer", 6);
        player7 = new Player("Brad Jones", "The Tomcat", 7);
        player8 = new Player("Mich The Kid", "The Talker", 8);
        player9 = new Player("Vince van Wen", "The Hitman", 9);
        player10 = new Player("Billy Bob", "The Dude", 10);
    }

    @Test
    public void testGetName() {
        assertEquals("Michael van Gerwen", player.getName());
    }

    @Test
    public void testGetNickname() {
        assertEquals("The Bruiser", player.getNickname());
    }

    @Test
    public void testGetCurrentRanking() {
        assertEquals(1, player.getCurrentRanking());
    }

    @Test
    public void testGetPlayerDetails() {
        String playersDetails = player.getPlayerDetails();
        assertEquals("Name: Michael van Gerwen. Nickname: The Bruiser. Current Ranking: 1",
                playersDetails);
    }
}
