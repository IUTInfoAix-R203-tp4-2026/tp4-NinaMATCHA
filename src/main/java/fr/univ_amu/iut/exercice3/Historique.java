package fr.univ_amu.iut.exercice3;

import java.util.ArrayList;
import java.util.List;

public class Historique {
  private static final int TAILLE_MAX = 10;
  private final List<String> historique = new ArrayList<>();

  /// Retourne l'historique formaté (plus récent en bas, une entrée par ligne).
  public String afficherHistorique() {
    StringBuilder sb = new StringBuilder();
    sb.append("--- Historique ---\n");
    for (String h : historique) {
      sb.append("- ").append(h).append("\n");
    }
    return sb.toString();
  }

  void enregistrer(String choix) {
    historique.add(choix);
    if (historique.size() > TAILLE_MAX) {
      historique.remove(0);
    }
  }

  public List<String> asList() {
    return historique;
  }
}
