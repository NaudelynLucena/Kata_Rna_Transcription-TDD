package dev.nau.rna_transcription;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void testRnaTranscriptionOfCytosineIsGuanine() {
        assertThat(RnaTranscription.toRNA("C"), is(equalTo("G")));
    }

    @Test
    public void testRnaTranscriptionOfGuanineIsCytosine() {
        assertThat(RnaTranscription.toRNA("G"), is(equalTo("C")));
    }

    @Test
    public void testRnaTranscriptionOfThymineIsAdenine() {
        assertThat(RnaTranscription.toRNA("T"), is(equalTo("A")));
    }

    @Test
    public void testRnaTranscriptionOfAdenineIsUracil() {
        assertThat(RnaTranscription.toRNA("A"), is(equalTo("U")));
    }

}
