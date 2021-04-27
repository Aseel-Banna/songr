package com.example.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@SpringBootTest
@AutoConfigureMockMvc
class SongrRoutesTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testSongsRoute() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/songs"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.content().string(
                        org.hamcrest.Matchers.containsString("<p></p>")));
    }

    @Test
    public void testAddSongRoute() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/addSong"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.content().string(
                        org.hamcrest.Matchers.containsString("<p></p>")));
    }

    @Test
    public void testAddAlbumRoute() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/addAlbum"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.content().string(
                        org.hamcrest.Matchers.containsString("<p></p>")));
    }

    @Test
    public void testAlbumRoute() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/albums"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.content().string(
                        org.hamcrest.Matchers.containsString("<p></p>")));
    }

}
