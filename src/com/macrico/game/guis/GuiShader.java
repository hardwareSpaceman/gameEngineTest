package com.macrico.game.guis;

import com.macrico.game.shaders.ShaderProgram;
import org.lwjgl.util.vector.Matrix4f;

public class GuiShader extends ShaderProgram {

    private static final String VERTEX_FILE = "/com/macrico/game/guis/guiVertexShader.txt";
    private static final String FRAGMENT_FILE = "/com/macrico/game/guis/guiFragmentShader.txt";

    private int location_transformationMatrix;

    public GuiShader() {
        super(VERTEX_FILE, FRAGMENT_FILE);
    }

    public void loadTransformation(Matrix4f matrix) {
        super.loadMatrix(location_transformationMatrix, matrix);
    }

    protected void getAllUniformLocations() {
        location_transformationMatrix = super.getUniformLocation("transformationMatrix");
    }

    protected void bindAttributes() {
        super.bindAttribute(0, "position");
    }
}
