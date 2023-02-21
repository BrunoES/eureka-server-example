build:
	cd ./server && mvn clean install -DskipTests
	cd ./controle-de-estoque && mvn clean install -DskipTests
	cd ./controle-de-pedidos && mvn clean install -DskipTests
	cd ./processador-de-pagamentos && mvn clean install -DskipTests
	cd ./notificador && mvn clean install -DskipTests
	docker image rm server
	docker image rm controle-de-estoque
	docker image rm controle-de-pedidos
	docker image rm processador-de-pagamentos
	docker image rm notificador
	docker build -t server ./server
	docker build -t controle-de-estoque ./controle-de-estoque
	docker build -t controle-de-pedidos ./controle-de-pedidos
	docker build -t processador-de-pagamentos ./processador-de-pagamentos
	docker build -t notificador ./notificador
	docker compose up > application.log