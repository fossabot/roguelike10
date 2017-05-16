package com.dimamon.roguelike10.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.dimamon.roguelike10.App;
import com.dimamon.roguelike10.config.GameConfig;
import com.dimamon.roguelike10.sound.Sounds;

/**
 * Created by dimamon on 5/16/17.
 */
public class LoseScreen extends AbstractScreen {

    Color fontColor = new Color(0.5f,0.3f,0f,1f);
    BitmapFont font;

    private SpriteBatch batch;

    public LoseScreen(final App app) {
        super(app);

        font = new BitmapFont();
        font.setColor(fontColor);

        batch = new SpriteBatch();
    }

    @Override
    public void show() {
        Sounds.lose();
    }

    @Override
    public void render(float delta) {
        handleInput();
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();

        font.draw(batch,"YOU LOSE! Press SPACE to play again, Q to exit", GameConfig.WIDTH/2,GameConfig.HEIGHT/2);

        batch.end();
    }

    private void handleInput(){

        if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE)){
            app.setScreen(new GameScreen(app));
        }
        if(Gdx.input.isKeyJustPressed(Input.Keys.Q)){
            Gdx.app.exit();
        }

    }

    @Override
    public void dispose() {
        font.dispose();
        batch.dispose();
    }
}