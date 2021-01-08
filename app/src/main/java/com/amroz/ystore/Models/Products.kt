package com.amroz.ystore.Models

import java.util.*

data class Products (
   val product_id:Int,
val title:String,
val details:String,
val color:String,
val order_date:Date,
val date:Date,
val product_features:String,
val rating:Int,
val price_y:Float,
val price_d :Float,
val user_id:Int ,
val cat_id:Int ,
val reports_id :Int
)