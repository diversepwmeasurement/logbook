package org.zalando.logbook.json;

import lombok.AllArgsConstructor;

import java.util.function.BinaryOperator;

import static org.zalando.logbook.json.PrimitiveJsonPropertyBodyFilter.quote;

@AllArgsConstructor
final class QuotedStringReplacementOperator<T> implements BinaryOperator<String> {
    private final T replacement;

    @Override
    public String apply(String s, String s2) {
        return quote(replacement.toString());
    }
}
