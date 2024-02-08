package com.sanie.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileComponent {
    private List<FileComponent> children = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileComponent component) {
        children.add(component);
    }

    public void remove(FileComponent component) {
        children.remove(component);
    }

    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileComponent component : children) {
            component.showDetails();
        }
    }
}
