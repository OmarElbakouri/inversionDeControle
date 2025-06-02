# 💡 Injection des dépendances en Java – Exercice de cours

Ce projet Java illustre différentes techniques d'injection de dépendances à travers un exemple simple basé sur les vidéos pédagogiques fournies en cours.

## 🧱 Architecture générale

Le projet est composé de trois couches :
- **IDao** / **DaoImpl**, **DaoImplV2** : simule la couche d'accès aux données
- **IMetier** / **MetierImpl** : contient la logique métier
- **Pres1** / **Pres2** : classes de présentation, responsables de l'exécution

Les interfaces permettent d'implémenter le **couplage faible**, et plusieurs techniques d'injection sont testées.

---

## 🎯 Objectif

Mettre en œuvre **trois méthodes** d'injection des dépendances entre les classes :
1. ✅ Par instanciation statique (code figé)
2. ✅ Par instanciation dynamique (fichier `config.txt` + `Class.forName(...)`)
3. 🔜 Avec le framework Spring (XML & annotations)

---

## 📂 Structure du projet

