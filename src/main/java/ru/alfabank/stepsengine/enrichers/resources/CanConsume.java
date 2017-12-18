package ru.alfabank.stepsengine.enrichers.resources;

public interface CanConsume<T> {
   void consume(T data);
}
