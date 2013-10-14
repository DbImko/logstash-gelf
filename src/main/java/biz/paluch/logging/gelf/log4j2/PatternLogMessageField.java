package biz.paluch.logging.gelf.log4j2;

import biz.paluch.logging.gelf.LogMessageField;
import org.apache.logging.log4j.core.layout.PatternLayout;

/**
 */
public class PatternLogMessageField extends LogMessageField {

    private PatternLayout patternLayout;

    public PatternLogMessageField(String name, NamedLogField namedLogField, PatternLayout patternLayout) {
        super(name, namedLogField);
        this.patternLayout = patternLayout;
    }

    public PatternLayout getPatternLayout() {
        return patternLayout;
    }
}
