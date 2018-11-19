package Zadatak1;


public class DarkThemeFactory implements AbsFactoryTheme {

	@Override
	public ScrollBar createScrollBar() {
		DarkThemeScrollBar scb = new DarkThemeScrollBar();
		return scb;
	}

	@Override
	public MenuBar createMenuBar() {
		DarkThemeMenuBar dmb = new DarkThemeMenuBar();
		return dmb;
	}

	@Override
	public StatusBar createStatusBar() {
		DarkThemeStatusBar dsb = new DarkThemeStatusBar();
		return dsb;
	}

	@Override
	public Window createWindow() {
		DarkThemeWindow dtw = new DarkThemeWindow();
		return dtw;
	}

	@Override
	public ToolBar createToolBar() {
		DarkThemeToolBar dtb = new DarkThemeToolBar();
		return dtb;
	}

}
