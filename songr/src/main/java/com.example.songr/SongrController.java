package com.example.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SongrController {
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String getAlbums(Model m){

//        Album westlife = new Album("Beautiful in white","Westlife", 1,185, "https://3.bp.blogspot.com/-8y4rK9MsRO4/W1a_TTsNHxI/AAAAAAAAArU/WdJZ4DuBlsgVmpIX4-A9rROL-vQD4t2AQCLcBGAs/s1600/westlife-beautiful-in-white-lyrics-750-m.jpg");
//        Album digitalFortress = new Album("Zay Ma Enti", "Amr Diab", 5, 3600, "https://i.ytimg.com/vi/NYntUyksG5E/maxresdefault.jpg");
//        Album crimeAndPunishment = new Album("Ana Weyak","Ziad Bourji", 1, 180, "https://i.ytimg.com/vi/5EU-3vmgJJk/sddefault.jpg");
//
//        List<Album> albums = new ArrayList<>();
//        albums.add(westlife);
//        albums.add(digitalFortress);
//        albums.add(crimeAndPunishment);

        m.addAttribute("albums", albumRepository.findAll());
        return "albums.html";
    }

    @GetMapping("/addAlbum")
    public String getAddAlbumView(){
        return "addAlbum.html";
    }

    @PostMapping("/albums")
    public RedirectView addAlbum(@RequestParam(value = "title") String title ,
                                 @RequestParam(value= "artist") String artist,
                                 @RequestParam(value="songCount") int songCount,
                                 @RequestParam(value="length") int length,
                                 @RequestParam(value="imageUrl") String imageUrl){
        Album album = new Album(title,artist,songCount,length,imageUrl);
        albumRepository.save(album);
        return  new RedirectView("/albums");
    }
}
