package ru.alfabank.stepsengine.enrichers.kafka;

import java.util.*;
import ru.alfabank.stepsengine.api.*;
import ru.alfabank.stepsengine.core.*;
import ru.alfabank.stepsengine.kafka.*;
import java.util.stream.*;

public class EnricherWithKafkaTrigger<T> implements CanEnrichProcess {

    KafkaProxy kafka;
    Message<T> message;

    public EnricherWithKafkaTrigger(
            KafkaProxy kafka,
            Message<T> message
    ) {
        this.kafka = kafka;
        this.message  = message;
    }

    public void enrich(ru.alfabank.stepsengine.core.Process process) {
        //List<Stage> stages = process.getStages();
        //for (int i = 0, j = 1; 
             //j < stages.size(); 
             //j++, i++
        //) {
            //Stage current = stages.get(i);
            //Stage next = stages.get(j);

            //current.addStageStartHandler(
                //new StartStageHandler(
                    //current,
                    //formName(current),
                    //formName(next)
                //)
            //);
        //}
    }

    private String formName(CanExecute step) {
        if (step instanceof HasName) {
            return ((HasName) step).getName();
        }
        return formAutomaticName(step);
    }

    private String formAutomaticName(CanExecute step) {
        return step.getClass().getName();
    }
}
