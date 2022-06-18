package com.sonrisa.barath.PeldaProject.domain

import org.hibernate.annotations.Cascade
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity(name = "products")
class Product(
        @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatikusan növeli
        @Id // Primery key lesz
        var id: Long = 0,
        var name: String= "",
        var description: String = "", //descreption
        var discount: Int = -1,
        var eod: Date = Date(), //endOfDiscount
        var price: Int = -1,
        @ManyToOne(fetch = FetchType.LAZY,cascade= arrayOf(CascadeType.ALL)) // Product-ból lehet sok de artistból csak egy
        var artist: Artist? = null
){
        override fun toString(): String {
                return "[" + this.id + ", " + this.name + ", " + this.description + ", " + this.discount + ", " + this.artist + "]\n"
        }
}