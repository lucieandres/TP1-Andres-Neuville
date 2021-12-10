# AIDE
Dans cette section vous retrouverez des astuces qui vous permettront de prendre en main le projet et de résoudre certains problèmes courants . 

## Où retrouver les fichiers de tests ? 

Dans ce projet, les fichiers tests se trouvent dans ```src/test/java/[package]```.

> Dans les bonnes pratiques de programmation (Orienté Objet ou fonctionnel), il est recommandé de placer les fichiers tests dans un repertoire dédié. Généralement, 
les fichiers tests sont placés dans un dossier test au même niveau que le repertoire contenant les fichiers de l'application. 
 
 ## Comment lancer les tests ? 
 Il existe plusieurs manières de lancer les tests, en voici deux : 
 - Pour lancer tous les tests d'une classe, cliquer sur le bouton (play) tout à gauche du nom de la classe de tests puis choisir Run [Nom de la classe]
 - Pour lancer les tests sur une méthode en particuler, cliquer sur le bouton (vert) juste à gauche du nom de la méthode puis choisir Run[Nom de la classe].[Nom de la fonction]

## J'ai rencontré une erreur "No tests found for given includes", comment la corriger ? 
Pour corriger cette erreur, vous devez modifier les paramètres de build du projet. Pour cela: 
- Cliquer sur ```File > Setting (Ctrl+Alt+S)```
- Dans la fenêtre qui s'affiche cliquer sur ```Build, Execution, Deployment > Build Tools > gradle```
- Finalement, selectionner ```Run Tests using: Intellij IDEA```

## Comment déterminer la couverture des tests ? 
Pour déterminer la couverture des tests, cliquer sur le bouton (vert à gauche du nom de la classe), puis choisir Run [Nom de la classe] with Coverage. 

## Comment identifier les codes couverts/non couverts par les tests ? 
Dans l'onglet coverage, cliquer sur le nom de package contenant les sources de la classe qu'on veut analyser, puis cliquer sur la classe. Les méthodes de la classe 
seront annotées en vert ou rouge. Les lignes en vert sont converts par les tests sinon elles sont en rouge. 

## Comment interpréter la couverture des tests ? 
> On dit qu'une instruction est couverte par les tests unitaires si elle est exécutée dans une méthode de test. 
Pour mieux comprendre le concept, prenons l'exemple de code suivant :
```Java
public class CoffeMaker {
  boolean isMakingCoffee = true; 
  public void makeACoffee() {
     if(isMakingCoffee) {
        System.out.println("Already making a coffee");
     } else {
       isMakingCoffee = true;
     }
  }
}
```
Et le test de cette classe 
```java
public class CoffeMakerTest {
 CoffeMaker cm = new CoffeMaker(); 
 @Test
 void test_can_make_coffee() {
   cm.isMakingCoffee = false;
   cm.makeACoffee();
   assertFalse(cm.isMakingCoffee);
 }
}
```
Si on execute les tests de classe, le code coverage sera de 50%; pourquoi ? 
Lors de l'exécution des tests, toute la méthode n'est pas couverte à cause du if. En effet, en fonction de la valeur de isMakingCoffee l'une ou l'autre des instructions
l' ```isMakingCoffee = true;``` ou ```System.out.println("Already making a coffee");``` mais pas les deux. 
Et si on vaut passer à 100%, il faut aussi tester le cas où ```cm.isMakingCoffee = false```.  


## Puis-je exporter le rapport des tests unitaires et du coverage ? 
IntellIJ permet d'exporter les rapports des tests en HTML, XML etc... 

### Pour exporter le rapport des TUs
1. Exécuter les testes 
2. Dans la fenêtre des résultats (en bas de l'écran), cliquer sur le bouton Export Test Results (icone vert)

### Pour exporter le rapport du coverage 
1. Exécuter le test coverage 
2. Dans le panel des résultats (à droite de l'écran), cliquer sur le bouton Generate Coverage Test report (icon vert)

## Comment améliorer le test coverage ? 
Le rapport du test coverage est déterminé par le ratio positif/SUM(positif, negatif). Ainsi, tant que le nombre de lignes en verts est grand tant le pourcentage du
code couvert est elévé. Pour améliorer le code coverage, il faut augmenter le nombre de ligne en vert ce qui revient à diminuer le nombre de ligne en rouge. 

