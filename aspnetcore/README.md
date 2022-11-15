# estuary-client - ASP.NET Core 2.0 Server

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
cd src/estuary-client
docker build -t estuary-client .
docker run -p 5000:5000 estuary-client
```
