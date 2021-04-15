# Data Science Toolbox

A docker microservices "box" hosted in docker with a python flask GUI app. Implements several data science tools. Created for CS1660, Intro to Cloud Computing, University of Pittsburgh.

Docker Hub link for image: https://hub.docker.com/repository/docker/mkdatz/datzprojectflasknew

Video demo: https://pitt.app.box.com/folder/135580757188?s=u7l8qzzusba4w5uqknelyjpkxc9rpp2l

(I apologize for the long video, I was unable to pause recording and my computer was running very slow as I had another project in the background.)

## To Run

Download this repository and navigate to the directory with the docker compose file. 

Call "docker-compose up" (-d flag optional) and wait for images to install!

Once the images are installed and completed- navigate to your localhost in a browser of your choice, IP port 5000 (flask default)."localhost:5000"

Click on any button to navigate to that microservice. Note that each button opens in the same tab, so you will need to right click to open in a new tab.

Call "docker-compose down" when you are finished!

## Passwords/Access codes

Orange data mining through noVNC: "pass"

## Prerequisites

Docker installed on the host machine.

NOTE: this software was tested on macOS Big Sur and very briefly on Windows 10. I cannot speak to issues with other operating systems.

Make sure your ports are free before starting the app- docker often throws errors if these ports are previously allocated. As a personal note, make sure to close any Jupyter sessions, as this app accesses the same port.

## Grading Notes

Sonarqube had run previously, but it looks like the underlying Elastisearch is flagged as a possible memory leak in MacOS Big Sur. I was unable to load the container corrrectly after running it once. I mentioned this in the video.

## Video

https://pitt.app.box.com/folder/135580757188?s=u7l8qzzusba4w5uqknelyjpkxc9rpp2l


## License
[MIT](https://choosealicense.com/licenses/mit/)
