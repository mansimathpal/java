package menubardemo;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class MenuBarDemo extends JFrame {

    JMenu fileMenu, editMenu, formatMenu, viewMenu, helpMenu;
    JMenuItem itemNew, itemNewwindow, itemOpen, itemSave, itemSaveas, itemPagesetup, itemPrint,
    itemExit, itemUndo, itemCut, itemCopy, itemDelete, itemPaste, itemSelectall, itemWordwrap,
    itemFont, itemZoom, itemStatusbar, itemViewhelp, itemSendfeedback, itemAboutnotepad;
    JMenuBar menuBar;

    public MenuBarDemo() {
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        formatMenu = new JMenu("Exit");
        viewMenu = new JMenu("View");
        helpMenu = new JMenu("Help");
        itemNew = new JMenuItem("New");
        itemNewwindow = new JMenuItem("New Window");
        itemOpen = new JMenuItem("Open");
        itemSave = new JMenuItem("Save");
        itemSaveas = new JMenuItem("Save As");
        itemPagesetup = new JMenuItem("Page Setup");
        itemPrint = new JMenuItem("Print");
        itemExit = new JMenuItem("Exit");
        itemUndo = new JMenuItem("Undo");
        itemCut = new JMenuItem("Cut");
        itemCopy = new JMenuItem("Copy");
        itemDelete = new JMenuItem("Delete");
        itemPaste = new JMenuItem("Paaste");
        itemSelectall = new JMenuItem("Select All");
        itemWordwrap = new JMenuItem("Word Wrap");
        itemFont = new JMenuItem("Font");
        itemZoom = new JMenuItem("Zoom");
        itemStatusbar = new JMenuItem("Status Bar");
        itemViewhelp = new JMenuItem("view Help");
        itemSendfeedback = new JMenuItem("Send Feedback");
        itemAboutnotepad = new JMenuItem("About Notepad");
        fileMenu.add(itemNew);
        fileMenu.add(itemNewwindow);
        fileMenu.add(itemOpen);
        fileMenu.add(itemSave);
        fileMenu.add(itemSaveas);
        fileMenu.add(itemPrint);
        fileMenu.add(itemExit);
        editMenu.add(itemUndo);
        editMenu.add(itemCut);
        editMenu.add(itemCopy);
        editMenu.add(itemPaste);
        editMenu.add(itemDelete);
        editMenu.add(itemSelectall);
        formatMenu.add(itemWordwrap);
        formatMenu.add(itemFont);
        viewMenu.add(itemZoom);
        viewMenu.add(itemStatusbar);
        helpMenu.add(itemViewhelp);
        helpMenu.add(itemSendfeedback);
        helpMenu.add(itemAboutnotepad);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(formatMenu);
        menuBar.add(viewMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);
        setTitle("Notepad");
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        MenuBarDemo mobj = new MenuBarDemo();
    }
}
