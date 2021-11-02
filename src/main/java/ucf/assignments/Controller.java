/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Mohammad Taher
 */

package ucf.assignments;

import javafx.fxml.FXML;

public class Controller {
    /*
    @FXML private fields: TabPane, Accordion, AnchorPane, TextFields
    call all classes, so you can make the entire structure
    Use class methods to format structure
    make TabPane
    make AnchorPanes
    */

    @FXML
    protected void AddItem() {
        /*
        new titledPane
        make new anchor pane
        addAnchorPaneToTitledPane(titledPane)
        addTitledPaneToAccordion(accordion)
        setTextField(string, string)
        addTextFieldToAnchorPane(anchorPane)
         */
    }

    @FXML
    protected void removeItem() {
        /*
        removeItemFromAccordion(accordion)
         */
    }

    @FXML
    protected void markItemComplete() {
        /*
        Set TitledPane to complete (either use a boolean value or color it, whichever is easier)
         */
    }

    @FXML
    protected void AddTodoList() {
        /*
        new tab
        addAnchorPaneToTab(tab)
        addTabToTabPane(tabPane)
        make new AnchorPane
         */
    }

    @FXML
    protected void removeTodoList() {
        /*
        removeTabFromTabPane(tabPane)
         */
    }

    @FXML
    protected void editToDoListTitle() {
        /*
        EditNameOfTab(string)
         */
    }

    @FXML
    protected void displayAllItemsInTodoList() {
        /*
        for(all titledPanes)
            display titledPane
         */
    }

    @FXML
    protected void displayAllCompleteItemsInTodoList() {
        /*
        for(all titledPanes)
            if(Tab.AnchorPane.Accordion.TitledPane complete?)
                display titledPane
         */
    }

    @FXML
    protected void displayAllInCompleteItemsInTodoList() {
        /*
        for(all titledPanes)
            if(!Tab.AnchorPane.Accordion.TitledPane complete?)
                display titledPane
         */
    }

    @FXML
    protected void saveToDoList() {
        /*
        new File("TodoList 1")
         */
    }

    @FXML
    protected void saveAllTodoLists() {
        /*
        for(all tabs)
            new File("TodoList")
         */
    }

    @FXML
    protected void loadTodoList() {
        /*
        new FileReader("TodoList 1")
        open File
         */
    }

    @FXML
    protected void loadAllTodoLists() {
        /*
        for(all tabs)
            new FileReader("TodoList")
            open File
         */
    }
}

