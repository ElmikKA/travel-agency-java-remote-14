package com.example.travelagency1.converter;

public interface Converter<E, D> {

    D fromEntityToDto(E entity);

    E fromDoToEntity(D dto);
}
