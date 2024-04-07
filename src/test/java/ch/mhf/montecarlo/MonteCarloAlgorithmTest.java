package ch.mhf.montecarlo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonteCarloAlgorithmTest
{
    // test the calculated numbers(1000) against correct numbers with
    @Test
    void testPi5prozent()
    {
        // Arrange
        MonteCarloAlgorithm monteCarlosAlgorithmus = new MonteCarloAlgorithm();
        double calculatedPi = monteCarlosAlgorithmus.monteCarlo();
        double originPi = Math.PI;

        // Act
        double percentError = Math.abs(((originPi - calculatedPi) / originPi) * 100);
        System.out.println(String.format("percent Error of Pi is: %s", percentError));

        // Assert
        Assertions.assertFalse(percentError > 5);
    }
}