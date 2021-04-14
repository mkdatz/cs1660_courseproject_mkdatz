# Data Science Toolbox

A docker microservices "box" hosted in docker with a python flask GUI app. Created for CS1660, Intro to Cloud Computing, University of Pittsburgh.

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
