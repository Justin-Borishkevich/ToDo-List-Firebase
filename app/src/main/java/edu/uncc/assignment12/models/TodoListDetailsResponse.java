package edu.uncc.assignment12.models;

public class TodoListDetailsResponse {
    private String status;
    private ToDoList todolist;

    public String getStatus() {
        return status;
    }

    public ToDoList getTodolist() {
        return todolist;
    }
}
