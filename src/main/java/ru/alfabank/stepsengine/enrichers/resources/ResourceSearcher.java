package ru.alfabank.stepsengine.enrichers.resources;

import java.util.*;
import ru.alfabank.stepsengine.api.*;
import ru.alfabank.stepsengine.core.*;

public class ResourceSearcher implements CanExecute {

    ru.alfabank.stepsengine.core.Process process;
    Resources depot;

    public ResourceSearcher(
            ru.alfabank.stepsengine.core.Process process,
            Resources depot
    ) {
        this.process = process;
        this.depot = depot;
    }

    public ExecutionResult execute() { }

}
