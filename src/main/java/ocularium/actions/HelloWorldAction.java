package ocularium.actions;

import javax.swing.JOptionPane;
import com.change_vision.jude.api.inf.ui.IPluginActionDelegate;
import com.change_vision.jude.api.inf.ui.IWindow;

public class HelloWorldAction implements IPluginActionDelegate {

	@Override
	public Object run(IWindow window) throws UnExpectedException {
		try {
	          JOptionPane.showMessageDialog(window.getParent(), "Hello World");

	      } catch (Exception e) {
	        JOptionPane.showMessageDialog(window.getParent(), "Exception occured", "Alert", JOptionPane.ERROR_MESSAGE);
	          throw new UnExpectedException();
	      }
		return null;
	}

}
