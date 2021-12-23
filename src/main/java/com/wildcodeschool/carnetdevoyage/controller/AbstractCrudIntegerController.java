package com.wildcodeschool.carnetdevoyage.controller;

public abstract class AbstractCrudIntegerController<E>
        extends com.wildcodeschool.carnetdevoyage.controller.AbstractCrudController<E, Integer> {
    @Override
    protected Integer parseId(String id) { return Integer.parseInt(id); }
}