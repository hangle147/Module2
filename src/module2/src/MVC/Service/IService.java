package MVC.Service;

import java.util.List;

public interface IService <T>{
    List<T> getAll();

    void save(T t);

    void remove(int id);

    void update(int id, T t);

    T findById(int id);

    List<T> findAllByName(String name);
}
