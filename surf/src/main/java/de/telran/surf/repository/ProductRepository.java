package de.telran.surf.repository;

import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class ProductRepository implements CommonRepository{

    private static final String SQL_INSERT = "INSERT INTO product (id, name, price, old_price," +
            "is_new, is_hot, picture, description) VALUES (:id, :name, :price, :old_price," +
            ":is_new, :is_hot, :picture, :description)";

    private static final String SQL_FIND_ALL = "SELECT * FROM product";

    private static final String SQL_FIND_BY_ID = "SELECT * FROM product WHERE id = :id";

    private static final String SQL_UPDATE = "UPDATE product SET name =:name, price =:price," +
            "old_price = :old_price, is_new = :is_new, is_hot = :is_hot, " +
            "description = :description, picture = :picture WHERE id = :id";

    private static final String SQL_DELETE = "DELETE FROM product WHERE id = :id";


    @Override
    public Object save(Object entity) {
        return null;
    }

    @Override
    public Iterable save(Collection entities) {
        return null;
    }

    @Override
    public void delete(Object entity) {

    }

    @Override
    public Object findById(String id) {
        return null;
    }

    @Override
    public Iterable findAll() {
        return null;
    }
}
