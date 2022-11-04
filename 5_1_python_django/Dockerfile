# Dockerfile

# Pull base image
FROM python:3.7-slim

# Set environment variables
ENV PYTHONDONTWRITEBYTECODE 1
ENV PYTHONUNBUFFERED 1

RUN mkdir /code

# Set work directory
WORKDIR /code

# Install dependencies
COPY Pipfile Pipfile.lock /code/
RUN pip install pipenv && pipenv install --system

# Copy project
COPY . /code/
RUN chmod +x /code/run.sh

EXPOSE 8000

CMD ["/code/run.sh"]
