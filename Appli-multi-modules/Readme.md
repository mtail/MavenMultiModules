# Appli-muti-modules
# ------------------
C'est un projet maven (parent donc pom) qui regroupe des modules maven (jar et war)
---> Appli-domaine (jar), Appli-dao(jar), Appli-service (jar), Appli-web (war)

# Compile les modules
# -------------------
cd C:\Applications\Workspaces\workspace-Spring\Appli-multi-modules

mvn clean package
 
==>
...
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary:
[INFO]
[INFO] Application Multi modules .......................... SUCCESS [  0.263 s]
[INFO] Appli-domaine ...................................... SUCCESS [  1.654 s]
[INFO] Appli-dao .......................................... SUCCESS [  0.511 s]
[INFO] Appli-service ...................................... SUCCESS [  0.400 s]
[INFO] Appli-web Maven Webapp ............................. SUCCESS [  0.600 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
...

# Lancer tomcat avec mvn pour le module Appli-web
# -----------------------------------------------

cd C:\Applications\Workspaces\workspace-Spring\Appli-multi-modules

cd Appli-web\

C:\Applications\Workspaces\workspace-Spring\Appli-multi-modules\Appli-web

mvn clean package tomcat7:run

...
Demarrage du war sur http://localhost:8080/Appli-web                                                                                        
Creation de la configuration du serveur Tomcat sur C:\Applications\Workspaces\workspace-Spring\Appli-multi-modules\Appli-web\target\tomcat  
create webapp with contextPath: /Appli-web                                                                                                  
...

# Resultats
# ---------

http://localhost:8080/Appli-web/ 
==> Affiche : Hello World from jsp page !

http://localhost:8080/Appli-web/hello
==> Affiche : 
Hello World from HelloServlet !!!
---------------------------------
[{"id":"1","name":"Mohamed"},{"id":"2","name":"Luck"},{"id":"3","name":"Karine"}] 

# Déployer Appli-web on tomcat
# ----------------------------
Déployer le war qui est dans Appli-web/target/Appli-web.war

# Exporter le projet maven
# -------------------------
Pour exporter le projet maven multi modules (avec tous ses modules), il faut faire un export 
dans eclipse en  File system ...

