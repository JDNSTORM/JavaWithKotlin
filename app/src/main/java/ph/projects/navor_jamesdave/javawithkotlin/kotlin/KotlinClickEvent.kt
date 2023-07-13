package ph.projects.navor_jamesdave.javawithkotlin.kotlin

import android.content.Context
import android.content.Intent

object KotlinClickEvent {
    fun toKotlin(context: Context){
        val intent = Intent(context, KotlinActivity::class.java)
        context.startActivity(intent)
    }
}