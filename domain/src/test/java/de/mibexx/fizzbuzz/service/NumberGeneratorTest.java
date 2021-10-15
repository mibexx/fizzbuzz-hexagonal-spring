package de.mibexx.fizzbuzz.service;

import static org.assertj.core.api.Assertions.assertThat;

import de.mibexx.fizzbuzz.data.NumberDto;
import de.mibexx.fizzbuzz.port.api.GeneratorPort;
import de.mibexx.fizzbuzz.port.api.TransformServicePort;
import de.mibexx.fizzbuzz.port.api.TransformerPort;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

public class NumberGeneratorTest {
    @Test
    public void testGenerateNumbers() {
        TransformServicePort transformService = new TransformServiceImpl(new ArrayList<TransformerPort>());

        GeneratorPort generator = new NumberGeneratorImpl(transformService);
        List<NumberDto> numbers = generator.generateNumbers(5, 9);
        assertThat(numbers.size()).isEqualTo(4);

        int k = 0;
        for (int i = 5; i < 9; i++) {
            assertThat(numbers.get(k).getNumber()).isEqualTo(String.valueOf(i));
            k++;
        }
    }

}
