package integrado.prog2.repository.impl;

import integrado.prog2.entities.Categoria;
import integrado.prog2.repository.CategoriaRepository;
import java.util.ArrayList;
import java.util.List;

public class CategoriaMemoryRepository implements CategoriaRepository{
    private final List<Categoria> tablaCategorias = new ArrayList<>();
    private long ultimoId = 0;

    @Override
    public void guardar(Categoria categoria){
        ultimoId++;
        categoria.setId(ultimoId);
        tablaCategorias.add(categoria);
    }

    @Override
    public List<Categoria> listarTodas(){
        return tablaCategorias.stream().filter(c -> !c.isEliminado()).toList();
    }

    @Override
    public Categoria buscarPorId(Long id) {
        return tablaCategorias.stream()
                .filter(c -> c.getId().equals(id) && !c.isEliminado())
                .findFirst()
                .orElse(null);
    }

    @Override
    public void actualizar(Categoria categoria) {}
}
