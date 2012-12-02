package plaidgui.auxiliary;

import java.awt.event.ActionEvent;
import plaid.runtime.PlaidMethod;
import plaid.runtime.Util;

public class FocusListener implements java.util.EventListener {
	PlaidMethod p_handler;
	
	public FocusListener(PlaidMethod handler) {
		p_handler = handler;
	}


	public void focusGained(ActionEvent e) {
		p_handler.invoke(Util.unit());
	}

}
