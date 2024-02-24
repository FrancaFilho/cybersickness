package br.com.measure.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

@Data
@RegisterForReflection
public class ReportingStyles {
    String report;
    String nonCybersicknessLabelling;
    String cybersicknessLabelling;
}
