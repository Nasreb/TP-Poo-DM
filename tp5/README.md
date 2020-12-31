# TP-Poo-DM

GitHub : https://github.com/Nasreb/TP-Poo-DM

Spring Data JPA
Persister les données dans les magasins SQL avec l'API Java Persistence à l'aide de Spring Data et Hibernate.

Spring Web
Créez des applications Web, y compris RESTful, à l'aide de Spring MVC. Utilise Apache Tomcat comme conteneur intégré par défaut.

Validation 
Bean Validation avec le validateur Hibernate.

H2
Fournit une base de données en mémoire rapide qui prend en charge l'API JDBC et l'accès R2DBC, avec un faible encombrement (2 Mo). Prend en charge les modes embarqués et serveur ainsi qu'une application console basée sur un navigateur.

Spring Boot DevTools
Fournit des redémarrages rapides des applications, LiveReload et des configurations pour une expérience de développement améliorée.

THymeleaf
Un moteur de modèle Java moderne côté serveur pour les environnements Web et autonomes. Permet au HTML d'être correctement affiché dans les navigateurs et en tant que prototypes statiques.

PARTIE 1

Etape 13 :
1) @GetMapping("/greeting")
2) le fait que la classe HelloWorldController soit précédé de @Controller et le "return "greeting";"de la méthode greeting
3) en donnant une valeur au nameGET puis avec "model.addAttribute("nomTemplate", nameGET);" et en la récupérant avec  ${nomTemplate} dans greeting.html

Etape 17 :

Table "ADDRESS" créée dans la base de données H2 incluant l'id, la date, le contenu et index. 
Une partie "Sequences" est aussi apparue.

Etape 18 :

Hibernate facilite la création de BDD en représentant une BDD en Java ou, du Java en BDD. Hibernate facilite la persistence en créant automatiquement des tables de base de données à partir de classes Java. 
Ici on a fait une nouvelle classe Address, Hibernate l'a donc lu et transformé en une table de notre BDD directement.

Etape 20 :

On voit tout le contenu de data.sql dans le résultat de la requête "Select * FROM Address" avec "CURRENT_TIMESTAMP" donnant la date du jour.

Etape 23 :

Autowired permet de lier automatiquement des éléments de l'app. Spring va relier l'interface et la classe. Il crée l'instance de la classe AddressController et injecte l'objet dans l'interface AddressRepository.

PARTIE 2

Etape 6 :

Pour appeler OpenWeatherMap, il faut une clé API.
On appelle l'URL : http://api.openweathermap.org/data/2.5/weather?lat=<>&lon=<>&units=metric&appid=<cléAPI>
Puis on utilise la méthode GET pour utiliser l'API et on passe les paramètres en les mettant dans l'URL juste après "lat=" et "lon=".
La température du lieu visé se situe dans le json après "temp".
Pour avoir les prévisions météos il faut appeler un autre URL du type : http://api.openweathermap.org/data/2.5/forecast/daily?lat=<>&lon=<&appid=<cléAPI> ou http://api.openweathermap.org/data/2.5/forecast/daily?q={city name}&cnt={cnt}&appid={API key}
