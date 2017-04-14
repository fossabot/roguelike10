package com.dimamon.roguelike10.entities.map;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.dimamon.roguelike10.config.MapUtils;
import com.dimamon.roguelike10.entities.GameObject;

/**
 * Created by dimamon on 4/9/17.
 */
public class Tile implements GameObject{

    private Texture texture;
    private String name;

    //Can creatures move to this tile
    private boolean blocking;

    public Tile(Texture texture, String name, boolean blocking) {
        this.texture = texture;
        this.name = name;
        this.blocking = blocking;
    }

    public boolean isBlocking() {
        return blocking;
    }

    public void render(SpriteBatch batch, int x, int y) {
        batch.draw(texture, MapUtils.toReal(x),MapUtils.toReal(y));
    }

    //TODO: remove?
    @Override
    public void render(SpriteBatch batch) {
    }

    //TODO: remove?
    @Override
    public void update() {

    }

    @Override
    public void dispose() {
        texture.dispose();
    }
}