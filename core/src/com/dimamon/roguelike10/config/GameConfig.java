package com.dimamon.roguelike10.config;

import com.badlogic.gdx.graphics.Color;

/**
 * Created by dimamon on 4/9/17.
 */

public class GameConfig {

    public static final String VERSION = "dev.68";
    public static final String NAME = "Roguelike10";
    public static final String FULL_NAME = NAME + " " + VERSION;

    /**
     * WIDTH AND HEIGHT OF GAME SCREEN IN PIXELS
     * 1) 800 x 480  (25:15 blocks)
     * 2) 1280 x 720 (40:22) + 0,5
     */
//    public static final int HEIGHT = 480;
//    public static final int WIDTH = 800;

    public static final int HEIGHT = 720;
    public static final int WIDTH = 1280;

    public static final int TEXTURE_SIZE = 32;

    /**
     * OFFSET FROM TOP, IN BLOCKS
     */
    public static final int INTERFACE_OFFSET = 1;
    /**
     * FLOOR SIZE IN BLOCKS
     */
    public static final int FLOOR_SIZE_X = WIDTH/TEXTURE_SIZE;
    public static final int FLOOR_SIZE_Y = HEIGHT/TEXTURE_SIZE - INTERFACE_OFFSET;


    //------------------GAME PLAY-------------------------------------------------

    public static final long AUTOMOVE_TIME = 150l;

    /**
     * DEEPS OF GAME MAP
     */
    public static final int FLOOR_COUNT = 10;

    public static final int DEFAULT_HP = 10;
    public static final int DEFAULT_ATTACK = 3;

    public static final int SMALL_HEAL = 8;
    public static final int BIG_HEAL = 16;
    public static final int HEAL_ROOM = 12;
    /**
     * In percent
     */
    public static final int DEFAULT_DODGE_CHANCE = 8;

    /**
     * Distance, what creatures can see
     */
    public static final int DEFAULT_VISION_DISTANCE = 2;


    //----------LEVEL & XP---------------
    public static final int HIT_XP = 20;
    public static final int LEVEL_UP_ATTRIBUTES = 5;



    public static final int START_TRAP_COUNT = 3;
    public static final int MIN_TRAP_DAMAGE = 5;
    public static final int MAX_TRAP_DAMAGE = 15;

    /**
     * Minimum distance between stairs up and stairs down
     */
    public static final int STAIRS_DISTANCE = 25;


    //-----------SOUND-------------------------------
    public static final float PLAYER_VOLUME = 0.5f;
    public static final float CREATURES_VOLUME = 0.2f;


    //-----------VISUAL------------------------------

    public static final Color GAME_SCREEN_BACKGROUND = new Color(0.50f, 0.35f, 0.1f, 1f);


}
