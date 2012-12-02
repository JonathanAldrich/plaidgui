package plaidgui.auxiliary;

import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;

import plaid.runtime.PlaidMethod;
import plaid.runtime.Util;

public class lostFocusListener implements java.awt.event.FocusListener {
	PlaidMethod p_handler;
	
	public lostFocusListener(PlaidMethod handler) {
		p_handler = handler;
	}


	
	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		System.out.println("losting focus");
		p_handler.invoke(Util.unit());
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
