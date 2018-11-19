package Zadatak1;


public class SolarizedDarkThemeFactory implements AbsFactoryTheme {

	@Override
	public ScrollBar createScrollBar() {
		SolarizedDarkThemeScrollBar scb = new SolarizedDarkThemeScrollBar();
		return scb;
	}

	@Override
	public MenuBar createMenuBar() {
		SolarizedDarkThemeMenuBar dmb = new SolarizedDarkThemeMenuBar();
		return dmb;
	}

	@Override
	public StatusBar createStatusBar() {
		SolarizedDarkThemeStatusBar dsb = new SolarizedDarkThemeStatusBar();
		return dsb;
	}

	@Override
	public Window createWindow() {
		SolarizedDarkThemeWindow dtw = new SolarizedDarkThemeWindow();
		return dtw;
	}

	@Override
	public ToolBar createToolBar() {
		SolarizedDarkThemeToolBar dtb = new SolarizedDarkThemeToolBar();
		return dtb;
	}

}
