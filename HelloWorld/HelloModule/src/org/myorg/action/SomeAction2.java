/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.action;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "org.myorg.action.SomeAction2")
@ActionRegistration(
        displayName = "#CTL_SomeAction2")
@ActionReference(path = "Menu/File", position = 1300)
@Messages("CTL_SomeAction2=s22")
public final class SomeAction2 extends AbstractAction{

    private int i=0;
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
        
        System.out.println("sssss");
      //  WindowManager.getDefault().
      //  putValue("dd"+i, System.nanoTime() );
        i++;
    }
}
