/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.myorg.hello.wccccTopComponent;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;

@ActionID(
        category = "Window",
        id = "com.frame.ui.SomeAction")
@ActionRegistration(
        displayName = "#CTL_SomeAction")
@ActionReference(path = "Menu/Window", position = 3333, separatorAfter = 3383)
@Messages("CTL_SomeAction=dddd")
public final class SomeAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
        System.out.println("ndljava");

         TopComponent win = new wccccTopComponent();
       // TopComponent win = new TopComponent();

        //win.add(new Upanel());
        //win.setDisplayName("ssss");
        win.open();
        win.requestActive();

    }
}
