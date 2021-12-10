package fr.iut.tdfm331.td1.model;

import java.util.List;

/**
 * Model object representing a Meeting
 */
public class Meeting {

    private final String objectMeeting;
    private final String meetingRoom;
    private final String date;
    private final String hourStart;
    private final String hourEnd;
    private final String information;
    private final List<Employee> listParticipants;

    /**
     * Constructor
     *
     * @param objectMeeting : String
     * @param meetingRoom   : String
     * @param date          : String
     * @param hourStart     : String
     * @param hourEnd       : String
     * @param information   : String
     * @param participants  : List<Employee>
     */
    public Meeting(String objectMeeting, String meetingRoom, String date,
                   String hourStart, String hourEnd, String information, List<Employee> participants) {
        this.objectMeeting = objectMeeting;
        this.meetingRoom = meetingRoom;
        this.date = date;
        this.hourStart = hourStart;
        this.hourEnd = hourEnd;
        this.information = information;
        this.listParticipants = participants;
    }

    // Getters
    public String getObjectMeeting() {
        return this.objectMeeting;
    }

    public String getMeetingRoom() {
        return this.meetingRoom;
    }

    public String getDate() {
        return this.date;
    }

    public String getHourStart() {
        return this.hourStart;
    }

    public String getHourEnd() {
        return this.hourEnd;
    }

    public List<Employee> getListParticipants() {
        return this.listParticipants;
    }

    public String getInformation() {
        return this.information;
    }

}
