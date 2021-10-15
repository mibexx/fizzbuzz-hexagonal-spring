package de.mibexx.fizzbuzz.service;

import de.mibexx.fizzbuzz.data.NumberDto;
import de.mibexx.fizzbuzz.port.api.TransformServicePort;
import de.mibexx.fizzbuzz.port.api.TransformerPort;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TransformServiceTest {
    @Test
    public void testTransform() {
        List<TransformerPort> transformerPortList = new ArrayList<>();
        transformerPortList.add(new TransformerA());
        transformerPortList.add(new TransformerB());
        TransformServicePort transformService = new TransformServiceImpl(transformerPortList);

        List<NumberDto> numberDtoList = new ArrayList<>();
        numberDtoList.add(NumberDto.builder().number(String.valueOf(2)).build());
        numberDtoList.add(NumberDto.builder().number(String.valueOf(3)).build());
        numberDtoList.add(NumberDto.builder().number(String.valueOf(4)).build());
        numberDtoList.add(NumberDto.builder().number(String.valueOf(5)).build());
        numberDtoList.add(NumberDto.builder().number(String.valueOf(6)).build());

        transformService.transform(numberDtoList);

        assertThat(numberDtoList.get(0).getNumber()).isEqualTo(String.valueOf(2));
        assertThat(numberDtoList.get(1).getNumber()).isEqualTo("A");
        assertThat(numberDtoList.get(2).getNumber()).isEqualTo(String.valueOf(4));
        assertThat(numberDtoList.get(3).getNumber()).isEqualTo("B");
        assertThat(numberDtoList.get(4).getNumber()).isEqualTo(String.valueOf(6));
    }

    private class TransformerA implements TransformerPort {
        @Override
        public void transform(NumberDto numberDto) {
            if ((new String("3")).equals(numberDto.getNumber())) {
                numberDto.setNumber("A");
            }
        }
    }

    private class TransformerB implements TransformerPort {
        @Override
        public void transform(NumberDto numberDto) {
            if ((new String("5")).equals(numberDto.getNumber())) {
                numberDto.setNumber("B");
            }
        }
    }
}
