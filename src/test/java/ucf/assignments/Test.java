/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Mohammad Taher
 */

package ucf.assignments;

import javafx.fxml.FXML;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainAppTest {
    @Test
    void AddTodoList() {
        /*
        test = new Controller()
        AddTodoList()
        if(TabPane has one more tab than before, success!)
        assertTrue(boolean)
         */
    }

    @Test
    void removeTodoList() {
        /*
        test = new Controller()
        removeTodoList()
        if(TabPane has one less tab than before, success!)
        assertTrue(boolean)
         */
    }

    @Test
    void editToDoListTitle() {
        /*
        test = new Controller()
        editToDoListTitle()
        assertEquals(TabPane title, new inputted title)
         */
    }

    @Test
    void AddItem() {
        /*
        test = new Controller()
        AddItem()
        if(Accordion has one more TitledPane than before, success!)
        assertTrue(boolean)
         */
    }
    @Test
    void removeItem() {
        /*
        test = new Controller()
        removeItem()
        if(Accordion has one less TitledPane than before, success!)
        assertTrue(boolean)
         */
    }

    @Test
    void markItemComplete() {
        /*
        test = new Controller()
        markItemComplete()
        If(TitledPane boolean value (or color) has changed to marked value (or color), success!)
        assertTrue(boolean)
         */
    }

    @Test
    void displayAllItemsInTodoList() {
        /*
        test = new Controller()
        displayAllItemsInTodoList()
        assertTrue(all TitledPanes are being shown)
         */
    }

    @Test
    void displayAllCompleteItemsInTodoList() {
        /*
        test = new Controller()
        displayAllCompleteItemsInTodoList()
        assertTrue(only all marked TitledPanes are being shown)
         */
    }

    @Test
    void displayAllInCompleteItemsInTodoList() {
        /*
        test = new Controller()
        displayAllInCompleteItemsInTodoList()
        assertTrue(only all unmarked TitledPanes are being shown)
         */
    }

    @Test
    void saveToDoList() {
        /*
        test = new Controller()
        saveToDoList()
        assertTrue(file.exists)
         */
    }

    @Test
    void saveAllTodoLists() {
        /*
        test = new Controller()
        saveAllTodoLists()
        for(all tabs)
            assertTrue(file.exists)
         */
    }

    @Test
    void loadTodoList() {
        /*
        test = new Controller()
        loadTodoList()
        assertEquals(expected stuff, resulting stuff)
         */
    }

    @Test
    void loadAllTodoLists() {
        /*
        test = new Controller()
        loadAllTodoLists()
        for(all tabs)
            assertEquals(expected stuff, resulting stuff)
         */
    }
}