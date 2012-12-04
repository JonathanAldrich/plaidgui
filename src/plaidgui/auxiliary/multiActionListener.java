package plaidgui.auxiliary;

import java.awt.event.ActionEvent;

import javax.swing.SwingUtilities;

import plaid.runtime.PlaidMethod;
import plaid.runtime.Util;

public class multiActionListener implements java.awt.event.ActionListener {
	PlaidMethod p_handler;
	
	public multiActionListener(PlaidMethod handler) {
		p_handler = handler;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new Thread() {
            public void run() {
            	p_handler.invoke(Util.unit());  
            	SwingUtilities.invokeLater(
            			new Runnable() {
                            public void run() {
                           }
                        });
            }
        }.start();
	}
}
