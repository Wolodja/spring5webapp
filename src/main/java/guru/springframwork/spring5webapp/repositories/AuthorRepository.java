package guru.springframwork.spring5webapp.repositories;

import guru.springframwork.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
