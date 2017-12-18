package ru.alfabank.stepsengine.enrichers.kafka;

public interface RequireAdditionalInput<T> {
    public void setAdditionalInput(T input);
}
