package com.ipi.jva350.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SalarieAideADomicileTest {
    @Test
    public void testaLegalementDroitADesCongesPayesTrue(){

            // Given
            SalarieAideADomicile salariePlus10 = new SalarieAideADomicile();
            salariePlus10.setJoursTravaillesAnneeNMoins1(11);

            SalarieAideADomicile salarieMoins10 = new SalarieAideADomicile();
            salarieMoins10.setJoursTravaillesAnneeNMoins1(9);

            SalarieAideADomicile salarieExactement10 = new SalarieAideADomicile();
            salarieExactement10.setJoursTravaillesAnneeNMoins1(10);

            // Then
            assertTrue(salariePlus10.aLegalementDroitADesCongesPayes(), "Avec plus de 10 jours travaillés");
            assertFalse(salarieMoins10.aLegalementDroitADesCongesPayes(), "Avec moins de 10 jours travaillés");
            assertTrue(salarieExactement10.aLegalementDroitADesCongesPayes(), "Avec exactement 10 jours travaillés");
        }
    }

