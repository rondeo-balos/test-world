	package test.world.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import test.world.TestWorld;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		System.setProperty("org.lwjgl.opengl.Display.allowSoftwareOpenGL", "true");
		config.title = "MtxJungleGameMenu";
		//config.useGL30 = false;
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new TestWorld(), config);
	}
}
