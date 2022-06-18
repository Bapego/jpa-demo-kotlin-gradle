// Kommentben JPA-hez tartoznak az annotációk
package com.sonrisa.barath.PeldaProject.domain

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*


@Entity(name = "artists")
class Artist (
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    var id: Long,

    @Column(name="Nev", columnDefinition = "TEXT" /*, /*Ha nem text hane varchar*/ length = 10000*/)
    var name: String,

    @Column(name = "Kor")
    var age: Int,

    @JsonBackReference
    @OneToMany(mappedBy = "artist", cascade= arrayOf(CascadeType.ALL), fetch = FetchType.LAZY) //Artistból csak egy de productból több, és az artist az irányító
    var products: List<Product>
){
    constructor() : this(0,"",
            0, emptyList()
    )

    override fun toString(): String {
        return "[" + this.id + ", " + this.name + "]"
    }
}