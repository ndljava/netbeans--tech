/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.view;

import java.beans.*;

/**
 *
 * @author Administrator
 */
public class MyViewTopComponentBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( org.myorg.view.MyViewTopComponent.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor

        // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor
    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_actionMap = 1;
    private static final int PROPERTY_actions = 2;
    private static final int PROPERTY_activatedNodes = 3;
    private static final int PROPERTY_alignmentX = 4;
    private static final int PROPERTY_alignmentY = 5;
    private static final int PROPERTY_ancestorListeners = 6;
    private static final int PROPERTY_attentionHighlight = 7;
    private static final int PROPERTY_autoscrolls = 8;
    private static final int PROPERTY_background = 9;
    private static final int PROPERTY_backgroundSet = 10;
    private static final int PROPERTY_baselineResizeBehavior = 11;
    private static final int PROPERTY_border = 12;
    private static final int PROPERTY_bounds = 13;
    private static final int PROPERTY_closeOperation = 14;
    private static final int PROPERTY_colorModel = 15;
    private static final int PROPERTY_component = 16;
    private static final int PROPERTY_componentCount = 17;
    private static final int PROPERTY_componentListeners = 18;
    private static final int PROPERTY_componentOrientation = 19;
    private static final int PROPERTY_componentPopupMenu = 20;
    private static final int PROPERTY_components = 21;
    private static final int PROPERTY_containerListeners = 22;
    private static final int PROPERTY_cursor = 23;
    private static final int PROPERTY_cursorSet = 24;
    private static final int PROPERTY_debugGraphicsOptions = 25;
    private static final int PROPERTY_displayable = 26;
    private static final int PROPERTY_displayName = 27;
    private static final int PROPERTY_doubleBuffered = 28;
    private static final int PROPERTY_dropTarget = 29;
    private static final int PROPERTY_enabled = 30;
    private static final int PROPERTY_focusable = 31;
    private static final int PROPERTY_focusCycleRoot = 32;
    private static final int PROPERTY_focusCycleRootAncestor = 33;
    private static final int PROPERTY_focusListeners = 34;
    private static final int PROPERTY_focusOwner = 35;
    private static final int PROPERTY_focusTraversable = 36;
    private static final int PROPERTY_focusTraversalKeys = 37;
    private static final int PROPERTY_focusTraversalKeysEnabled = 38;
    private static final int PROPERTY_focusTraversalPolicy = 39;
    private static final int PROPERTY_focusTraversalPolicyProvider = 40;
    private static final int PROPERTY_focusTraversalPolicySet = 41;
    private static final int PROPERTY_font = 42;
    private static final int PROPERTY_fontSet = 43;
    private static final int PROPERTY_foreground = 44;
    private static final int PROPERTY_foregroundSet = 45;
    private static final int PROPERTY_graphics = 46;
    private static final int PROPERTY_graphicsConfiguration = 47;
    private static final int PROPERTY_height = 48;
    private static final int PROPERTY_helpCtx = 49;
    private static final int PROPERTY_hierarchyBoundsListeners = 50;
    private static final int PROPERTY_hierarchyListeners = 51;
    private static final int PROPERTY_htmlDisplayName = 52;
    private static final int PROPERTY_icon = 53;
    private static final int PROPERTY_ignoreRepaint = 54;
    private static final int PROPERTY_inheritsPopupMenu = 55;
    private static final int PROPERTY_inputContext = 56;
    private static final int PROPERTY_inputMap = 57;
    private static final int PROPERTY_inputMethodListeners = 58;
    private static final int PROPERTY_inputMethodRequests = 59;
    private static final int PROPERTY_inputVerifier = 60;
    private static final int PROPERTY_insets = 61;
    private static final int PROPERTY_keyListeners = 62;
    private static final int PROPERTY_layout = 63;
    private static final int PROPERTY_lightweight = 64;
    private static final int PROPERTY_locale = 65;
    private static final int PROPERTY_location = 66;
    private static final int PROPERTY_locationOnScreen = 67;
    private static final int PROPERTY_lookup = 68;
    private static final int PROPERTY_managingFocus = 69;
    private static final int PROPERTY_maximumSize = 70;
    private static final int PROPERTY_maximumSizeSet = 71;
    private static final int PROPERTY_minimumSize = 72;
    private static final int PROPERTY_minimumSizeSet = 73;
    private static final int PROPERTY_mouseListeners = 74;
    private static final int PROPERTY_mouseMotionListeners = 75;
    private static final int PROPERTY_mousePosition = 76;
    private static final int PROPERTY_mouseWheelListeners = 77;
    private static final int PROPERTY_name = 78;
    private static final int PROPERTY_nextFocusableComponent = 79;
    private static final int PROPERTY_opaque = 80;
    private static final int PROPERTY_opened = 81;
    private static final int PROPERTY_optimizedDrawingEnabled = 82;
    private static final int PROPERTY_paintingForPrint = 83;
    private static final int PROPERTY_paintingTile = 84;
    private static final int PROPERTY_parent = 85;
    private static final int PROPERTY_peer = 86;
    private static final int PROPERTY_persistenceType = 87;
    private static final int PROPERTY_preferredSize = 88;
    private static final int PROPERTY_preferredSizeSet = 89;
    private static final int PROPERTY_propertyChangeListeners = 90;
    private static final int PROPERTY_registeredKeyStrokes = 91;
    private static final int PROPERTY_requestFocusEnabled = 92;
    private static final int PROPERTY_rootPane = 93;
    private static final int PROPERTY_shortName = 94;
    private static final int PROPERTY_showing = 95;
    private static final int PROPERTY_size = 96;
    private static final int PROPERTY_subComponents = 97;
    private static final int PROPERTY_systemActions = 98;
    private static final int PROPERTY_tabPosition = 99;
    private static final int PROPERTY_toolkit = 100;
    private static final int PROPERTY_toolTipText = 101;
    private static final int PROPERTY_topLevelAncestor = 102;
    private static final int PROPERTY_transferHandler = 103;
    private static final int PROPERTY_treeLock = 104;
    private static final int PROPERTY_UIClassID = 105;
    private static final int PROPERTY_undoRedo = 106;
    private static final int PROPERTY_valid = 107;
    private static final int PROPERTY_validateRoot = 108;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 109;
    private static final int PROPERTY_vetoableChangeListeners = 110;
    private static final int PROPERTY_visible = 111;
    private static final int PROPERTY_visibleRect = 112;
    private static final int PROPERTY_width = 113;
    private static final int PROPERTY_x = 114;
    private static final int PROPERTY_y = 115;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[116];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", org.myorg.view.MyViewTopComponent.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", org.myorg.view.MyViewTopComponent.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_actions] = new PropertyDescriptor ( "actions", org.myorg.view.MyViewTopComponent.class, "getActions", null ); // NOI18N
            properties[PROPERTY_activatedNodes] = new PropertyDescriptor ( "activatedNodes", org.myorg.view.MyViewTopComponent.class, "getActivatedNodes", "setActivatedNodes" ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", org.myorg.view.MyViewTopComponent.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", org.myorg.view.MyViewTopComponent.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", org.myorg.view.MyViewTopComponent.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_attentionHighlight] = new PropertyDescriptor ( "attentionHighlight", org.myorg.view.MyViewTopComponent.class, null, "setAttentionHighlight" ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", org.myorg.view.MyViewTopComponent.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", org.myorg.view.MyViewTopComponent.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", org.myorg.view.MyViewTopComponent.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", org.myorg.view.MyViewTopComponent.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", org.myorg.view.MyViewTopComponent.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", org.myorg.view.MyViewTopComponent.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_closeOperation] = new PropertyDescriptor ( "closeOperation", org.myorg.view.MyViewTopComponent.class, "getCloseOperation", "setCloseOperation" ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", org.myorg.view.MyViewTopComponent.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", org.myorg.view.MyViewTopComponent.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", org.myorg.view.MyViewTopComponent.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", org.myorg.view.MyViewTopComponent.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", org.myorg.view.MyViewTopComponent.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", org.myorg.view.MyViewTopComponent.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", org.myorg.view.MyViewTopComponent.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", org.myorg.view.MyViewTopComponent.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", org.myorg.view.MyViewTopComponent.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", org.myorg.view.MyViewTopComponent.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", org.myorg.view.MyViewTopComponent.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", org.myorg.view.MyViewTopComponent.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_displayName] = new PropertyDescriptor ( "displayName", org.myorg.view.MyViewTopComponent.class, "getDisplayName", "setDisplayName" ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", org.myorg.view.MyViewTopComponent.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", org.myorg.view.MyViewTopComponent.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", org.myorg.view.MyViewTopComponent.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", org.myorg.view.MyViewTopComponent.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", org.myorg.view.MyViewTopComponent.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", org.myorg.view.MyViewTopComponent.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", org.myorg.view.MyViewTopComponent.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", org.myorg.view.MyViewTopComponent.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", org.myorg.view.MyViewTopComponent.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", org.myorg.view.MyViewTopComponent.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", org.myorg.view.MyViewTopComponent.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", org.myorg.view.MyViewTopComponent.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", org.myorg.view.MyViewTopComponent.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", org.myorg.view.MyViewTopComponent.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", org.myorg.view.MyViewTopComponent.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", org.myorg.view.MyViewTopComponent.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", org.myorg.view.MyViewTopComponent.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", org.myorg.view.MyViewTopComponent.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", org.myorg.view.MyViewTopComponent.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", org.myorg.view.MyViewTopComponent.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", org.myorg.view.MyViewTopComponent.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_helpCtx] = new PropertyDescriptor ( "helpCtx", org.myorg.view.MyViewTopComponent.class, "getHelpCtx", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", org.myorg.view.MyViewTopComponent.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", org.myorg.view.MyViewTopComponent.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_htmlDisplayName] = new PropertyDescriptor ( "htmlDisplayName", org.myorg.view.MyViewTopComponent.class, "getHtmlDisplayName", "setHtmlDisplayName" ); // NOI18N
            properties[PROPERTY_icon] = new PropertyDescriptor ( "icon", org.myorg.view.MyViewTopComponent.class, "getIcon", "setIcon" ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", org.myorg.view.MyViewTopComponent.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", org.myorg.view.MyViewTopComponent.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", org.myorg.view.MyViewTopComponent.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", org.myorg.view.MyViewTopComponent.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", org.myorg.view.MyViewTopComponent.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", org.myorg.view.MyViewTopComponent.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", org.myorg.view.MyViewTopComponent.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", org.myorg.view.MyViewTopComponent.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", org.myorg.view.MyViewTopComponent.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", org.myorg.view.MyViewTopComponent.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", org.myorg.view.MyViewTopComponent.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", org.myorg.view.MyViewTopComponent.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", org.myorg.view.MyViewTopComponent.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", org.myorg.view.MyViewTopComponent.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_lookup] = new PropertyDescriptor ( "lookup", org.myorg.view.MyViewTopComponent.class, "getLookup", null ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", org.myorg.view.MyViewTopComponent.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", org.myorg.view.MyViewTopComponent.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", org.myorg.view.MyViewTopComponent.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", org.myorg.view.MyViewTopComponent.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", org.myorg.view.MyViewTopComponent.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", org.myorg.view.MyViewTopComponent.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", org.myorg.view.MyViewTopComponent.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", org.myorg.view.MyViewTopComponent.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", org.myorg.view.MyViewTopComponent.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", org.myorg.view.MyViewTopComponent.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", org.myorg.view.MyViewTopComponent.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", org.myorg.view.MyViewTopComponent.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_opened] = new PropertyDescriptor ( "opened", org.myorg.view.MyViewTopComponent.class, "isOpened", null ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", org.myorg.view.MyViewTopComponent.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", org.myorg.view.MyViewTopComponent.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", org.myorg.view.MyViewTopComponent.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", org.myorg.view.MyViewTopComponent.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", org.myorg.view.MyViewTopComponent.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_persistenceType] = new PropertyDescriptor ( "persistenceType", org.myorg.view.MyViewTopComponent.class, "getPersistenceType", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", org.myorg.view.MyViewTopComponent.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", org.myorg.view.MyViewTopComponent.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", org.myorg.view.MyViewTopComponent.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", org.myorg.view.MyViewTopComponent.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", org.myorg.view.MyViewTopComponent.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", org.myorg.view.MyViewTopComponent.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_shortName] = new PropertyDescriptor ( "shortName", org.myorg.view.MyViewTopComponent.class, "getShortName", null ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", org.myorg.view.MyViewTopComponent.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", org.myorg.view.MyViewTopComponent.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_subComponents] = new PropertyDescriptor ( "subComponents", org.myorg.view.MyViewTopComponent.class, "getSubComponents", null ); // NOI18N
            properties[PROPERTY_systemActions] = new PropertyDescriptor ( "systemActions", org.myorg.view.MyViewTopComponent.class, "getSystemActions", null ); // NOI18N
            properties[PROPERTY_tabPosition] = new PropertyDescriptor ( "tabPosition", org.myorg.view.MyViewTopComponent.class, "getTabPosition", null ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", org.myorg.view.MyViewTopComponent.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", org.myorg.view.MyViewTopComponent.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", org.myorg.view.MyViewTopComponent.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", org.myorg.view.MyViewTopComponent.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", org.myorg.view.MyViewTopComponent.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", org.myorg.view.MyViewTopComponent.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_undoRedo] = new PropertyDescriptor ( "undoRedo", org.myorg.view.MyViewTopComponent.class, "getUndoRedo", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", org.myorg.view.MyViewTopComponent.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", org.myorg.view.MyViewTopComponent.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", org.myorg.view.MyViewTopComponent.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", org.myorg.view.MyViewTopComponent.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", org.myorg.view.MyViewTopComponent.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", org.myorg.view.MyViewTopComponent.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", org.myorg.view.MyViewTopComponent.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", org.myorg.view.MyViewTopComponent.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", org.myorg.view.MyViewTopComponent.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties

        // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties
    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_ancestorListener = 0;
    private static final int EVENT_componentListener = 1;
    private static final int EVENT_containerListener = 2;
    private static final int EVENT_focusListener = 3;
    private static final int EVENT_hierarchyBoundsListener = 4;
    private static final int EVENT_hierarchyListener = 5;
    private static final int EVENT_inputMethodListener = 6;
    private static final int EVENT_keyListener = 7;
    private static final int EVENT_mouseListener = 8;
    private static final int EVENT_mouseMotionListener = 9;
    private static final int EVENT_mouseWheelListener = 10;
    private static final int EVENT_propertyChangeListener = 11;
    private static final int EVENT_vetoableChangeListener = 12;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[13];
    
        try {
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( org.myorg.view.MyViewTopComponent.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( org.myorg.view.MyViewTopComponent.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( org.myorg.view.MyViewTopComponent.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( org.myorg.view.MyViewTopComponent.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( org.myorg.view.MyViewTopComponent.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( org.myorg.view.MyViewTopComponent.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( org.myorg.view.MyViewTopComponent.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( org.myorg.view.MyViewTopComponent.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( org.myorg.view.MyViewTopComponent.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( org.myorg.view.MyViewTopComponent.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( org.myorg.view.MyViewTopComponent.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( org.myorg.view.MyViewTopComponent.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( org.myorg.view.MyViewTopComponent.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events

        // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events
    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_action0 = 0;
    private static final int METHOD_add1 = 1;
    private static final int METHOD_add2 = 2;
    private static final int METHOD_add3 = 3;
    private static final int METHOD_add4 = 4;
    private static final int METHOD_add5 = 5;
    private static final int METHOD_add6 = 6;
    private static final int METHOD_addNotify7 = 7;
    private static final int METHOD_addPropertyChangeListener8 = 8;
    private static final int METHOD_applyComponentOrientation9 = 9;
    private static final int METHOD_areFocusTraversalKeysSet10 = 10;
    private static final int METHOD_availableModes11 = 11;
    private static final int METHOD_bounds12 = 12;
    private static final int METHOD_cancelRequestAttention13 = 13;
    private static final int METHOD_canClose14 = 14;
    private static final int METHOD_canClose15 = 15;
    private static final int METHOD_checkImage16 = 16;
    private static final int METHOD_checkImage17 = 17;
    private static final int METHOD_close18 = 18;
    private static final int METHOD_close19 = 19;
    private static final int METHOD_componentClosed20 = 20;
    private static final int METHOD_componentOpened21 = 21;
    private static final int METHOD_computeVisibleRect22 = 22;
    private static final int METHOD_contains23 = 23;
    private static final int METHOD_contains24 = 24;
    private static final int METHOD_countComponents25 = 25;
    private static final int METHOD_createImage26 = 26;
    private static final int METHOD_createImage27 = 27;
    private static final int METHOD_createToolTip28 = 28;
    private static final int METHOD_createVolatileImage29 = 29;
    private static final int METHOD_createVolatileImage30 = 30;
    private static final int METHOD_deliverEvent31 = 31;
    private static final int METHOD_disable32 = 32;
    private static final int METHOD_dispatchEvent33 = 33;
    private static final int METHOD_doLayout34 = 34;
    private static final int METHOD_enable35 = 35;
    private static final int METHOD_enable36 = 36;
    private static final int METHOD_enableInputMethods37 = 37;
    private static final int METHOD_findComponentAt38 = 38;
    private static final int METHOD_findComponentAt39 = 39;
    private static final int METHOD_firePropertyChange40 = 40;
    private static final int METHOD_firePropertyChange41 = 41;
    private static final int METHOD_firePropertyChange42 = 42;
    private static final int METHOD_firePropertyChange43 = 43;
    private static final int METHOD_firePropertyChange44 = 44;
    private static final int METHOD_firePropertyChange45 = 45;
    private static final int METHOD_firePropertyChange46 = 46;
    private static final int METHOD_firePropertyChange47 = 47;
    private static final int METHOD_getActionForKeyStroke48 = 48;
    private static final int METHOD_getBaseline49 = 49;
    private static final int METHOD_getBounds50 = 50;
    private static final int METHOD_getClientProperty51 = 51;
    private static final int METHOD_getComponentAt52 = 52;
    private static final int METHOD_getComponentAt53 = 53;
    private static final int METHOD_getComponentZOrder54 = 54;
    private static final int METHOD_getConditionForKeyStroke55 = 55;
    private static final int METHOD_getDefaultLocale56 = 56;
    private static final int METHOD_getFocusTraversalKeys57 = 57;
    private static final int METHOD_getFontMetrics58 = 58;
    private static final int METHOD_getInsets59 = 59;
    private static final int METHOD_getListeners60 = 60;
    private static final int METHOD_getLocation61 = 61;
    private static final int METHOD_getMousePosition62 = 62;
    private static final int METHOD_getPopupLocation63 = 63;
    private static final int METHOD_getPropertyChangeListeners64 = 64;
    private static final int METHOD_getRegistry65 = 65;
    private static final int METHOD_getSize66 = 66;
    private static final int METHOD_getToolTipLocation67 = 67;
    private static final int METHOD_getToolTipText68 = 68;
    private static final int METHOD_gotFocus69 = 69;
    private static final int METHOD_grabFocus70 = 70;
    private static final int METHOD_handleEvent71 = 71;
    private static final int METHOD_hasFocus72 = 72;
    private static final int METHOD_hide73 = 73;
    private static final int METHOD_imageUpdate74 = 74;
    private static final int METHOD_insets75 = 75;
    private static final int METHOD_inside76 = 76;
    private static final int METHOD_invalidate77 = 77;
    private static final int METHOD_isAncestorOf78 = 78;
    private static final int METHOD_isFocusCycleRoot79 = 79;
    private static final int METHOD_isLightweightComponent80 = 80;
    private static final int METHOD_isOpened81 = 81;
    private static final int METHOD_keyDown82 = 82;
    private static final int METHOD_keyUp83 = 83;
    private static final int METHOD_layout84 = 84;
    private static final int METHOD_list85 = 85;
    private static final int METHOD_list86 = 86;
    private static final int METHOD_list87 = 87;
    private static final int METHOD_list88 = 88;
    private static final int METHOD_list89 = 89;
    private static final int METHOD_locate90 = 90;
    private static final int METHOD_location91 = 91;
    private static final int METHOD_lostFocus92 = 92;
    private static final int METHOD_makeBusy93 = 93;
    private static final int METHOD_minimumSize94 = 94;
    private static final int METHOD_mouseDown95 = 95;
    private static final int METHOD_mouseDrag96 = 96;
    private static final int METHOD_mouseEnter97 = 97;
    private static final int METHOD_mouseExit98 = 98;
    private static final int METHOD_mouseMove99 = 99;
    private static final int METHOD_mouseUp100 = 100;
    private static final int METHOD_move101 = 101;
    private static final int METHOD_nextFocus102 = 102;
    private static final int METHOD_open103 = 103;
    private static final int METHOD_open104 = 104;
    private static final int METHOD_openAction105 = 105;
    private static final int METHOD_openAtTabPosition106 = 106;
    private static final int METHOD_paint107 = 107;
    private static final int METHOD_paintAll108 = 108;
    private static final int METHOD_paintComponents109 = 109;
    private static final int METHOD_paintImmediately110 = 110;
    private static final int METHOD_paintImmediately111 = 111;
    private static final int METHOD_postEvent112 = 112;
    private static final int METHOD_preferredSize113 = 113;
    private static final int METHOD_prepareImage114 = 114;
    private static final int METHOD_prepareImage115 = 115;
    private static final int METHOD_print116 = 116;
    private static final int METHOD_printAll117 = 117;
    private static final int METHOD_printComponents118 = 118;
    private static final int METHOD_putClientProperty119 = 119;
    private static final int METHOD_readExternal120 = 120;
    private static final int METHOD_registerKeyboardAction121 = 121;
    private static final int METHOD_registerKeyboardAction122 = 122;
    private static final int METHOD_remove123 = 123;
    private static final int METHOD_remove124 = 124;
    private static final int METHOD_remove125 = 125;
    private static final int METHOD_removeAll126 = 126;
    private static final int METHOD_removeNotify127 = 127;
    private static final int METHOD_removePropertyChangeListener128 = 128;
    private static final int METHOD_repaint129 = 129;
    private static final int METHOD_repaint130 = 130;
    private static final int METHOD_repaint131 = 131;
    private static final int METHOD_repaint132 = 132;
    private static final int METHOD_repaint133 = 133;
    private static final int METHOD_requestActive134 = 134;
    private static final int METHOD_requestAttention135 = 135;
    private static final int METHOD_requestDefaultFocus136 = 136;
    private static final int METHOD_requestFocus137 = 137;
    private static final int METHOD_requestFocus138 = 138;
    private static final int METHOD_requestFocusInWindow139 = 139;
    private static final int METHOD_requestVisible140 = 140;
    private static final int METHOD_resetKeyboardActions141 = 141;
    private static final int METHOD_reshape142 = 142;
    private static final int METHOD_resize143 = 143;
    private static final int METHOD_resize144 = 144;
    private static final int METHOD_resultChanged145 = 145;
    private static final int METHOD_revalidate146 = 146;
    private static final int METHOD_scrollRectToVisible147 = 147;
    private static final int METHOD_setBounds148 = 148;
    private static final int METHOD_setComponentZOrder149 = 149;
    private static final int METHOD_setDefaultLocale150 = 150;
    private static final int METHOD_show151 = 151;
    private static final int METHOD_show152 = 152;
    private static final int METHOD_size153 = 153;
    private static final int METHOD_toFront154 = 154;
    private static final int METHOD_toString155 = 155;
    private static final int METHOD_transferFocus156 = 156;
    private static final int METHOD_transferFocusBackward157 = 157;
    private static final int METHOD_transferFocusDownCycle158 = 158;
    private static final int METHOD_transferFocusUpCycle159 = 159;
    private static final int METHOD_unregisterKeyboardAction160 = 160;
    private static final int METHOD_update161 = 161;
    private static final int METHOD_updateUI162 = 162;
    private static final int METHOD_validate163 = 163;
    private static final int METHOD_writeExternal164 = 164;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[165];
    
        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action0].setDisplayName ( "" );
            methods[METHOD_add1] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add1].setDisplayName ( "" );
            methods[METHOD_add2] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_add2].setDisplayName ( "" );
            methods[METHOD_add3] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class})); // NOI18N
            methods[METHOD_add3].setDisplayName ( "" );
            methods[METHOD_add4] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_add4].setDisplayName ( "" );
            methods[METHOD_add5] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_add5].setDisplayName ( "" );
            methods[METHOD_add6] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_add6].setDisplayName ( "" );
            methods[METHOD_addNotify7] = new MethodDescriptor(org.openide.windows.TopComponent.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify7].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener8] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener8].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation9] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation9].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet10] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet10].setDisplayName ( "" );
            methods[METHOD_availableModes11] = new MethodDescriptor(org.openide.windows.TopComponent.class.getMethod("availableModes", new Class[] {java.util.List.class})); // NOI18N
            methods[METHOD_availableModes11].setDisplayName ( "" );
            methods[METHOD_bounds12] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds12].setDisplayName ( "" );
            methods[METHOD_cancelRequestAttention13] = new MethodDescriptor(org.openide.windows.TopComponent.class.getMethod("cancelRequestAttention", new Class[] {})); // NOI18N
            methods[METHOD_cancelRequestAttention13].setDisplayName ( "" );
            methods[METHOD_canClose14] = new MethodDescriptor(org.openide.windows.TopComponent.class.getMethod("canClose", new Class[] {})); // NOI18N
            methods[METHOD_canClose14].setDisplayName ( "" );
            methods[METHOD_canClose15] = new MethodDescriptor(org.openide.windows.TopComponent.class.getMethod("canClose", new Class[] {org.openide.windows.Workspace.class, boolean.class})); // NOI18N
            methods[METHOD_canClose15].setDisplayName ( "" );
            methods[METHOD_checkImage16] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage16].setDisplayName ( "" );
            methods[METHOD_checkImage17] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage17].setDisplayName ( "" );
            methods[METHOD_close18] = new MethodDescriptor(org.openide.windows.TopComponent.class.getMethod("close", new Class[] {})); // NOI18N
            methods[METHOD_close18].setDisplayName ( "" );
            methods[METHOD_close19] = new MethodDescriptor(org.openide.windows.TopComponent.class.getMethod("close", new Class[] {org.openide.windows.Workspace.class})); // NOI18N
            methods[METHOD_close19].setDisplayName ( "" );
            methods[METHOD_componentClosed20] = new MethodDescriptor(org.myorg.view.MyViewTopComponent.class.getMethod("componentClosed", new Class[] {})); // NOI18N
            methods[METHOD_componentClosed20].setDisplayName ( "" );
            methods[METHOD_componentOpened21] = new MethodDescriptor(org.myorg.view.MyViewTopComponent.class.getMethod("componentOpened", new Class[] {})); // NOI18N
            methods[METHOD_componentOpened21].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect22] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect22].setDisplayName ( "" );
            methods[METHOD_contains23] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains23].setDisplayName ( "" );
            methods[METHOD_contains24] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains24].setDisplayName ( "" );
            methods[METHOD_countComponents25] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents25].setDisplayName ( "" );
            methods[METHOD_createImage26] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage26].setDisplayName ( "" );
            methods[METHOD_createImage27] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage27].setDisplayName ( "" );
            methods[METHOD_createToolTip28] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip28].setDisplayName ( "" );
            methods[METHOD_createVolatileImage29] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage29].setDisplayName ( "" );
            methods[METHOD_createVolatileImage30] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage30].setDisplayName ( "" );
            methods[METHOD_deliverEvent31] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent31].setDisplayName ( "" );
            methods[METHOD_disable32] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable32].setDisplayName ( "" );
            methods[METHOD_dispatchEvent33] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent33].setDisplayName ( "" );
            methods[METHOD_doLayout34] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout34].setDisplayName ( "" );
            methods[METHOD_enable35] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable35].setDisplayName ( "" );
            methods[METHOD_enable36] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable36].setDisplayName ( "" );
            methods[METHOD_enableInputMethods37] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods37].setDisplayName ( "" );
            methods[METHOD_findComponentAt38] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt38].setDisplayName ( "" );
            methods[METHOD_findComponentAt39] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt39].setDisplayName ( "" );
            methods[METHOD_firePropertyChange40] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange40].setDisplayName ( "" );
            methods[METHOD_firePropertyChange41] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange41].setDisplayName ( "" );
            methods[METHOD_firePropertyChange42] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange42].setDisplayName ( "" );
            methods[METHOD_firePropertyChange43] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange43].setDisplayName ( "" );
            methods[METHOD_firePropertyChange44] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange44].setDisplayName ( "" );
            methods[METHOD_firePropertyChange45] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange45].setDisplayName ( "" );
            methods[METHOD_firePropertyChange46] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange46].setDisplayName ( "" );
            methods[METHOD_firePropertyChange47] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange47].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke48] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke48].setDisplayName ( "" );
            methods[METHOD_getBaseline49] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline49].setDisplayName ( "" );
            methods[METHOD_getBounds50] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds50].setDisplayName ( "" );
            methods[METHOD_getClientProperty51] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty51].setDisplayName ( "" );
            methods[METHOD_getComponentAt52] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt52].setDisplayName ( "" );
            methods[METHOD_getComponentAt53] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt53].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder54] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder54].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke55] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke55].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale56] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale56].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys57] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys57].setDisplayName ( "" );
            methods[METHOD_getFontMetrics58] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics58].setDisplayName ( "" );
            methods[METHOD_getInsets59] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets59].setDisplayName ( "" );
            methods[METHOD_getListeners60] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners60].setDisplayName ( "" );
            methods[METHOD_getLocation61] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation61].setDisplayName ( "" );
            methods[METHOD_getMousePosition62] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition62].setDisplayName ( "" );
            methods[METHOD_getPopupLocation63] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation63].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners64] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners64].setDisplayName ( "" );
            methods[METHOD_getRegistry65] = new MethodDescriptor(org.openide.windows.TopComponent.class.getMethod("getRegistry", new Class[] {})); // NOI18N
            methods[METHOD_getRegistry65].setDisplayName ( "" );
            methods[METHOD_getSize66] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize66].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation67] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation67].setDisplayName ( "" );
            methods[METHOD_getToolTipText68] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText68].setDisplayName ( "" );
            methods[METHOD_gotFocus69] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus69].setDisplayName ( "" );
            methods[METHOD_grabFocus70] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus70].setDisplayName ( "" );
            methods[METHOD_handleEvent71] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent71].setDisplayName ( "" );
            methods[METHOD_hasFocus72] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus72].setDisplayName ( "" );
            methods[METHOD_hide73] = new MethodDescriptor(java.awt.Component.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide73].setDisplayName ( "" );
            methods[METHOD_imageUpdate74] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate74].setDisplayName ( "" );
            methods[METHOD_insets75] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets75].setDisplayName ( "" );
            methods[METHOD_inside76] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside76].setDisplayName ( "" );
            methods[METHOD_invalidate77] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate77].setDisplayName ( "" );
            methods[METHOD_isAncestorOf78] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf78].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot79] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot79].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent80] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent80].setDisplayName ( "" );
            methods[METHOD_isOpened81] = new MethodDescriptor(org.openide.windows.TopComponent.class.getMethod("isOpened", new Class[] {org.openide.windows.Workspace.class})); // NOI18N
            methods[METHOD_isOpened81].setDisplayName ( "" );
            methods[METHOD_keyDown82] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown82].setDisplayName ( "" );
            methods[METHOD_keyUp83] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp83].setDisplayName ( "" );
            methods[METHOD_layout84] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout84].setDisplayName ( "" );
            methods[METHOD_list85] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list85].setDisplayName ( "" );
            methods[METHOD_list86] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list86].setDisplayName ( "" );
            methods[METHOD_list87] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list87].setDisplayName ( "" );
            methods[METHOD_list88] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list88].setDisplayName ( "" );
            methods[METHOD_list89] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list89].setDisplayName ( "" );
            methods[METHOD_locate90] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate90].setDisplayName ( "" );
            methods[METHOD_location91] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location91].setDisplayName ( "" );
            methods[METHOD_lostFocus92] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus92].setDisplayName ( "" );
            methods[METHOD_makeBusy93] = new MethodDescriptor(org.openide.windows.TopComponent.class.getMethod("makeBusy", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_makeBusy93].setDisplayName ( "" );
            methods[METHOD_minimumSize94] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize94].setDisplayName ( "" );
            methods[METHOD_mouseDown95] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown95].setDisplayName ( "" );
            methods[METHOD_mouseDrag96] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag96].setDisplayName ( "" );
            methods[METHOD_mouseEnter97] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter97].setDisplayName ( "" );
            methods[METHOD_mouseExit98] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit98].setDisplayName ( "" );
            methods[METHOD_mouseMove99] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove99].setDisplayName ( "" );
            methods[METHOD_mouseUp100] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp100].setDisplayName ( "" );
            methods[METHOD_move101] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move101].setDisplayName ( "" );
            methods[METHOD_nextFocus102] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus102].setDisplayName ( "" );
            methods[METHOD_open103] = new MethodDescriptor(org.openide.windows.TopComponent.class.getMethod("open", new Class[] {})); // NOI18N
            methods[METHOD_open103].setDisplayName ( "" );
            methods[METHOD_open104] = new MethodDescriptor(org.openide.windows.TopComponent.class.getMethod("open", new Class[] {org.openide.windows.Workspace.class})); // NOI18N
            methods[METHOD_open104].setDisplayName ( "" );
            methods[METHOD_openAction105] = new MethodDescriptor(org.openide.windows.TopComponent.class.getMethod("openAction", new Class[] {org.openide.windows.TopComponent.class, java.lang.String.class, java.lang.String.class, boolean.class})); // NOI18N
            methods[METHOD_openAction105].setDisplayName ( "" );
            methods[METHOD_openAtTabPosition106] = new MethodDescriptor(org.openide.windows.TopComponent.class.getMethod("openAtTabPosition", new Class[] {int.class})); // NOI18N
            methods[METHOD_openAtTabPosition106].setDisplayName ( "" );
            methods[METHOD_paint107] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint107].setDisplayName ( "" );
            methods[METHOD_paintAll108] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll108].setDisplayName ( "" );
            methods[METHOD_paintComponents109] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents109].setDisplayName ( "" );
            methods[METHOD_paintImmediately110] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately110].setDisplayName ( "" );
            methods[METHOD_paintImmediately111] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately111].setDisplayName ( "" );
            methods[METHOD_postEvent112] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent112].setDisplayName ( "" );
            methods[METHOD_preferredSize113] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize113].setDisplayName ( "" );
            methods[METHOD_prepareImage114] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage114].setDisplayName ( "" );
            methods[METHOD_prepareImage115] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage115].setDisplayName ( "" );
            methods[METHOD_print116] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print116].setDisplayName ( "" );
            methods[METHOD_printAll117] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll117].setDisplayName ( "" );
            methods[METHOD_printComponents118] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents118].setDisplayName ( "" );
            methods[METHOD_putClientProperty119] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty119].setDisplayName ( "" );
            methods[METHOD_readExternal120] = new MethodDescriptor(org.openide.windows.TopComponent.class.getMethod("readExternal", new Class[] {java.io.ObjectInput.class})); // NOI18N
            methods[METHOD_readExternal120].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction121] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction121].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction122] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction122].setDisplayName ( "" );
            methods[METHOD_remove123] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove123].setDisplayName ( "" );
            methods[METHOD_remove124] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove124].setDisplayName ( "" );
            methods[METHOD_remove125] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove125].setDisplayName ( "" );
            methods[METHOD_removeAll126] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll126].setDisplayName ( "" );
            methods[METHOD_removeNotify127] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify127].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener128] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener128].setDisplayName ( "" );
            methods[METHOD_repaint129] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint129].setDisplayName ( "" );
            methods[METHOD_repaint130] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint130].setDisplayName ( "" );
            methods[METHOD_repaint131] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint131].setDisplayName ( "" );
            methods[METHOD_repaint132] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint132].setDisplayName ( "" );
            methods[METHOD_repaint133] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint133].setDisplayName ( "" );
            methods[METHOD_requestActive134] = new MethodDescriptor(org.openide.windows.TopComponent.class.getMethod("requestActive", new Class[] {})); // NOI18N
            methods[METHOD_requestActive134].setDisplayName ( "" );
            methods[METHOD_requestAttention135] = new MethodDescriptor(org.openide.windows.TopComponent.class.getMethod("requestAttention", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestAttention135].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus136] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus136].setDisplayName ( "" );
            methods[METHOD_requestFocus137] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus137].setDisplayName ( "" );
            methods[METHOD_requestFocus138] = new MethodDescriptor(org.openide.windows.TopComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus138].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow139] = new MethodDescriptor(org.openide.windows.TopComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow139].setDisplayName ( "" );
            methods[METHOD_requestVisible140] = new MethodDescriptor(org.openide.windows.TopComponent.class.getMethod("requestVisible", new Class[] {})); // NOI18N
            methods[METHOD_requestVisible140].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions141] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions141].setDisplayName ( "" );
            methods[METHOD_reshape142] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape142].setDisplayName ( "" );
            methods[METHOD_resize143] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize143].setDisplayName ( "" );
            methods[METHOD_resize144] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize144].setDisplayName ( "" );
            methods[METHOD_resultChanged145] = new MethodDescriptor(org.myorg.view.MyViewTopComponent.class.getMethod("resultChanged", new Class[] {org.openide.util.LookupEvent.class})); // NOI18N
            methods[METHOD_resultChanged145].setDisplayName ( "" );
            methods[METHOD_revalidate146] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate146].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible147] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible147].setDisplayName ( "" );
            methods[METHOD_setBounds148] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds148].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder149] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder149].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale150] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale150].setDisplayName ( "" );
            methods[METHOD_show151] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show151].setDisplayName ( "" );
            methods[METHOD_show152] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show152].setDisplayName ( "" );
            methods[METHOD_size153] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size153].setDisplayName ( "" );
            methods[METHOD_toFront154] = new MethodDescriptor(org.openide.windows.TopComponent.class.getMethod("toFront", new Class[] {})); // NOI18N
            methods[METHOD_toFront154].setDisplayName ( "" );
            methods[METHOD_toString155] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString155].setDisplayName ( "" );
            methods[METHOD_transferFocus156] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus156].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward157] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward157].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle158] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle158].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle159] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle159].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction160] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction160].setDisplayName ( "" );
            methods[METHOD_update161] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update161].setDisplayName ( "" );
            methods[METHOD_updateUI162] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI162].setDisplayName ( "" );
            methods[METHOD_validate163] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate163].setDisplayName ( "" );
            methods[METHOD_writeExternal164] = new MethodDescriptor(org.openide.windows.TopComponent.class.getMethod("writeExternal", new Class[] {java.io.ObjectOutput.class})); // NOI18N
            methods[METHOD_writeExternal164].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods

        // Here you can add code for customizing the methods array.
        
        return methods;     }//GEN-LAST:Methods
    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = null;//GEN-BEGIN:Icons
    private static String iconNameC32 = null;
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;//GEN-END:Icons
    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx

