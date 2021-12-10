package fr.iut.tdfm331.td1.model;

/**
 * This class extends the class @{@link Employee}, add an additional "selected" boolean parameter.
 * Its usage is for the ListEmployeesFragment class only, in which it enables the adapter
 * to determine which associated CheckBox is clicked and which is not.
 */
public class SelectedEmployee extends Employee {

    /**
     * "selected" status of the Employee
     */
    private boolean selected;

    /**
     * Constructor
     *
     * @param employee : Employee
     */
    public SelectedEmployee(Employee employee) {

        super(employee.getName(), employee.getEmail(), employee.getId());
        selected = false;
    }

    public boolean getSelected() {

        return this.selected;
    }

    public void setSelected(boolean selected) {

        this.selected = selected;
    }
}
