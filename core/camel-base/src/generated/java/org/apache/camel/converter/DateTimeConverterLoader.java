/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.converter;

import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverterLoaderException;
import org.apache.camel.spi.TypeConverterLoader;
import org.apache.camel.spi.TypeConverterRegistry;
import org.apache.camel.support.SimpleTypeConverter;
import org.apache.camel.support.TypeConverterSupport;
import org.apache.camel.util.DoubleMap;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public final class DateTimeConverterLoader implements TypeConverterLoader {

    public DateTimeConverterLoader() {
    }

    @Override
    public void load(TypeConverterRegistry registry) throws TypeConverterLoaderException {
        registerConverters(registry);
    }

    private void registerConverters(TypeConverterRegistry registry) {
        addTypeConverter(registry, java.lang.Long.class, java.util.Date.class, false,
            (type, exchange, value) -> org.apache.camel.converter.DateTimeConverter.toLong((java.util.Date) value));
        addTypeConverter(registry, java.util.Date.class, java.lang.Long.class, false,
            (type, exchange, value) -> org.apache.camel.converter.DateTimeConverter.toDate((java.lang.Long) value));
        addTypeConverter(registry, java.util.TimeZone.class, java.lang.String.class, false,
            (type, exchange, value) -> org.apache.camel.converter.DateTimeConverter.toTimeZone((java.lang.String) value));
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) { 
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }

}