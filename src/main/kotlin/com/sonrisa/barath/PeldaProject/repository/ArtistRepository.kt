package com.sonrisa.barath.PeldaProject.repository

import com.sonrisa.barath.PeldaProject.domain.Artist
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ArtistRepository:CrudRepository<Artist, Long> {
    override fun findAll(): MutableIterable<Artist>
}