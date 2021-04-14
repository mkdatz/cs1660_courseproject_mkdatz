FROM python:3

WORKDIR /root/datzproject/flaskGUI

COPY /app .

RUN pip install -r requirements.txt

EXPOSE 5000

ENTRYPOINT [ "python" ]

CMD [ "main.py" ]