# Songr Application

The application uses localhost:3131 with different routes:
1. /hello - page displays "Hello World!"
* Example: `localhost:3131/hello`
2. /capitalize/{string} - page displays the upper case of the string
* Example: `localhost:3131/capitalize/sample`
3. /albums - page displays all albums that are added by the user. 
* Example: `localhost:3131/albums`
4. /addAlbum - page that has a form to enable the user insert the album title, artist, songs count, length and image url. 
* Example: `localhost:3131/addAlbum`

## Dependencies
    implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	developmentOnly 'org.springframework.boot:spring-boot-devtools'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
