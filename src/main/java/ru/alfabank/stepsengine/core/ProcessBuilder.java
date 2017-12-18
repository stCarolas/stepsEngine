package ru.alfabank.stepsengine.core;

import ru.alfabank.stepsengine.api.*;
import java.util.*;

public class ProcessBuilder {

    List<CanEnrichProcess> enrichers = new ArrayList<>();
    List<CanExecute> steps           = new ArrayList<>();
    Executor executor                = null;

    public static ProcessBuilder process() {
        return defaultBuilder();
    }

    public ProcessBuilder step(CanExecute step){
        this.steps.add(step);
        return this;
    }

    public ProcessBuilder enricher(CanEnrichProcess enricher) {
        enrichers.add(enricher);
        return this;
    }

    public ProcessBuilder executor(Executor executor) {
        this.executor = executor;
        return this;
    }

    protected static ProcessBuilder defaultBuilder() {
        ProcessBuilder defaultBuilder = new ProcessBuilder();
        return defaultBuilder;
    }

    private ProcessBuilder(){}

}
