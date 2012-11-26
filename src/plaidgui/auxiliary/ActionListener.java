package plaidgui.auxiliary;

import java.awt.event.ActionEvent;
import plaid.runtime.PlaidMethod;
import plaid.runtime.Util;

public class ActionListener implements java.awt.event.ActionListener {
	PlaidMethod p_handler;
	
	public ActionListener(PlaidMethod handler) {
		p_handler = handler;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		p_handler.invoke(Util.unit());
	}

}
