package com.example.PR1819.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "        Это мозг компьютера. Он является главным компонентом и производит все вычисления в компьютере, контролирует все операции и процессы. Также является одним из самых дорогих компонентов, и цена очень хорошего современного процессора может переваливать за 50 000 рублей.\n" +
                "\n" +
                "        Бывают процессоры фирмы Intel и AMD. Тут кому что нравится, а так, Интелы меньше нагреваются, потребляют меньше электроэнергии. При всём этом у AMD лучше идёт обработка графики, т.е. больше подошёл бы для игровых компьютеров и тех, где работа будет вестись с мощными редакторами изображений, 3D графики, видео. На мой взгляд эта разница между процессорами не столь существенна и заметна…\n" +
                "\n" +
                "        Основной характеристикой является частота процессора (измеряется в Герцах. Например 2.5GHz), а также – разъём для подключения к материнской плате (сокет. Например, LGA 1150)."
    }
    val text: LiveData<String> = _text
}