/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.dao;

import com.project.entity.Customer;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author phong
 */
@Repository
public class CustomerDAO {

    /**
     * Inject từ <bean class="...JdbcTemplate>
     */
    @Autowired
    protected JdbcTemplate jdbc;

    /**
     * Thêm mới 1 thực thể
     *
     * @param entity là thực thể mới
     */
    public void insert(Customer entity) {
        String sql = "INSERT INTO Customers (Id, Username, Password, Fullname, Date, Email, Phone, Address, Blocked, Role) VALUES(?,?,?,?,?,?,?,?,?,?)";
        jdbc.update(sql, entity.getId(), entity.getUsername(), entity.getPassword(), entity.getFullname(), entity.getDate(), entity.getEmail(), entity.getPhone(), entity.getAddress(), entity.getBlocked(), entity.getRole());
    }

    /**
     * Cập nhật thực thể
     *
     * @param entity là thực thể cần cập nhật
     */
    public void update(Customer entity) {
        String sql = "UPDATE Customers SET Fullname=?, Password=?, Email=?,Phone =  ?, Address =  ? WHERE  Id =  ?";
        jdbc.update(sql, entity.getFullname(), entity.getPassword(), entity.getEmail(), entity.getPhone(), entity.getAddress(), entity.getId());
    }

    /**
     * Cập nhật Password
     *
     * @param entity là thực thể cần cập nhật
     */
    public void changePw(Customer entity) {
        String sql = "UPDATE Customers SET Password = ? WHERE Id = ?";
        jdbc.update(sql, entity.getPassword(), entity.getId());
    }

    /**
     * Xóa thực thể theo mã
     *
     * @param id mã thực thể cần xóa
     */
    public void delete(Serializable id) {
        String sql = "DELETE FROM Customers WHERE Id=?";
        jdbc.update(sql, id);
    }

    /**
     * Truy vấn 1 thực thể theo username
     *
     * @param username mã thực thể cần truy vấn
     * @return thực thể truy vấn được
     */
    public Customer getByUsername(Serializable username) {
        String sql = "SELECT * FROM Customers WHERE username = ?";
        return jdbc.queryForObject(sql, getRowMapper(), username);
    }

    /**
     * Truy vấn 1 thực thể theo username
     *
     * @param email mã thực thể cần truy vấn
     * @return thực thể truy vấn được
     */
    public Customer getByEmail(Serializable email) {
        String sql = "SELECT * FROM Customers WHERE email = ?";
        return jdbc.queryForObject(sql, getRowMapper(), email);
    }

    public void resetPw(Customer entity) {
        String sql = "UPDATE Customers SET Password = ? WHERE Username = ?";
        jdbc.update(sql, entity.getPassword(), entity.getUsername());
    }

    /**
     * Truy vấn 1 thực thể theo mã
     *
     * @param id mã thực thể cần truy vấn
     * @return thực thể truy vấn được
     */
    public Customer getById(Serializable id) {
        String sql = "SELECT * FROM Customers where id=?";
        return jdbc.queryForObject(sql, getRowMapper(), id);
    }

    /**
     * Truy vấn tất cả các thực thể
     *
     * @return danh sách thực thể truy vấn được
     */
    public List<Customer> getAll() {
        String sql = "SELECT * FROM Customers";
        return getBySql(sql);
    }

    /**
     * Truy vấn tất cả các thực thể
     *
     * @return danh sách thực thể truy vấn được
     */
    public Customer getID(Serializable id) {
        String sql = "select * from Customers where id=?";
        return jdbc.queryForObject(sql, getRowMapper(), id);
    }

    /**
     * Truy vấn các thực thể theo câu lệnh sql
     *
     * @param sql câu lệnh truy vấn
     * @return danh sách thực thể truy vấn được
     */
    protected List<Customer> getBySql(String sql) {
        return jdbc.query(sql, getRowMapper());
    }

    /**
     * Ánh xạ cấu trúc bản ghi theo thuộc tính của bean
     *
     * @return ánh xạ bản ghi theo thuộc tính bean
     */
    private RowMapper<Customer> getRowMapper() {
        return new BeanPropertyRowMapper<Customer>(Customer.class);
    }
}
