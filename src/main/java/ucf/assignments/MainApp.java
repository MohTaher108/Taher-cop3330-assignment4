/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Mohammad Taher
 */

package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

// This class will be used to make and implement any anchor panes
class anchorPane {
    /*
    make a new anchor pane
     */

    void addAnchorPaneToTab(Tab tab) {
        /*
        TabPane add newAnchorPane
         */
    }

    void addAnchorPaneToTitledPane(TitledPane titledPane) {
    /*
        TitledPane add newAnchorPane
     */
    }
}

class contextMenuForTitledPanes {
    /*
    make ContextMenu
    make remove TitledPane menuItem
    make mark item complete menuItem
    add menuItems to ContextMenu
    */
}

// This class will be used to make a new titledPane for my accordions
class titledPane {
    /*
    make a new titledPane
    make anchorPane
    make TextFields description, dueDate
    make new context menu for titled panes
    */

    void editTitledPaneName(String string) {
        /*
        Titled Pane's name = string
         */
    }

    void removeItemFromAccordion(Accordion accordion) {
        /*
        Accordion remove TitledPane
         */
    }

    void addTitledPaneToAccordion(Accordion accordion) {
    /*
        Accordion add TitledPane
     */
    }

    void addTextFieldToAnchorPane(AnchorPane anchorPane) {
         /*
        TitledPane add TextFields
        */
    }
}


// This class will be used to make an accordion of panes that will each contain an item
class accordion {
    /*
    make a new accordion
    */

    void addAccordionToAnchorPane(AnchorPane anchorPane) {
        /*
        AnchorPane add Accordion
        */
    }
}

class contextMenuForTabs {
    /*
    make ContextMenu
    make remove tab menuItem
    make edit tab name menuItem
    make display all items in list menuItem
    make display inCompleted items in list menuItem
    make display completed items in list menuItem
    make save toDoList menuItem
    make sort TitledPanes by Duedate menuItem
    add all menuItems to ContextMenu
    */
}

// This class will be used to make more to do lists (which will be tabs of a TabPane)
class tab {
    /*
    Make a new tab
    make new context menu for tabs
    */

    void EditNameOfTab(String string) {
        /*
        this.tab = string
        */
    }

    void removeTabFromTabPane(TabPane tabPane) {
        /*
        TabPane remove tab
         */
    }

    void addTabToTabPane(TabPane tabPane) {
        /*
        TabPane add newTab
        */
    }
}

class contextMenuForTabPanes {
    /*
    make ContextMenu
    make save allTodoLists menuItem
    make load todoList menuItem
    make load allTodoLists menuItem
    add all menuItems to ContextMenu
    */
}

class tabPane {
    /*
    make new TabPane
    make ContextMenuForTabPanes
     */

    void addTabPaneToAnchorPane(AnchorPane anchorPane) {
        /*
        AnchorPane add TabPane
         */
    }
}

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        stage.setTitle("Todo Maker");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}