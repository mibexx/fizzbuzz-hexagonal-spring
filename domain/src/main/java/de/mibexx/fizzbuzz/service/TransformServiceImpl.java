package de.mibexx.fizzbuzz.service;

import de.mibexx.fizzbuzz.data.NumberDto;
import de.mibexx.fizzbuzz.port.api.TransformServicePort;
import de.mibexx.fizzbuzz.port.api.TransformerPort;

import java.util.List;

public class TransformServiceImpl implements TransformServicePort {
    private List<TransformerPort> transformerPortList;

    public TransformServiceImpl(List<TransformerPort> transformerPortList) {
        this.transformerPortList = transformerPortList;
    }

    @Override
    public void transform(List<NumberDto> numberDtoList) {
        numberDtoList.forEach((numberDto -> {
            transformerPortList.forEach((transformerPort -> {
                transformerPort.transform(numberDto);
            }));
        }));
    }
}
