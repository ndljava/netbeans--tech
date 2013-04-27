/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.editor;

import java.util.Arrays;
import java.util.List;
import org.myorg.api.Event;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author Administrator
 */
public class EventChildFactory extends ChildFactory<Event> {

    @Override
    protected Node createNodeForKey(Event key) {
        Node n = new AbstractNode(Children.create(new EventChildFactory(), true), Lookups.singleton(key));
        n.setDisplayName(key.toString());
        return n;
    }

    @Override
    protected boolean createKeys(List<Event> list) {
        Event[] o = new Event[5];
        for (int i = 0; i < o.length; i++) {
            o[i] = new Event();
        }

        list.addAll(Arrays.asList(o));

        return true;

    }
}
