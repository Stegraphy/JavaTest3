package exam3.service;

import exam3.entity.Film;
import exam3.mapper.FilmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmServiceImpl implements FilmService{
    @Autowired
    private FilmMapper filmMapper;
    @Override
    public void InserttoFilm(Film film) {
        filmMapper.InsertIntoFilm(film);
    }
}
