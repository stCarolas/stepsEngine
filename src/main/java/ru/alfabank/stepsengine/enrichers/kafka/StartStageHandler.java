package ru.alfabank.stepsengine.enrichers.kafka;

import java.util.*;
import ru.alfabank.stepsengine.api.*;
import ru.alfabank.stepsengine.core.*;
import java.util.stream.*;

public class StartStageHandler implements CanExecute {

    Stage stage;
    String currentStageName;
    String nextStageName;

    public StartStageHandler(
        Stage stage,
        String currentStageName, 
        String nextStageName
    ) {
        this.currentStageName = currentStageName;
        this.nextStageName = nextStageName;
    }

    public ExecutionResult execute() {
        ExecutionResult result = new ExecutionResult();
        return result;
    }
}
