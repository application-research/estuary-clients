# estuary_client - ASP.NET Core 3.0 Server

This is the API for the Estuary application.

## Run

Linux/OS X:

```
sh build.sh
```

Windows:

```
build.bat
```

## Run in Docker

```
cd src/estuary_client
docker build -t estuary_client .
docker run -p 5000:5000 estuary_client
```
