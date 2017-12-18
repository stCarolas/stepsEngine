package ru.alfabank.stepsengine.enrichers.resources;

import java.util.*;
import ru.alfabank.stepsengine.api.*;
import ru.alfabank.stepsengine.core.*;

public class EnricherWithResources implements CanEnrichProcess {

    public void enrich(ru.alfabank.stepsengine.core.Process process){
        Resources resourceDepot = new Resources();
        process.addStep(
            Stage.PROCESS_START, 
            new ResourceSearcher(process, resourceDepot)
        );
        process.addStep(
            Stage.STEP_START, 
            new ResourceInjector(process, resourceDepot)
        );
    }
        
}
