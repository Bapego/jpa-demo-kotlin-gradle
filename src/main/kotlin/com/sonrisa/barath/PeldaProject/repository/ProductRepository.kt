package com.sonrisa.barath.PeldaProject.repository

import com.sonrisa.barath.PeldaProject.domain.Product
//import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository:CrudRepository<Product, Long> {
    // SELECT * FROM PRODUCT
    override fun findAll(): MutableIterable<Product>

    // SELECT * FROM PRODUCT WHERE id in (SELECT max(id) FROM PRODUCT) LIMIT 1
    fun findFirstByOrderByIdDesc(): Product

    // native SQL lekérdezésnek tekinti
//    @Query(value = "SELECT * FROM PRODUCTS  WHERE name = ?1 LIMIT 1", nativeQuery = true) // Ebben az esetben nem kell az annotáció a paraméterhez
//    @Query(value = "SELECT * FROM PRODUCTS  WHERE name = :name LIMIT 1", nativeQuery = true)
//    @Query(value = "select s from Product where s.name = :name") // EZZEL NEM MŰKÖDÖTT - JPQL lekérdező nyelven - Itt az objektumra, ne a táblára kell hivatkozni
    fun findByName(@Param("name") name: String): Product

    fun findAllByArtistNameIgnoreCaseOrderByIdDesc(name: String):List<Product>
}