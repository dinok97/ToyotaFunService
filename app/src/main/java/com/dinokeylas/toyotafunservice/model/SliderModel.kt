package com.dinokeylas.toyotafunservice.model

class SliderModel {
    private var image: Int = 0

    fun setImage(image: Int){
        this.image = image
    }

    fun getImage(): Int {
        return this.image
    }
}