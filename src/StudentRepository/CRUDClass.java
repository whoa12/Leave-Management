package StudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CRUDClass {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. INSERT");
            System.out.println("2. READ");
            System.out.println("3. UPDATE");
            System.out.println("4. DELETE");
            System.out.println("0. EXIT");
            System.out.print("Please enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Clear newline

            switch (choice) {
                case 1:
                    System.out.print("Student ID: ");
                    int studId = sc2.nextInt();
                    boolean studIdFound = false;
                    for(int i=0; i< students.size(); i++){
                        Student s = students.get(i);
                        if(s.getId() == studId){
                            studIdFound = true;
                            System.out.println("The given ID: " + studId + " already exists!");
                            break;
                        }


                    }
                    if(!studIdFound){
                        sc2.nextLine();
                    System.out.print("Student name: ");
                    String name = sc2.nextLine();
                    System.out.print("Student marks: ");
                    int marks = sc2.nextInt();
                    students.add(new Student(studId, name, marks));}
                    break;

                case 2:
                    boolean found = false;
                    System.out.print("Enter the ID of student: ");
                    int enteredID = sc2.nextInt();
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getId() == enteredID) {
                            found = true;
                            System.out.println("Student Details: " + students.get(i));
                        }
                    }
                    if (!found) {
                        System.out.println("Not found ID: " + enteredID);
                    }
                    break;

                case 3:
                    System.out.print("Enter the student ID to update information: ");
                    int enteredStudentIdUpdate = sc2.nextInt();
                    boolean found2 = false;

                    for (int i = 0; i < students.size(); i++) {
                        Student s = students.get(i);
                        if (s.getId() == enteredStudentIdUpdate) {
                            found2 = true;

                            int updateChoice;
                            do {
                                System.out.println("What would you like to update?");
                                System.out.println("1. Student ID");
                                System.out.println("2. Student name");
                                System.out.println("3. Student marks");
                                System.out.println("0. Exit");
                                updateChoice = sc.nextInt();
                                sc.nextLine();

                                switch (updateChoice) {
                                    case 1:
                                        System.out.print("Enter the updated Student ID: ");
                                        int updatedUserId = sc2.nextInt();
                                        s.setId(updatedUserId);
                                        break;
                                    case 2:
                                        sc2.nextLine();
                                        System.out.print("Enter the updated student name: ");
                                        String updatedStudentName = sc2.nextLine();
                                        s.setName(updatedStudentName);
                                        break;
                                    case 3:
                                        System.out.print("Enter the updated marks: ");
                                        int updatedMarks = sc2.nextInt();
                                        s.setMarks(updatedMarks);
                                        break;
                                }
                            } while (updateChoice != 0);
                        }
                    }

                    if (!found2) {
                        System.out.println("Not found ID: " + enteredStudentIdUpdate);
                    }
                    break;

                case 4:
                    System.out.print("Enter the student ID to delete: ");
                    int studentToBeDeletedId = sc2.nextInt();
                    boolean found3 = false;

                    for (int i = 0; i < students.size(); i++) {
                        Student s = students.get(i);
                        if (s.getId() == studentToBeDeletedId) {
                            students.remove(i);
                            found3 = true;
                            System.out.println("Student deleted successfully.");
                            break;
                        }
                    }

                    if (!found3) {
                        System.out.println("Not found ID: " + studentToBeDeletedId);
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Operation not available!");
            }

            System.out.println("Current Students: " + students);
        } while (choice != 0);
    }
}
