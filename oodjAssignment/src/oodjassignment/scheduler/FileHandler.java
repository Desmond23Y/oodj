/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodjassignment.scheduler;

/**
 *
 * @author Acer
 */
// FileHandler.java
// FileHandler.java
public abstract class FileHandler {
    protected String filePath;

    public FileHandler(String filePath) {
        this.filePath = filePath;
    }

    public abstract void readFileToTable(javax.swing.table.DefaultTableModel model) throws java.io.IOException;
}

