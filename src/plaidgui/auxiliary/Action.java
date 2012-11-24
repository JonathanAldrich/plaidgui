package plaidgui.auxiliary;

import java.awt.event.*;

import plaid.runtime.*;


// TODO: replace this with pure Plaid code when Plaid/Java interop improves
public class Action implements ActionListener {

	PlaidMethod plaidFunction;
	PlaidMethod call;
	public Action(PlaidMethod f) {
		plaidFunction = f;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		java.lang.System.out.println(" button has been clicked");
				}
	
}
