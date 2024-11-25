package mk.ukim.finki.lab.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import mk.ukim.finki.lab.model.Album;

@Repository
public class AlbumRepository {
    private final List<Album> albums;

    public AlbumRepository() {
        this.albums = List.of(
                new Album("Pure Heroine", "Pop", "2024"),
                new Album("Untrue", "Jazz", "1997"),
                new Album("A seat at the table", "Pop-rock", "1989"),
                new Album("AstroWorld", "Rock", "2022"),
                new Album("Hotel California", "Pop", "1998"));
    }

    public List<Album> findAll() {
        return albums;
    }

    public Optional<Album> findById(Long id) {
        return albums.stream().filter(album -> album.getId().equals(id)).findAny();
    }

}
