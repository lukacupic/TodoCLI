package com.selfxdsd.todocli;

public class Todo {

    /**
     * The first line of the Todo.
     */
    private int start;

    /**
     * The last line of the Todo.
     */
    private int end;

    /**
     * The Todo's body.
     */
    private String body;

    /**
     * The ID of the ticket denoted by this Todo.
     */
    private String ticketID;

    /**
     * The estimated time (in minutes) to complete this Todo.
     */
    private int estimatedTime;

    /**
     * The path of the file from which this Todo was extracted.
     */
    private String path;

    /**
     * Creates a new Todo object.
     *
     * @param start         the starting line
     * @param end           the ending line
     * @param ticketID      the ticket ID
     * @param estimatedTime the estimated time
     */
    public Todo(int start, int end, String ticketID, int estimatedTime) {
        this.start = start;
        this.end = end;
        this.ticketID = ticketID;
        this.estimatedTime = estimatedTime;
    }

    /**
     * Creates a new Todo object.
     *
     * @param start the starting line
     * @param end   the ending line
     * @param body  the body
     */
    public Todo(int start, int end, String body) {
        this.start = start;
        this.end = end;
        this.body = body;
    }

    /**
     * Gets the starting line.
     *
     * @return the starting line
     */
    public int getStart() {
        return start;
    }

    /**
     * Gets the ending line.
     *
     * @return the ending line
     */
    public int getEnd() {
        return end;
    }

    /**
     * Gets the body.
     *
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * Gets the ticket ID.
     *
     * @return the ticket ID
     */
    public String getTicketID() {
        return ticketID;
    }

    /**
     * Gets the estimated time.
     *
     * @return the estimated time
     */
    public int getEstimatedTime() {
        return estimatedTime;
    }

    /**
     * Gets the path of the file from which this Todo was extracted.
     *
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the ticket ID.
     *
     * @param ticketID the ticket ID
     */
    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    /**
     * Sets the estimated time.
     *
     * @param estimatedTime the estimated time
     */
    public void setEstimatedTime(int estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    /**
     * Sets the path.
     *
     * @param path the path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Compares this to the given, other, Todo object. The method returns true if and only
     * if the following conditions are satisfied: The objects have the same starting and ending
     * line numbers; the objects have the same estimated time; the objects have the same ticket ID.
     *
     * @param o the object to compare this one to
     * @return true if the objects are equal; false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Todo todo = (Todo) o;

        if (start != todo.start) return false;
        if (end != todo.end) return false;
        if (estimatedTime != todo.estimatedTime) return false;
        if (!ticketID.equals(todo.ticketID)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = start;
        result = 31 * result + end;
        result = 31 * result + estimatedTime;
        result = 31 * result + ticketID.hashCode();
        return result;
    }

    @Override
    public String toString() {
        String linesPart = start == end ? "Line: " + start : String.format("Lines: %d-%d", start, end);

        return String.format("TODO [%s, TicketID: %s, Estimated Time: %s, Body: '%s', Path: '%s']",
                linesPart, ticketID, estimatedTime, body, path);
    }
}