package com.bonnemai;

import com.bonnemai.model.Vanilla;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;


@Service
public class QuoteParserImpl implements QuoteParser {
    private static Logger logger = LoggerFactory.getLogger(QuoteParserImpl.class);

    @Override
    public List<Vanilla> parseQuote(long id, String quote) {
        logger.info("Now parsing {}: {}", id, quote);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);
        return Arrays.asList(new Vanilla(id, "HSI", 100d, "Percent", calendar.getTime(), 25_000d));
    }
}
