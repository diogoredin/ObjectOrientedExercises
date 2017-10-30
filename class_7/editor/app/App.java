package editor.app;

import editor.core.Editor;

public class App {

	public static void main (String[] args) {

		Editor editor = new Editor();
		MainMenu menu = new MainMenu( editor );

		pt.tecnico.po.ui.Dialog.IO.setTitle("App Menu");
		menu.open();
		pt.tecnico.po.ui.Dialog.IO.close();

	}
}