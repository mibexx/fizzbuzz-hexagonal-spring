package de.mibexx.fizzbuzz.service.service;

import de.mibexx.fizzbuzz.data.NumberDto;
import de.mibexx.fizzbuzz.port.api.TransformerPort;
import de.mibexx.fizzbuzz.service.transformer.FizzBuzzTransformer;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTransformerTest {
    @Test
    public void testTransformToBuzz() {
        TransformerPort transformer = new FizzBuzzTransformer();

        NumberDto numberDto = new NumberDto();

        numberDto.setNumber(String.valueOf(3));
        transformer.transform(numberDto);
        assertThat(numberDto.getNumber()).isEqualTo(String.valueOf(3));

        numberDto.setNumber(String.valueOf(5));
        transformer.transform(numberDto);
        assertThat(numberDto.getNumber()).isEqualTo(String.valueOf(5));

        numberDto.setNumber(String.valueOf(15));
        transformer.transform(numberDto);
        assertThat(numberDto.getNumber()).isEqualTo("FizzBuzz");

        numberDto.setNumber(String.valueOf(30));
        transformer.transform(numberDto);
        assertThat(numberDto.getNumber()).isEqualTo("FizzBuzz");
    }
}
