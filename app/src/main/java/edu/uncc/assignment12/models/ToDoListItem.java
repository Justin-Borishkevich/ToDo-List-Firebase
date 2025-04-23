package edu.uncc.assignment12.models;

public class ToDoListItem {
    String name;
    String priority;

    String todolist_item_id;

    public ToDoListItem() {
    }

    public ToDoListItem(String name, String priority) {
        this.name = name;
        this.priority = priority;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getTodolist_item_id() {
        return todolist_item_id;
    }

    public void setTodolist_item_id(String todolist_item_id) {
        this.todolist_item_id = todolist_item_id;
    }

    @Override
    public String toString() {
        return "ToDoListItem{" +
                "name='" + name + '\'' +
                ", priority='" + priority + '\'' +
                ", todolist_item_id='" + todolist_item_id + '\'' +
                '}';
    }
}
