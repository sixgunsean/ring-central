package com.ringcentral.definitions;


public class GlipUpdateTask {
    /**
     * Task name/subject. Max allowed length is 250 characters.
     */
    public String subject;
    /**
     *
     */
    public Object[] assignees;
    /**
     * Enum: Simple, AllAssignees, Percentage
     */
    public String completenessCondition;
    /**
     * Task start date in UTC time zone
     */
    public String startDate;
    /**
     * Task due date/time in UTC time zone
     */
    public String dueDate;
    /**
     * Enum: Black, Red, Orange, Yellow, Green, Blue, Purple, Magenta
     */
    public String color;
    /**
     * Task section to group/search by. Max allowed legth is 100 characters
     */
    public String section;
    /**
     * Task details. Max allowed legth is 102400 characters (100kB)
     */
    public String description;
    /**
     *
     */
    public GlipTaskRecurrenceInfo recurrence;
    /**
     *
     */
    public Object[] attachments;

    public GlipUpdateTask subject(String subject) {
        this.subject = subject;
        return this;
    }

    public GlipUpdateTask assignees(Object[] assignees) {
        this.assignees = assignees;
        return this;
    }

    public GlipUpdateTask completenessCondition(String completenessCondition) {
        this.completenessCondition = completenessCondition;
        return this;
    }

    public GlipUpdateTask startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public GlipUpdateTask dueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public GlipUpdateTask color(String color) {
        this.color = color;
        return this;
    }

    public GlipUpdateTask section(String section) {
        this.section = section;
        return this;
    }

    public GlipUpdateTask description(String description) {
        this.description = description;
        return this;
    }

    public GlipUpdateTask recurrence(GlipTaskRecurrenceInfo recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    public GlipUpdateTask attachments(Object[] attachments) {
        this.attachments = attachments;
        return this;
    }

}
