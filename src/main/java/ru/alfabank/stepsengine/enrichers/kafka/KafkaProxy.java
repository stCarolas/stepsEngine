package ru.alfabank.stepsengine.enrichers.kafka;

import java.util.*;
import java.util.stream.*;

import ru.alfabank.stepsengine.api.*;
import ru.alfabank.stepsengine.core.*;

public interface KafkaProxy<T> {
    public void put(Message<T> message);
}
