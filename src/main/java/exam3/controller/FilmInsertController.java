package exam3.controller;


import exam3.entity.Film;
import exam3.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmInsertController {

    @Autowired
    private FilmService filmService;

    @GetMapping("/test")
    public String testInsert(){
        return "test";
    }

    @PostMapping("/insert")
    public void save(@RequestBody Film film){
        filmService.InserttoFilm(film);
    }
}
