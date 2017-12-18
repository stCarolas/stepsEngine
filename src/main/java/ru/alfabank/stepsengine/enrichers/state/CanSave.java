package ru.alfabank.stepsengine.enrichers.state;

public interface CanSave<T> {
    void save(T data);
}
