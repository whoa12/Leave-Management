import javax.swing.*;
import java.awt.*;

public class ToDoApp extends JFrame {
    private DefaultListModel<String> taskListModel;
    private JList<String> taskList;
    private JTextField taskField;

    public ToDoApp() {
        setTitle("To-Do Application");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);
        taskList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(taskList);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());

        taskField = new JTextField();
        JButton addButton = new JButton("Add Task");
        addButton.addActionListener(e -> addTask());

        inputPanel.add(taskField, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.EAST);

        JPanel buttonPanel = new JPanel();
        JButton deleteButton = new JButton("Delete Task");
        deleteButton.addActionListener(e -> deleteTask());

        JButton completeButton = new JButton("Mark as Done");
        completeButton.addActionListener(e -> markAsDone());

        buttonPanel.add(deleteButton);
        buttonPanel.add(completeButton);

        add(scrollPane, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addTask() {
        String task = taskField.getText().trim();
        if (!task.isEmpty()) {
            taskListModel.addElement(task);
            taskField.setText("");
        }
    }

    private void deleteTask() {
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex != -1) {
            taskListModel.remove(selectedIndex);
        }
    }

    private void markAsDone() {
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex != -1) {
            String task = taskListModel.get(selectedIndex);
            if (!task.startsWith("[Done] ")) {
                taskListModel.set(selectedIndex, "[Done] " + task);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ToDoApp app = new ToDoApp();
            app.setVisible(true);
        });
    }
}
