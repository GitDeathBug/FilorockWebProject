package com.filorock.app.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.filorock.app.entity.Producto;

public interface IProductoDao extends PagingAndSortingRepository<Producto, Long> {

}