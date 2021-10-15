package de.mibexx.fizzbuzz.service.transformer;

import de.mibexx.fizzbuzz.data.NumberDto;
import de.mibexx.fizzbuzz.port.api.TransformerPort;

public class FizzBuzzTransformer implements TransformerPort {
    @Override
    public void transform(NumberDto numberDto) {
        try {
            int number = Integer.parseInt(numberDto.getNumber());
            if (number % 3 == 0 && number % 5 == 0) {
                numberDto.setNumber("FizzBuzz");
            }
        } catch (NumberFormatException exception) {

        }
    }
}
