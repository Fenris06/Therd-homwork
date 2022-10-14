import Manager.TaskManager;
import Tasks.Epic;
import Tasks.SubTask;
import Tasks.Task;

public class Main {

    public static void main(String[] args) {
        System.out.println("Поехали!");
        TaskManager taskManager = new TaskManager();

        Task task1 = new Task("переезд", 0, "собрать коробки", "NEW");
        Task task2 = new Task("уборка", 0, "помыть посуду", "NEW");
        Epic epic1 = new Epic("Переезд", 0, "Организовать переезд", "NEW");
        SubTask subTask1 = new SubTask("Подготовка к перезду", 0, "Собрать вещи", "NEW");
        SubTask subTask2 = new SubTask("Подготовка к перезду", 0, "Упаковать вещи", "NEW");
        Epic epic2 = new Epic("Учеба", 0, "Выполнить задание", "NEW");
        SubTask subTask3 = new SubTask("Т.З 3", 0, "Написать код", "DONE");

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        System.out.println(taskManager.getTasks());

        Task task3 = new Task("переезд", 0, "собрать коробки", "DONE");
        Task task4 = new Task("уборка", 1, "помыть посуду", "DONE");

        taskManager.updateTask(task3);
        taskManager.updateTask(task4);
        System.out.println(taskManager.getTasks());
        taskManager.deleteTask(0);
        System.out.println(taskManager.getTasks());

        taskManager.addEpic(epic1);
        taskManager.addEpic(epic2);
        System.out.println("Таблица эпиков" + taskManager.getEpics());
        subTask1.setEpicId(2);
        subTask2.setEpicId(2);
        subTask3.setEpicId(3);
        taskManager.addSubtask(subTask1);
        taskManager.addSubtask(subTask2);
        taskManager.addSubtask(subTask3);
        System.out.println("Таблица эпиков после добавления сабтасков " + taskManager.getEpics());
        System.out.println("Таблица сабтасков " + taskManager.getSubTask());

        SubTask subTask4 = new SubTask("Подготовка к перезду", 4, "Собрать вещи", "NEW");
        SubTask subTask5 = new SubTask("Подготовка к перезду", 5, "Упаковать вещи", "DONE");
        SubTask subTask6 = new SubTask("Т.З 3", 6, "Написать код", "NEW");


        taskManager.updateSubTask(subTask4);
        taskManager.updateSubTask(subTask5);
        taskManager.updateSubTask(subTask6);
        System.out.println("Таблица эпиков после обновления  сабтасков " + taskManager.getEpics());
        System.out.println("Таблица сабтасков после обновления  сабтасков " + taskManager.getSubTask());
        taskManager.deleteEpic(2);
        System.out.println("Таблица эпиков после удоления  эпика " + taskManager.getEpics());
        System.out.println("Таблица сабтасков удоления  эпика " + taskManager.getSubTask());
    }
}