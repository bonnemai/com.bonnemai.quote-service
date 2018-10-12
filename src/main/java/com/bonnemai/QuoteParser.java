package com.bonnemai;

import com.bonnemai.model.Vanilla;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuoteParser {
    List<Vanilla> parseQuote(long id, String quote);
}
