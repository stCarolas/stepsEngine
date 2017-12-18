package ru.alfabank.stepsengine.kafka;

import java.util.*;
import java.util.stream.*;

import ru.alfabank.stepsengine.api.*;
import ru.alfabank.stepsengine.core.*;

public class KafkaExecutor implements Executor {

    HashMap<String, CanExecute> handlers = new HashMap<>();

    public ExecutionResult execute(ru.alfabank.stepsengine.core.Process process) {
        List<CanExecute> steps = process.getSteps();
        for (int i = 0, j = 1; 
             j < steps.size(); 
             j++, i++
        ) {
            CanExecute current = steps.get(i);
            CanExecute next = steps.get(j);
            String stepName = formName(process, current);
            StepWrapper wrapper =  new StepWrapper(
                    current, 
                    stepName,
                    formName(process, next)
            );
            handlers.put(
                    stepName,
                    current
            );
        }
        return null;
    }

    private String formName(
        ru.alfabank.stepsengine.core.Process process, 
        CanExecute step
    ) {
        String prefix = "";
        if (process instanceof HasName) {
            prefix = ((HasName) process).getName();
        }
        if (step instanceof HasName) {
            return prefix + ((HasName) step).getName();
        }
        return prefix + formAutomaticName(step);
    }

    private String formAutomaticName(CanExecute step) {
        return step.getClass().getName();
    }

}
