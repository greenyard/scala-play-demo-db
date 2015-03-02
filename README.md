####

##### How to start the application?


1. Clone this project
git clone
2. Start the database
docker run -d -p 5432:5432 -e POSTGRES_PASSWORD=zalando -e POSTGRES_USER=zalando -v `pwd`/setup-docker-db.sh:/docker-entrypoint-initdb.d/setup-db.sh --name db postgres
