package de.mibexx.fizzbuzz;

import de.mibexx.fizzbuzz.data.NumberDto;
import de.mibexx.fizzbuzz.port.api.GeneratorPort;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class FizzBuzzTest {
    @Autowired
    private GeneratorPort generatorPort;

    @Test
    public void testFizzBuzz() {
        List<NumberDto> numberDtoList = generatorPort.generateNumbers(1, 35);

        assertThat(numberDtoList.get(0).getNumber()).isEqualTo(String.valueOf(1));
        assertThat(numberDtoList.get(3).getNumber()).isEqualTo(String.valueOf(4));
        assertThat(numberDtoList.get(2).getNumber()).isEqualTo("Fizz");
        assertThat(numberDtoList.get(4).getNumber()).isEqualTo("Buzz");
        assertThat(numberDtoList.get(8).getNumber()).isEqualTo("Fizz");
        assertThat(numberDtoList.get(9).getNumber()).isEqualTo("Buzz");
        assertThat(numberDtoList.get(14).getNumber()).isEqualTo("FizzBuzz");
        assertThat(numberDtoList.get(29).getNumber()).isEqualTo("FizzBuzz");
    }
}