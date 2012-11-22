package plaidgui.auxiliary;

import java.awt.event.*;
import plaid.runtime.*;

// TODO: replace this with pure Plaid code when Plaid/Java interop improves
public class WindowListener extends WindowAdapter {
	PlaidMethod plaidFunction;
	public WindowListener(PlaidMethod f) {
		plaidFunction = f;
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("invoking close");
		plaidFunction.invoke(Util.unit());
	}
}
