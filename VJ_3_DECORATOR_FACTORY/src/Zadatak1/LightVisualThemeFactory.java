package Zadatak1;


public class LightVisualThemeFactory implements AbsFactoryTheme {

	@Override
	public ScrollBar createScrollBar() {
		LightVisualThemeScrollBar scb = new LightVisualThemeScrollBar();
		return scb;
	}

	@Override
	public MenuBar createMenuBar() {
		LightVisualThemeMenuBar dmb = new LightVisualThemeMenuBar();
		return dmb;
	}

	@Override
	public StatusBar createStatusBar() {
		LightVisualThemeStatusBar dsb = new LightVisualThemeStatusBar();
		return dsb;
	}

	@Override
	public Window createWindow() {
		LightVisualWindow dtw = new LightVisualWindow();
		return dtw;
	}

	@Override
	public ToolBar createToolBar() {
		LightVisualThemeToolBar dtb = new LightVisualThemeToolBar();
		return dtb;
	}

}
