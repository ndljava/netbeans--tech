/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.view;

import java.util.Collection;
import java.util.Iterator;
import org.myorg.api.Event;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.Lookup;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;
import org.openide.util.Utilities;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//org.myorg.view//MyView//EN",
        autostore = false)
@TopComponent.Description(
        preferredID = "MyViewTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "explorer", openAtStartup = true)
@ActionID(category = "Window", id = "org.myorg.view.MyViewTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_MyViewAction",
        preferredID = "MyViewTopComponent")
@Messages({
    "CTL_MyViewAction=MyView",
    "CTL_MyViewTopComponent=MyView Window",
    "HINT_MyViewTopComponent=This is a MyView window"
})
public final class MyViewTopComponent extends TopComponent implements LookupListener {

    private Lookup.Result<Event> result;

    public MyViewTopComponent() {
        initComponents();
        setName(Bundle.CTL_MyViewTopComponent());
        setToolTipText(Bundle.HINT_MyViewTopComponent());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        jTextField1.setText(org.openide.util.NbBundle.getMessage(MyViewTopComponent.class, "MyViewTopComponent.jTextField1.text")); // NOI18N

        jTextField2.setText(org.openide.util.NbBundle.getMessage(MyViewTopComponent.class, "MyViewTopComponent.jTextField2.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
        result = Utilities.actionsGlobalContext().lookupResult(Event.class);
        result.addLookupListener(this);
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }

    @Override
    public void resultChanged(LookupEvent le) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Collection<? extends Event> all = result.allInstances();
        System.out.println(all.size() + "leng");
        if (!all.isEmpty()) {

            StringBuilder t1 = new StringBuilder();
            StringBuilder t2 = new StringBuilder();

            Iterator<? extends Event> it = all.iterator();
            while (it.hasNext()) {
                Event eve = (Event) it.next();
                t1.append(eve.getIndex());
                t2.append(eve.getDate());

                if (it.hasNext()) {
                    t1.append(",");
                    t2.append(",");
                }
            }

            jTextField1.setText("create :" + t1);
            jTextField2.setText("date:" + t2);
        } else {
            jTextField1.setText("[no selected]");
            jTextField2.setText("");
        }

    }
}
