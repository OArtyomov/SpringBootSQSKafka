package com.hcl.hclmessaging.utils;

import lombok.experimental.UtilityClass;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;

@UtilityClass
public class ConversionUtils {

    public static ByteBuffer toByteBuffer(BigDecimal bigDecimal){
        return ByteBuffer.wrap(bigDecimal.unscaledValue().toByteArray());
    }

    public static BigDecimal toBigDecimal(ByteBuffer buffer){
        return new BigDecimal(new BigInteger(buffer.array()), 4);
    }

}
