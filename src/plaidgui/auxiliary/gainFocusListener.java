package plaidgui.auxiliary;

import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;

import plaid.runtime.PlaidMethod;
import plaid.runtime.Util;

public class gainFocusListener implements java.awt.event.FocusListener {
	PlaidMethod p_handler;
	
	public gainFocusListener(PlaidMethod handler) {
		p_handler = handler;
	}


	
	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		System.out.println("gaining focus");
		p_handler.invoke(Util.unit());
	}
	
}
