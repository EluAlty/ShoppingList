package com.example.shoppinglist.domain

class RemoveAllShopItemsUseCase(private val shopListRepository: ShopListRepository) {
    fun removeAllShopItems(){
        shopListRepository.removeAllShopItems()
    }

}