package fr.soat.cleancoders.services;

import fr.soat.cleancoders.domain.Entreprise;
import org.springframework.stereotype.Service;

@Service
public class CalculateurImpotService {

    public CalculateurImpotService() {
    }

    public Double calculerImpot(Entreprise entreprise, Double chiffreAffaire) {
        if (chiffreAffaire == null || chiffreAffaire.doubleValue() < 0) {
            throw new IllegalArgumentException(String.format("Chiffre d'affaire incorrect %s", chiffreAffaire));
        }
        return entreprise.tauxImposition() * chiffreAffaire;
    }
}
