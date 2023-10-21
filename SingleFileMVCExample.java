package my_project;

import java.util.ArrayList;
import java.util.List;

public class SingleFileMVCExample {
    public static class TaskModel {
        private List<String> tasks = new ArrayList<>();

        public void addTask(String taskName) {
            tasks.add(taskName);
        }

        public void removeTask(int index) {
            if (index >= 0 && index < tasks.size()) {
                tasks.remove(index);
            }
        }

        public List<String> getAllTasks() {
            return tasks;
        }
    }

    public static class TaskView {
        public void displayTasks(List<String> tasks) {
            System.out.println("Task List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + 1 + ". " + tasks.get(i));
            }
            System.out.println();
        }
    }

    public static class TaskController {
        private TaskModel taskModel;
        private TaskView taskView;

        public TaskController(TaskModel taskModel, TaskView taskView) {
            this.taskModel = taskModel;
            this.taskView = taskView;
        }

        public void addTask(String taskName) {
            taskModel.addTask(taskName);
        }

        public void removeTask(int index) {
            taskModel.removeTask(index);
        }

        public List<String> getAllTasks() {
            return taskModel.getAllTasks();
        }

        public void updateView() {
            taskView.displayTasks(taskModel.getAllTasks());
        }
    }

    public static void main(String[] args) {
        TaskModel model = new TaskModel();
        TaskView view = new TaskView();
        TaskController controller = new TaskController(model, view);

        controller.addTask("Buy groceries");
        controller.addTask("Complete project");
        controller.addTask("Read a book");

        controller.updateView();

        controller.removeTask(1);

        controller.updateView();
    }
}

