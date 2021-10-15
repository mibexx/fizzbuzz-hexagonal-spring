package de.mibexx.fizzbuzz.service;

import de.mibexx.fizzbuzz.data.NumberDto;
import de.mibexx.fizzbuzz.port.api.GeneratorPort;
import de.mibexx.fizzbuzz.port.api.TransformServicePort;

import java.util.ArrayList;
import java.util.List;

public class NumberGeneratorImpl implements GeneratorPort {
    private TransformServicePort transformServicePort;

    public NumberGeneratorImpl(TransformServicePort transformServicePort) {
        this.transformServicePort = transformServicePort;
    }

    @Override
    public List<NumberDto> generateNumbers(int start, int end) {
        List<NumberDto> numbers = new ArrayList<>();
        for (int n = start; n < end; n++) {
            numbers.add(
                    NumberDto
                            .builder()
                            .number(String.valueOf(n))
                            .build()
            );
        }

        transformServicePort.transform(numbers);

        return numbers;
    }
}
