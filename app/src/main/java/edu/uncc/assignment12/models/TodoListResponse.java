package edu.uncc.assignment12.models;

import java.util.List;

public class TodoListResponse {
    private String status;
    private List<ToDoList> todolists;

    public String getStatus() {
        return status;
    }
    public List<ToDoList> getTodoLists() {
        return todolists;
    }
}
