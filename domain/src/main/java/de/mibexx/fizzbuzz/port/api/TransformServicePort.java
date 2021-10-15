package de.mibexx.fizzbuzz.port.api;

import de.mibexx.fizzbuzz.data.NumberDto;

import java.util.List;

public interface TransformServicePort {
    public void transform(List<NumberDto> numberDtoList);
}
