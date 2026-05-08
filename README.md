# Exercice 5 - Chapitre 6 : Programmation orientée objet en Java

## 🎯 Objectif
Implémenter la méthode `isValidMove` dans la classe `Reine` afin de vérifier la validité des déplacements de la reine sur un échiquier.

## 📝 Étapes à suivre

1. **Ouvrir la classe `Reine`**  
   Localisée dans `src/Reine.java`.

2. **Remplacer la méthode `isValidMove`**  
   La reine combine les déplacements de la tour (horizontal/vertical) et du fou (diagonal).  
   Un mouvement est valide si :
    - La ligne ou la colonne est identique (déplacement en ligne droite).
    - Ou si la différence entre les lignes est égale à la différence entre les colonnes (déplacement diagonal).

3. **Exemple d’implémentation :**

```java
@Override
public boolean isValidMove(int startX, int startY, int endX, int endY) {
    // Déplacement horizontal ou vertical
    if (startX == endX || startY == endY) {
        return true;
    }
    // Déplacement diagonal
    if (Math.abs(startX - endX) == Math.abs(startY - endY)) {
        return true;
    }
    // Sinon, mouvement invalide
    return false;
}
