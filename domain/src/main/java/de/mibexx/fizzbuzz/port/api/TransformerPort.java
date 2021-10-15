package de.mibexx.fizzbuzz.port.api;

import de.mibexx.fizzbuzz.data.NumberDto;

public interface TransformerPort {
    public void transform(NumberDto numberDto);
}
