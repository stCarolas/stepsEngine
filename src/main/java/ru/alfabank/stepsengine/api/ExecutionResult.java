package ru.alfabank.stepsengine.api;
import java.util.*;

public class ExecutionResult {
    Status status = Status.NOT_STARTED;
    List<ExecutionResult> childrenResults = new ArrayList<>();

    public void addChildResult(ExecutionResult result) {
        childrenResults.add(result);
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public static enum Status {
        NOT_STARTED,
        STARTED,
        FAILED,
        PASSED
    }
}
