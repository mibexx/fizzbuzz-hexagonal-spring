package de.mibexx.fizzbuzz.service.service;

import de.mibexx.fizzbuzz.data.NumberDto;
import de.mibexx.fizzbuzz.port.api.TransformerPort;
import de.mibexx.fizzbuzz.service.transformer.FizzTransformer;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzTransformerTest {
    @Test
    public void testTransformToFizz() {
        TransformerPort transformer = new FizzTransformer();

        NumberDto numberDto = new NumberDto();

        numberDto.setNumber(String.valueOf(2));
        transformer.transform(numberDto);
        assertThat(numberDto.getNumber()).isEqualTo(String.valueOf(2));

        numberDto.setNumber(String.valueOf(3));
        transformer.transform(numberDto);
        assertThat(numberDto.getNumber()).isEqualTo("Fizz");

        numberDto.setNumber(String.valueOf(9));
        transformer.transform(numberDto);
        assertThat(numberDto.getNumber()).isEqualTo("Fizz");
    }
}
