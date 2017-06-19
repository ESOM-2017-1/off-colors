package ocularium.actions;

import javax.swing.JOptionPane;

import com.change_vision.jude.api.inf.AstahAPI;
import com.change_vision.jude.api.inf.model.IModel;
import com.change_vision.jude.api.inf.project.ProjectAccessor;
import com.change_vision.jude.api.inf.ui.IPluginActionDelegate;
import com.change_vision.jude.api.inf.ui.IWindow;

import ocularium.internal.RefactorFacade;

public class HelloWorldAction implements IPluginActionDelegate {

	@Override
	public Object run(IWindow window) throws UnExpectedException {
		try {
			AstahAPI api = AstahAPI.getAstahAPI();
			ProjectAccessor projectAccessor = api.getProjectAccessor();
			IModel project = projectAccessor.getProject();
			
			RefactorFacade rf = new RefactorFacade(project);
	        String className = JOptionPane.showInputDialog(window.getParent(), "Name the class to export the interface from: ");
	        rf.initialize();
	        
	      
	        JOptionPane.showMessageDialog(window.getParent(), "Successful interface creation.");
	      } catch (Exception e) {
	        JOptionPane.showMessageDialog(window.getParent(), "Exception occured", "Alert", JOptionPane.ERROR_MESSAGE);
	          throw new UnExpectedException();
	      }
		return null;
	}

}
