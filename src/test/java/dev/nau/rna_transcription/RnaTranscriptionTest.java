package dev.nau.rna_transcription;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RnaTranscriptionTest {

    @BeforeEach
    public void setUp() {
        new RnaTranscription();
    }

    @Test
    public void testEmptyRnaSequence() {
        assertThat(RnaTranscription.toRNA("").isEmpty(), is(true));
    }
}
