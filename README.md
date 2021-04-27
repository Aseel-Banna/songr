# Songr Application

The application uses localhost:3333 with different routes:
1. /hello - page displays "Hello World!"
* Example: `localhost:3131/hello`
2. /capitalize/{string} - page displays the upper case of the string
* Example: `localhost:3131/capitalize/sample`
3. /albums - page displays all albums that are added by the user. 
* Example: `localhost:3131/albums`
4. /addAlbum - page that has a form to enable the user insert the album title, artist, songs count, length and image url. 
* Example: `localhost:3131/addAlbum`
5. /addSong - page that allows the user to insert a song that is related to an album. 
* Example: `localhost:3131/addSong`
6. /songs - page that holds all songs. 
* Example: `localhost:3131/songs`

### NOTE THAT USER CANNOT ADD A SONG WITHOUT ADDING AN ALBUM, BECAUSE THE SONG IS A PART OF AN ALBUM!
### When you add more than one song to the same album, then you will return to ***/songs*** route, which contains all songs for the same album! BUT if you return to the same route again, you will see all songs form different albums!

## Dependencies
    compile 'org.springframework.boot:spring-boot-starter-data-jpa'
	implementation('org.springframework.boot:spring-boot-starter-thymeleaf')
	implementation('org.springframework.boot:spring-boot-starter-web')
	runtimeOnly('org.postgresql:postgresql')
	testImplementation('org.springframework.boot:spring-boot-starter-test')