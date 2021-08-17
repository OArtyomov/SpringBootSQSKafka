package com.hcl.hclmessaging.utils;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;

@UtilityClass
@Slf4j
public class ConversionUtils {

    public static ByteBuffer toByteBuffer(BigDecimal bigDecimal){
        log.info("Data: {}", bigDecimal);
        return ByteBuffer.wrap(bigDecimal.unscaledValue().toByteArray());
    }

    public static BigDecimal toBigDecimal(ByteBuffer buffer){
        return new BigDecimal(new BigInteger(buffer.array()), 4);
    }

}
