package com.bonnemai;

import com.bonnemai.model.Vanilla;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class QuoteController {

//    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // TODO: Add Autowired
    @Autowired
    private QuoteParser quoteParserImpl;

    @RequestMapping("/quote")
    public List<Vanilla> parseQuote(@RequestParam(value="quote", defaultValue="HSI EC 1Y 100%") String quote) {
        return quoteParserImpl.parseQuote(counter.incrementAndGet(), quote);
    }
}
