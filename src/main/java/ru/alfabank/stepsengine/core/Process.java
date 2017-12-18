package ru.alfabank.stepsengine.core;

import ru.alfabank.stepsengine.api.*;
import java.util.*;

public class Process implements CanExecute {

    List<CanExecute> startHandlers =  new ArrayList<>();
    List<CanExecute> endHandlers =  new ArrayList<>();
    List<CanExecute> steps;
    Executor executor = null;

    Process(List<CanExecute> steps) {
        this.steps = steps;
    }

    public void addStartHandler(CanExecute handler){
        this.startHandlers.add(handler);
    }

    public void addEndHandler(CanExecute handler){
        this.endHandlers.add(handler);
    }

    public List<CanExecute> getSteps() {
        return this.steps;
    }

    public ExecutionResult execute() {
        if (executor == null) {
            throw new RuntimeException("No executor");
        }
        return executor.execute(this);
    }
}
