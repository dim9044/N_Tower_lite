package ru.n_develop.tower_lite.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import ru.n_develop.tower_lite.N_Tower_Lite;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "GameScreen";
		config.width = 600;
		config.height = 600;
		new LwjglApplication(new N_Tower_Lite(), config);
	}
}