//GEN-FIRST:Superclass
    // Here you can add code for customizing the Superclass BeanInfo.
//GEN-LAST:Superclass
    /**
     * Gets the bean's
     * <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean.
     * May return null if the information should be obtained by automatic
     * analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's
     * <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean. May return null if the information
     * should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will belong
     * to the IndexedPropertyDescriptor subclass of PropertyDescriptor. A client
     * of getPropertyDescriptors can use "instanceof" to check if a given
     * PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's
     * <code>EventSetDescriptor</code>s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events
     * fired by this bean. May return null if the information should be obtained
     * by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's
     * <code>MethodDescriptor</code>s.
     *
     * @return An array of MethodDescriptors describing the methods implemented
     * by this bean. May return null if the information should be obtained by
     * automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     *
     * @return Index of default property in the PropertyDescriptor array
     * returned by getPropertyDescriptors.
     * <P>	Returns -1 if there is no default property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly
     * commonly be used by human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned
     * by getEventSetDescriptors.
     * <P>	Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to represent the
     * bean in toolboxes, toolbars, etc. Icon images will typically be GIFs, but
     * may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from this
     * method.
     * <p>
     * There are four possible flavors of icons (16x16 color, 32x32 color, 16x16
     * mono, 32x32 mono). If a bean choses to only support a single icon we
     * recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background so they can be
     * rendered onto an existing background.
     *
     * @param iconKind The kind of icon requested. This should be one of the
     * constant values ICON_COLOR_16x16, ICON_COLOR_32x32, ICON_MONO_16x16, or
     * ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null
     * if no suitable icon is available.
     */
    @Override
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                if (iconNameC16 == null) {
                    return null;
                } else {
                    if (iconColor16 == null) {
                        iconColor16 = loadImage(iconNameC16);
                    }
                    return iconColor16;
                }
            case ICON_COLOR_32x32:
                if (iconNameC32 == null) {
                    return null;
                } else {
                    if (iconColor32 == null) {
                        iconColor32 = loadImage(iconNameC32);
                    }
                    return iconColor32;
                }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }
}
