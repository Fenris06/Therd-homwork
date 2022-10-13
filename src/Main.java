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
        SubTask subTask3 = new SubTask("Т.З 3", 0, "Написать код" , "DONE");

//
//        taskManager.addTask(task1);
//        taskManager.addTask(task2);
//        System.out.println(taskManager.getTasks());
//
//        Task task3 = new Task("переезд", 0, "собрать коробки", "DONE");
//        Task task4 = new Task("уборка", 1, "помыть посуду", "DONE");
//
//        taskManager.removeTask(task3);
//        taskManager.removeTask(task4);
//        System.out.println(taskManager.getTasks());
//        taskManager.deleteTask(0);
//        System.out.println(taskManager.getTasks());

        taskManager.addEpic(epic1);
        taskManager.addEpic(epic2);
        System.out.println("Таблица эпиков" + taskManager.getEpics());
        taskManager.addSubtask(subTask1);
        taskManager.addSubtask(subTask2);
        taskManager.addSubtask(subTask3);
        System.out.println("Таблица эпиков после добавления " + taskManager.getEpics());
        System.out.println("Таблица сабтасков " + taskManager.getSubTask());
        taskManager.deleteEpic(1);

        System.out.println("Таблица эпиков после удаления " + taskManager.getEpics());
        System.out.println("Таблица сабтасков после удоления эпика" + taskManager.getSubTask());
        taskManager.deleteSubTask(2);
        System.out.println("Таблица сабтасков после удаления сабтаска" + taskManager.getSubTask());
//        taskManager.clearAllSubTasks();
//        System.out.println("Таблица сабтасков после удаления " + taskManager.getSubTask());
//        System.out.println("Таблица эпиков после удоления собтасков " + taskManager.getEpics());
////
//        taskManager.addSubtask(subTask3);
//        System.out.println("Таблица эпиков" + taskManager.getEpics());
//        System.out.println("Таблица сабтасков " + taskManager.getSubTask());





















//        taskManager.addTask(task1);
//        taskManager.addTask(task2);
//
//
//
//        System.out.println("Список задач " + taskManager.getTasks() );
//
//        System.out.println("задача " + taskManager.getTaskFromId(2));
//        System.out.println(taskManager.getTaskFromId(5));
//
//        taskManager.deleteTask(2);
//        System.out.println("Список дадачь после удаление 2 задачи" + taskManager.getTasks());
//
//        Task task5 = new Task("спорт", 3, "пробежка", "NEW");
//        taskManager.removeTask(task5);
//
//        System.out.println("Список задач после замены задачи 3 " + taskManager.getTasks());
//
//        Task task6 = new Task("покупки", 0, "сходить в магазин", "NEW");
//        Task task7 = new Task("обед", 0, "приготовить еду", "NEW");
//        Task task8 = new Task("машина", 0, "заправить машину", "NEW");
//
//        taskManager.addTask(task6);
//        taskManager.addTask(task7);
//        taskManager.addTask(task8);
//        System.out.println("Список задач после добавления новых задач " + taskManager.getTasks());
//
//        taskManager.clearAllTAsks();
//
//        System.out.println("Список задач после удаления " + taskManager.getTasks());
//
//
//
//
//
    }
}
