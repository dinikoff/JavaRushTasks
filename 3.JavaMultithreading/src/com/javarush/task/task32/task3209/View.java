package com.javarush.task.task32.task3209;

import com.javarush.task.task32.task3209.listeners.FrameListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {

    private Controller controller;
    private JTabbedPane tabbedPane = new JTabbedPane();
    private JTextPane htmlTextPane = new JTextPane();
    private JEditorPane plainTextPane = new JEditorPane();

    public Controller getController() {
        return controller;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    public void init() {
        initGui();

        FrameListener frameListener = new FrameListener(this);
        this.addWindowListener(frameListener);
        setVisible(true);
    }

    public void initGui() {
        initEditor();
        initMenuBar();
        pack();
    }

    public void initEditor() {

    }

    public void initMenuBar() {

    }

    public void selectedTabChanged(){

    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void exit() {
        controller.exit();
    }
}
