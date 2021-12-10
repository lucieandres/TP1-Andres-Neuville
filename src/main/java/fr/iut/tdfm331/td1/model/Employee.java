package fr.iut.tdfm331.td1.model;

/**
 * Model object representing an Employee
 */
public class Employee {

    private final String name;
    private final String email;
    private final int id;

    /**
     * Constructor
     *
     * @param name  : String
     * @param email : String
     * @param id    : int
     */
    public Employee(String name, String email, int id) {

        this.name = name;
        this.email = email;
        this.id = id;
    }

    // Getters
    public String getName() {

        return this.name;
    }

    public String getEmail() {

        return this.email;
    }

    public int getId() {

        return this.id;
    }
}
