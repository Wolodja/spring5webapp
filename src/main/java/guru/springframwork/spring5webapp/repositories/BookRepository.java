package guru.springframwork.spring5webapp.repositories;

import guru.springframwork.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
