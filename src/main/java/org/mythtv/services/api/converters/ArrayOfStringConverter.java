package org.mythtv.services.api.converters;

import com.fasterxml.jackson.databind.util.Converter;
import org.mythtv.services.api.ArrayOfString;

import java.util.List;

/**
 * @author Sebastien Astie
 */
public class ArrayOfStringConverter implements Converter<List<String>, ArrayOfString> {
    @Override
    public ArrayOfString convert(List<String> value) {
        ArrayOfString result;
        if(value != null && !value.isEmpty()){
            result = new ArrayOfString(value.toArray(new String[0]));
        } else {
            result = new ArrayOfString();
        }
        return result;
    }
}
