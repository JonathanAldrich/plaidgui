package plaidgui.auxiliary;

import java.awt.event.*;
import plaid.runtime.*;

// TODO: replace this with pure Plaid code when Plaid/Java interop improves
public class WindowIconofiedListener extends WindowAdapter {
	PlaidMethod plaidFunction;
	public WindowIconofiedListener(PlaidMethod f) {
		plaidFunction = f;
	}
	
	@Override
	
	public void windowIconified(WindowEvent e){
		 System.out.println("Window Iconofied");
			plaidFunction.invoke(Util.unit());
	 }
		 
	
}
