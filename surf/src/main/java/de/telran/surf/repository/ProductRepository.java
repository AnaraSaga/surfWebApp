package de.telran.surf.repository;


import de.telran.surf.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.Collection;

@Repository
public class ProductRepository implements CommonRepository {

    private static final String SQL_INSERT = "INSERT INTO product (id, name, price, old_price," +
            "is_new, is_hot, picture, description) VALUES (:id, :name, :price, :old_price," +
            ":is_new, :is_hot, :picture, :description)";

    private static final String SQL_FIND_ALL = "SELECT * FROM product";

    private static final String SQL_FIND_BY_ID = "SELECT * FROM product WHERE id = :id";

    private static final String SQL_UPDATE = "UPDATE product SET name =:name, price =:price," +
            "old_price = :old_price, is_new = :is_new, is_hot = :is_hot, " +
            "description = :description, picture = :picture WHERE id = :id";

    private static final String SQL_DELETE = "DELETE FROM product WHERE id = :id";

    private final NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public ProductRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private RowMapper<Product> productRowMapper = (ResultSet rs, int rowNum) ->{
        Product product = new Product();
        product.setId(rs.getString("id");
        product.setName(rs.getString("name"));
        product.setPrice(rs.getDouble("price"));
        product.setOldPrice(rs.getDouble("oldPrice"));
        product.setHot(rs.getBoolean("is_hot"));
        product.setNew(rs.getBoolean("is_new"));
        product.setPicture(rs.getString("picture"));
        product.setDescription(rs.getString("description"));
        return product;
    };

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
