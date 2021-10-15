package de.mibexx.fizzbuzz.port.api;

import de.mibexx.fizzbuzz.data.NumberDto;

import java.util.List;

public interface GeneratorPort {
    public List<NumberDto> generateNumbers(int start, int end);
}
