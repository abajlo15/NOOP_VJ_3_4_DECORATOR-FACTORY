package Zadatak1;

public class Application {

	private AbsFactoryTheme gui;
	private MenuBar mnb;
	private ScrollBar scb;
	private StatusBar stb;
	private ToolBar tlb;
	private Window wdw;

	public Application(AbsFactoryTheme gui) {

		this.gui = gui;
		paint();
	}

	public void createGUI() {

		mnb = gui.createMenuBar();
		scb = gui.createScrollBar();
		stb = gui.createStatusBar();
		tlb = gui.createToolBar();
		wdw = gui.createWindow();

	}

	public void paint() {
		createGUI();
		mnb.paint();
		scb.paint();
		stb.paint();
		tlb.paint();
		wdw.paint();
	}
}