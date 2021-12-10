package fr.iut.tdfm331.td1.service;

import fr.iut.tdfm331.td1.model.Employee;
import fr.iut.tdfm331.td1.model.Meeting;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * API Service to access to all predefined lists : listEmployees and listMeetings
 */
public class ListApiService {

    private final List<Employee> listEmployees = ListEmployeesGenerator.generateListEmployee();

    private final ArrayList<Meeting> listMeetings = ListMeetingsGenerator.generateListMeetings();

    /**
     * Get the list of employees
     */
    public List<Employee> getListEmployees() {
        return this.listEmployees;
    }

    /**
     * Get the list of meetings
     */
    public List<Meeting> getListMeetings() {
        return this.listMeetings;
    }

    /**
     * Delete a meeting
     */
    public void removeMeeting(Meeting meeting) {
        listMeetings.remove(meeting);
    }

    /**
     * Add a meeting in the list
     */
    public void addMeeting(Meeting meeting) {
        listMeetings.add(meeting);
    }

    /**
     * Get a meeting by its object
     *
     * @throws MeetingNotFound if not meeting with this object exists
     */
    public Meeting findByObject(String objectMeeting) throws MeetingNotFound {
        Optional<Meeting> meeting = listMeetings.stream().filter(new Predicate<Meeting>() {
            @Override
            public boolean test(Meeting meeting) {
                return meeting.getObjectMeeting().equalsIgnoreCase(objectMeeting);
            }
        }).findFirst();

        if (meeting.isPresent()) {
            return meeting.get();
        } else {
            throw new MeetingNotFound();
        }
    }

    /**
     * Get an employee by name
     *
     * @throws EmployeeNotFound if no employee with that name exists
     */
    public Employee findByName(String name) throws EmployeeNotFound {
        Optional<Employee> employee = listEmployees.stream().filter(new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getName().equalsIgnoreCase(name);
            }
        }).findFirst();

        if (employee.isPresent()) {
            return employee.get();
        } else {
            throw new EmployeeNotFound();
        }
    }

}
