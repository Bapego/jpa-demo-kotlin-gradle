package com.sonrisa.barath.PeldaProject.controller

import com.sonrisa.barath.PeldaProject.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import java.util.*

@Controller
class HomeController {
    var productService: ProductService? = null
        @Autowired
        set(value) { field = value }


    @RequestMapping("/","/index")
    public fun index(model: Model, locale: Locale): String {
        model.addAttribute("pageTitleJava", "Virtua - Virtuális izé")
        println("A jelenlegi nyelv: ${locale.displayLanguage}\nAz ország: ${locale.displayCountry}")
        return "index"
    }

    @RequestMapping("/products")
    public fun products(model: Model): String {
        model.addAttribute("pageTitleJava", "Virtua - Virtuális izé")
        model.addAttribute("products", productService?.getProducts())
        return "products"
    }

//    @RequestMapping("/firstProduct")
//    public fun firstProduct(model: Model): String {
//        println(productService?.getFirstProduct()?.toString())
//        model.addAttribute("product", productService?.getFirstProduct())
//        return "services"
//    }
//
//    @RequestMapping("/products/{name}")
//    public fun searchForArtist(@PathVariable(value="name") name: String, model: Model): String {
//        model.addAttribute("product", productService?.getSpecificProduct(name))
//        return "services"
//    }

//    // Exception gyakorlás
//    @Throws(Exception::class)
//    @RequestMapping("/user/{id}")
//    fun searchForUser(@PathVariable(value="id") id: String): String {
//        if(id == "null")
//            throw Exception("Nincs ilyen user")
//        return "user"
//    }

    //Ez a funkció már a service-ben van
//    private fun getProducts(): MutableList<Product> {
//        var products: MutableList<Product> = productRepo?.findAll() as MutableList<Product>
//        return products
////        // Manuális adat betétel, nincs DB használat
////        var products: MutableList<Product> = mutableListOf<Product>()
////
////        var prodMin = Product(1,"Mini Szolgáltatás", "Ez egy olyan mini szolgáltatás, ami baromira nem éri meg neked, vedd meg a drágábbat!",0, Date(),200_000)
////        var prodMed = Product(2,"Medium Szolgáltatás", "Majdnem, de ez még nem a legdrágább! Huss tovább!",20, Date(), 600_000)
////        var prodMax = Product(3,"Max Szolgáltatás", "Ez egy olyan max szolgáltatás, ami baromira drága de nagyon megéri neked, vedd meg!",50, Date(), 10_000_000)
////
////        products.add(prodMin)
////        products.add(prodMed)
////        products.add(prodMax)
////
////
////        return products
//    }
}