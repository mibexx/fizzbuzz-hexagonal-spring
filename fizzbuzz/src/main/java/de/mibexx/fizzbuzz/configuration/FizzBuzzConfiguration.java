package de.mibexx.fizzbuzz.configuration;

import de.mibexx.fizzbuzz.port.api.GeneratorPort;
import de.mibexx.fizzbuzz.port.api.TransformServicePort;
import de.mibexx.fizzbuzz.port.api.TransformerPort;
import de.mibexx.fizzbuzz.service.NumberGeneratorImpl;
import de.mibexx.fizzbuzz.service.TransformServiceImpl;
import de.mibexx.fizzbuzz.service.transformer.BuzzTransformer;
import de.mibexx.fizzbuzz.service.transformer.FizzBuzzTransformer;
import de.mibexx.fizzbuzz.service.transformer.FizzTransformer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class FizzBuzzConfiguration {
    @Bean
    public GeneratorPort generator() {
        return new NumberGeneratorImpl(transformerService());
    }

    @Bean
    public TransformServicePort transformerService() {
        return new TransformServiceImpl(transformerPorts());
    }

    @Bean
    public List<TransformerPort> transformerPorts() {
        List<TransformerPort> transformerPortList = new ArrayList<>();

        transformerPortList.add(new FizzBuzzTransformer());
        transformerPortList.add(new FizzTransformer());
        transformerPortList.add(new BuzzTransformer());

        return transformerPortList;
    }
}
