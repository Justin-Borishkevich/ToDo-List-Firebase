package edu.uncc.assignment12.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ToDoList implements Serializable {
    String name;

    String todolist_id;

    String user_id;

    List<ToDoListItem> items = new ArrayList<>();

    public ToDoList() {
    }
    public ToDoList(String name) {
        this.name = name;
    }

    public List<ToDoListItem> getItems() {
        return items;
    }
    public String getTodolist_id() {
        return todolist_id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItems(List<ToDoListItem> items) {
        this.items = items;
    }

    public void setTodolist_id(String todolist_id) {
        this.todolist_id = todolist_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "name='" + name + '\'' +
                ", todolist_id='" + todolist_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", items=" + items +
                '}';
    }
}
