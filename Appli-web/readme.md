# Compile de tous les modules depuis le parent
# --------------------------------------------
cd C:\Applications\Workspaces\workspace-Spring\Appli-multi-modules

mvn clean package

...
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary:
[INFO]
[INFO] Application Multi modules .......................... SUCCESS [  0.129 s]
[INFO] Appli-domaine ...................................... SUCCESS [  1.692 s]
[INFO] Appli-dao .......................................... SUCCESS [  0.460 s]
[INFO] Appli-service ...................................... SUCCESS [  0.379 s]
[INFO] Appli-web Maven Webapp ............................. SUCCESS [  0.536 s]
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
Démarrage du war sur http://localhost:8080/Appli-web                                                                                        
Création de la configuration du serveur Tomcat sur C:\Applications\Workspaces\workspace-Spring\Appli-multi-modules\Appli-web\target\tomcat  
create webapp with contextPath: /Appli-web                                                                                                  
...

http://localhost:8080/Appli-web/ 
==> Affiche : Hello World from jsp page !

http://localhost:8080/Appli-web/hello
==> Affiche : 
Hello World from HelloServlet !!!
---------------------------------
[{"id":"1","name":"Mohamed"},{"id":"2","name":"Luck"},{"id":"3","name":"Karine"}] 


# Start tomcat
mvn clean install tomcat7:run
