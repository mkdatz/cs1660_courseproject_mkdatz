# Data Science Toolbox

A docker microservices "box" hosted in docker with a python flask GUI app. Implements several data science tools. Created for CS1660, Intro to Cloud Computing, University of Pittsburgh.

Docker Hub link for image: https://hub.docker.com/repository/docker/mkdatz/datzprojectflask

## To Run

Download this repository and navigate to the directory with the docker compose file. 

Call "docker-compose up" and wait for images to install!

Once the images are installed and completed- navigate to your localhost, IP port 5000 (flask default).

Click on any button to navigate to that microservice. Note that each button opens in the same tab, so you will need to right click to open in a new tab.

Call "docker-compose down" when you are finished!

## Prerequisites

Docker installed on the host machine.

NOTE: this software was tested on macOS Big Sur and very briefly on Windows 10. I cannot speak to issues with other operating systems.

Make sure your ports are free before starting the app- docker often throws errors if these ports are previously allocated. As a personal note, make sure to close any Jupyter sessions, as this app accesses the same port.

## Grading Notes

Sonarqube had run previously, but it looks like the underlying Elastisearch is flagged as a possible memory leak in MacOS Big Sur. I was unable to load the container corrrectly after running it once.

## Video

TO BE ADDED


## License
[MIT](https://choosealicense.com/licenses/mit/)
