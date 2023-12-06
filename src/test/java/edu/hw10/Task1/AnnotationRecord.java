package edu.hw10.Task1;

import edu.hw10.Annotations.Max;
import edu.hw10.Annotations.Min;
import edu.hw10.Annotations.NotNull;

public record AnnotationRecord(@Max(6) @Min(-5) int a, @NotNull String b) {
}
