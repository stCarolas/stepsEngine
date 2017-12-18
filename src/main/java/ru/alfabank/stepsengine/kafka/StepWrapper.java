package ru.alfabank.stepsengine.kafka;

import java.util.*;
import java.util.stream.*;

import ru.alfabank.stepsengine.api.*;
import ru.alfabank.stepsengine.core.*;

public class StepWrapper {
    CanExecute step;
    String nextStepName;
    String stepName;

    public StepWrapper(
        CanExecute step,
        String stepName,
        String nextStepName
    ) {
        this.step = step;
        this.stepName = stepName;
        this.nextStepName = nextStepName;
    }

}
