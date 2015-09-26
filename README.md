## Discogs

> *Discogs is a RESTful Java Service that exposes [Discogs.com](http://www.discogs.com) plethora of music metadata through your own relational database*

#### Motivation

To avoid service dependencies like rate limiting and application registration.. and to just build a thing.

#### Getting Started

1. First, follow database instructions [here](https://github.com/lukecoy/discogs-xml2db)

2. Fork this repo
  ```bash
  > brew install gradle # get Gradle if you haven't already
  >
  > git clone https://github.com/YOUR-USERNAME-HERE/Discogs.git
  > cd Discogs/
  > gradle build
  ```

3. *Doing good? Don't hesitate to make an issue.*

4. Modify Database [config](https://github.com/lukecoy/Discogs/blob/master/config.yaml)

  You'll likely need to change `driverClass`, `user`, `password`, `url`. 
  
5. Go!
  ```bash
  > gradle start
  ```
  You should see some endpoints like this in the gradle output you can hit:
  
  `GET     /discogs/artist/{name} (com.lukecoy.discogs.service.resources.ArtistResource)`

