FROM python:3.12.0a1-slim-bullseye

EXPOSE 8000

ENV PYTHONDONTWRITEBYTECODE=1
ENV PYTHONUNBUFFERED=1

WORKDIR /code
COPY requirements.txt /code/requirements.txt

RUN pip install -r requirements.txt
RUN django-admin startproject mysite

ENTRYPOINT ["python3", "mysite/manage.py", "runserver", "0.0.0.0:8000"]