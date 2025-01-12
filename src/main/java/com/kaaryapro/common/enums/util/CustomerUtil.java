package com.kaaryapro.common.enums.util;

import com.kaaryapro.common.enums.log.LogEnum;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Slf4j
@Component
@AllArgsConstructor
public class CustomerUtil {

  /* Utility classes should not have public constructors
  To prevent the class from being instantiated, you should define a non-public constructor.
  This will prevent the compiler from implicitly generating a public parameterless constructor. */
  /*  private CustomerUtil() {
    throw new IllegalStateException("CustomerUtil class");
  }*/

    public static String generateCorrelationId() {
        return UUID.randomUUID().toString();
    }
}

