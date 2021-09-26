package com.demo.model;

import java.util.Date;

public class Task {
    private String id;
    private String command;
    private TaskStatus status;
    private Date creationTime;
    private Date updateTime;

    /**
     * @return {@link #id}
     */
    public String getId() {
        return id;
    }

    /**
     * @param id {@link #id}
     * @return <source>this</source>
     */
    public Task setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * @return {@link #command}
     */
    public String getCommand() {
        return command;
    }

    /**
     * @param command {@link #command}
     * @return <source>this</source>
     */
    public Task setCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * @return {@link #status}
     */
    public TaskStatus getStatus() {
        return status;
    }

    /**
     * @param status {@link #status}
     * @return <source>this</source>
     */
    public Task setStatus(TaskStatus status) {
        this.status = status;
        return this;
    }

    /**
     * @return {@link #creationTime}
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * @param creationTime {@link #creationTime}
     * @return <source>this</source>
     */
    public Task setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * @return {@link #updateTime}
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime {@link #updateTime}
     * @return <source>this</source>
     */
    public Task setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }
}
