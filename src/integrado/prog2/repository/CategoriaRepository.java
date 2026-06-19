package integrado.prog2.repository;
import integrado.prog2.entities.Categoria;
import java.util.List;

public interface CategoriaRepository {
    void guardar(Categoria categoria);
    List<Categoria> listarTodas();
    Categoria buscarPorId(Long Id);
    void actualizar(Categoria categoria);
}
