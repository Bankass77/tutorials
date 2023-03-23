package certification.tutorials.designpatterns.abstractFactory;

public interface AbstractWidgetFactory {

	public Window createWindow();

	public Scroll createScroll();

	public Button[] createNavigationButtons();

}
