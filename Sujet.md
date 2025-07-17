# Poker

Le but de l'exercice est de créer la base d'un jeu de Poker en Java.

## Consignes

- L'exercice est individuel. Toute tentative de triche sera sanctionnée d'une exclusion de la salle d'examen sans possibilité d'effectuer un rendu, bavardage inclus.

- Est considéré comme triche (sans s'y limiter) toute génération par IA. Le correcteur se réserve le droit de faire une génération "test" afin de la comparer à vos rendus. En cas de similarités manifeste, votre rendu et la génération du correcteur seront transmis à la direction pédagogique de l'établissement.

- Les collations sont autorisées.

- Toute sortie est définitive. Les rendus ne sont pas acceptés après votre sortie.

- Les IDE autorisés sont Visual Studio Code, VS Codium et IntelliJ IDEA. Les plugins d'IA ne sont pas acceptés, et doivent être **désinstallés** le temps de l'examen. Tout autre IDE est proscrit et sera sanctionné.

- Aucun retard ne sera admis. Si vous êtes en retard, vous serez noté sur la moitié des points.

- Les appareils autres que celui qui vous permet de répondre au sujet sont interdits. Un tour de salle sera effectué avant le démarrage de l'épreuve.

- Tout retard dû à la mise en place sera imputé au chronomètre. Il vous est donc demandé de suivre les instructions le plus rapidement possible, dans le calme et sans discussion.

- Tous les éléments dont vous avez besoin pour répondre au sujet sont mis à disposition. Il est fortement recommandé de couper le wifi une fois que vous avez téléchargé le sujet et les dépendances de build (`./mvnw clean install`). En cas de besoin, vous pouvez consulter le support de cours à l'adresse suivante : https://crazy-crafters.gitlab.io/red-maple/

- L'exercice dure 3 (trois) heures à partir du lancement du chronomètre par l'examinateur. Les aménagements seront effectués sur la grille de notation.

## Grille de notation

L'exercice est noté sur 25 points répartis comme suit :

- 5 points pour la théorie
- 10 points pour la conception
- 10 points pour la pratique (dont 2 points pour un projet compilable)

Il est possible de demander un code permettant d'extraire un sujet ayant une conception partielle. Dans ce cas, les points associés à la conception seront décomptés de votre rendu.

## Rendu

Le rendu s'effectue sous forme de projet git archivé au format zip pour la partie pratique.

Pour la partie théorique, merci de supprimer les sujets qui ne sont pas les votres pour le rendu et d'inclure vos réponses dans l'archive.

Des points supplémentaires peuvent être attribués si les consignes suivantes sont respectées :

- Des commits sont présents pour chaque test (unitaire et/ou métier) réussi (1 point)
- La couverture de code globale atteint au moins 80% (1 point)
- L'application est fournie sous forme de JAR (1 point)

## Tests métier

- Je peux créer une main de cartes à partir d'une chaîne de caractère
    - Les caractères pour représenter les cartes sont : "♠♥♣♦" et "2 3 4 5 6 7 8 9 10 J Q K A"
- Je peux tirer une main aléatoire depuis un jeu de 52 cartes
    - La classe Java ***Random*** (package `java.util`) peut être utilisée
- Je peux identifier si j'ai une combinaison dans la main que j'ai tiré
    - Les combinaisons sont représentées par des objets distincts dans une chaîne d'héritage
    - Les combinaisons héritent toutes de la classe abstraite ***Hand***
- Je peux comparer ma main à une autre pour savoir si elle est gagnante
    - L'interface ***Comparable*** de Java peut-être utilisée
    - Les As sont les cartes ayant le plus de valeur, quelle que soit la main
    - Il n'y a **PAS** de Joker dans le jeu
- Mon programme est capable de jouer 5 tours avec deux joueurs en affichant dans la console les combinaisons parmi les cartes tirées ainsi que le gagnant du tour


## Ressources

Vous pouvez consulter la liste des mains dans le document PDF fourni.