To run this

1. git clone <repo>  # or unzip the folder
2. cd DockerTraining
3. docker-compose up --build


This will:
1. Build the Java Docker image
2. Start the MySQL container
3. Start the Java app container

FOR PUSHING TO DOCKERHUB:
docker tag dockerimagename yourdockerhubusername/dockerimagename:latest
docker login
docker push yourdockerhubusername/dockerimagename:latest


For someone to use:

docker pull yourdockerhubusername/dockertraining_app:latest
docker-compose up
