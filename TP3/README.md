Dependencies:
-------------------------
Spring Web: La d�pendance spring-web contient des utilitaires communs sp�cifiques au Web pour les environnements Servlet et Portlet, tandis que spring-webmvc permet le support MVC pour les environnements Servlet. Comme spring-webmvc a spring-web comme d�pendance, il n'est pas n�cessaire de d�finir explicitement spring-web lorsqu'on utilise spring-webmvc.

JPA: Son objectif est d'unifier et de faciliter l'acc�s aux diff�rents types de magasins de persistance, qu'il s'agisse de syst�mes de bases de donn�es relationnelles ou de magasins de donn�es NoSQL.

Hibernate: Hibernate est utilis� pour acc�der � la couche de donn�es.

H2: H2 est une base de donn�es embarqu�e, open-source et en m�moire. C'est un syst�me de gestion de base de donn�es relationnelle �crit en Java. Il s'agit d'une application client/serveur. Il stocke les donn�es en m�moire, et ne les fait pas persister sur le disque.

DevTools: Les DevTools de Spring Boot r�cup�rent les changements et red�marrent l'application.

Thymeleaf: Thymeleaf est un moteur de mod�les Java c�t� serveur pour les environnements Web et autonomes, capable de traiter du HTML, du XML, du JavaScript, du CSS et m�me du texte brut.

Question 13:
-------------------------
1/ Avec quelle partie du code avons-nous param�tr� l'url d'appel /greeting ?
	Dans controller/HelloWorldController apres une notation @GetMapping qui est pour le mappage des requ�tes HTTP GET sur des m�thodes de 		traitement sp�cifiques. Alorrs cette methode prend comme parametre comme un url qui est dans notre cas "/greeting".
2/ Avec quelle partie du code avons-nous choisi le fichier HTML � afficher ?
	Dans la methode appel�e apres avoir une route /greeting, appel� greeting qui prend comme parametre le nom qui n'est pas required et une 	valeur par default si l'utilisateur ne passe pas de parametre... Cette methode return un fichier html appel� greeting.
3/ Comment envoyons-nous le nom � qui nous disons bonjour avec le second lien ?
http://localhost:8080/greeting?name=ENSIM
apres (name=), name est un parametre ger� par @RequestParam
L'annotation @RequestParam permet � Spring d'extraire des donn�es d'entr�e qui peuvent �tre transmises sous forme de requ�te, de donn�es de formulaire ou de toute autre donn�e personnalis�e arbitraire.

Question 17:
--------------------
Oui la classe Adresse est ajout�e.
Apres qu'on a une entit� Adress, Hybernate peut generer la class d'elle.

Question 20:
--------------------
Oui je voix.
1	57 boulevard demorieux	2023-01-18 17:26:51.516783
2	51 allee du gamay, 34080 montpellier	2023-01-18 17:26:51.51778

Question 30:
--------------------
https://www.youtube.com/watch?v=tzsNTcMHxis

TP4:
---- 
- Oui  il faut
- les deux String uri
- Get
- apres le cle coordonne
- apres le cle meteo