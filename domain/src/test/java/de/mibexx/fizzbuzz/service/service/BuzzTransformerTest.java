package de.mibexx.fizzbuzz.service.service;

import de.mibexx.fizzbuzz.data.NumberDto;
import de.mibexx.fizzbuzz.port.api.TransformerPort;
import de.mibexx.fizzbuzz.service.transformer.BuzzTransformer;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BuzzTransformerTest {
    @Test
    public void testTransformToBuzz() {
        TransformerPort transformer = new BuzzTransformer();

        NumberDto numberDto = new NumberDto();

        numberDto.setNumber(String.valueOf(3));
        transformer.transform(numberDto);
        assertThat(numberDto.getNumber()).isEqualTo(String.valueOf(3));

        numberDto.setNumber(String.valueOf(5));
        transformer.transform(numberDto);
        assertThat(numberDto.getNumber()).isEqualTo("Buzz");

        numberDto.setNumber(String.valueOf(15));
        transformer.transform(numberDto);
        assertThat(numberDto.getNumber()).isEqualTo("Buzz");
    }
}
