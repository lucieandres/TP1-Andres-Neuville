package fr.iut.tdfm331.td1.service;

import fr.iut.tdfm331.td1.model.Employee;
import fr.iut.tdfm331.td1.model.Meeting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class generates a predefined list of @{@link Meeting}
 */
public abstract class ListMeetingsGenerator {

    // Predefined lists of Employee for different Meeting
    private static final List<Employee> LIST_EMPLOYEE_MEETING_1 = Arrays.asList(
            ListEmployeesGenerator.generateListEmployee().get(0),
            ListEmployeesGenerator.generateListEmployee().get(1),
            ListEmployeesGenerator.generateListEmployee().get(23)
    );

    private static final List<Employee> LIST_EMPLOYEE_MEETING_2 = Arrays.asList(
            ListEmployeesGenerator.generateListEmployee().get(0),
            ListEmployeesGenerator.generateListEmployee().get(2),
            ListEmployeesGenerator.generateListEmployee().get(10),
            ListEmployeesGenerator.generateListEmployee().get(12),
            ListEmployeesGenerator.generateListEmployee().get(17),
            ListEmployeesGenerator.generateListEmployee().get(21)
    );

    private static final List<Employee> LIST_EMPLOYEE_MEETING_3 = Arrays.asList(
            ListEmployeesGenerator.generateListEmployee().get(1),
            ListEmployeesGenerator.generateListEmployee().get(22)
    );

    private static final List<Employee> LIST_EMPLOYEE_MEETING_4 = Arrays.asList(
            ListEmployeesGenerator.generateListEmployee().get(13),
            ListEmployeesGenerator.generateListEmployee().get(15),
            ListEmployeesGenerator.generateListEmployee().get(19),
            ListEmployeesGenerator.generateListEmployee().get(21)
    );

    private static final List<Employee> LIST_EMPLOYEE_MEETING_5 = Arrays.asList(
            ListEmployeesGenerator.generateListEmployee().get(10),
            ListEmployeesGenerator.generateListEmployee().get(12),
            ListEmployeesGenerator.generateListEmployee().get(9)

    );

    private static final List<Employee> LIST_EMPLOYEE_MEETING_6 = Arrays.asList(
            ListEmployeesGenerator.generateListEmployee().get(4),
            ListEmployeesGenerator.generateListEmployee().get(5)
    );

    public static ArrayList<Meeting> LIST_MEETINGS = new ArrayList<>(
            Arrays.asList(
                    new Meeting("Kick-off meeting", "Faraday", "08/10/2020",
                            "10:00", "11:00", "Lancement du projet", LIST_EMPLOYEE_MEETING_1),
                    new Meeting("Code review", "Maxwell", "15/08/2020",
                            "11:00", "12:00", "Revue mise à jour 1.2", LIST_EMPLOYEE_MEETING_2),
                    new Meeting("Point hebdo", "Planck", "20/08/2020",
                            "11:00", "12:00", "Avancement de la semaine", LIST_EMPLOYEE_MEETING_3),
                    new Meeting("Entretien annuel", "Einstein", "27/10/2020",
                            "8:00", "20:00", "Point individuel", LIST_EMPLOYEE_MEETING_4),
                    new Meeting("Point hebdo", "Einstein", "27/10/2020",
                            "20:00", "22:00", "Point d'avancement", LIST_EMPLOYEE_MEETING_5),
                    new Meeting("Point hebdo", "Feynman", "28/10/2020",
                            "21:00", "21:30", "Point d'avancement", LIST_EMPLOYEE_MEETING_6),
                    new Meeting("Point hebdo", "Planck", "29/10/2020",
                            "11:00", "12:00", "Avancement de la semaine", LIST_EMPLOYEE_MEETING_3),
                    new Meeting("Revue spec", "Planck", "30/11/2020",
                            "9:00", "10:00", "", LIST_EMPLOYEE_MEETING_4),
                    new Meeting("Validation essais", "Planck", "02/12/2020",
                            "10:00", "11:00", "", LIST_EMPLOYEE_MEETING_1)
            )
    );

    public static ArrayList<Meeting> generateListMeetings() {

        return LIST_MEETINGS;
    }
}
