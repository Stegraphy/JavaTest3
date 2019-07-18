package exam3.mapper;

import exam3.entity.Film;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FilmMapper {
    @Insert("insert into film(title,description.language) where values(#{title},#{name},#{sex})")
    void InsertIntoFilm(Film film);
}
