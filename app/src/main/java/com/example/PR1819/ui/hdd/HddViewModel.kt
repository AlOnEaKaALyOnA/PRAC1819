package com.example.PR1819.ui.hdd

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HddViewModel: ViewModel()  {
    private val _text = MutableLiveData<String>().apply {
        value = "        Вот это как раз-таки та память, на которой у вас постоянно хранятся все ваши файлы, куда устанавливаются программы, игры, скачиваются фильмы, музыка и всё прочее. Этот вид памяти не очищается после перезагрузки или выключения компьютера, как в случае с оперативной памятью, т.е. является энергонезависимой.\n" +
                "\n" +
                "        Бывают диски HDD и SSD. Последние начали массово использоваться не так-то и давно и постепенно вытесняют HDD за счёт своих неоспоримых преимуществ, главное из которых – скорость записи / считывания данных. У SSD она в 10-ки раз превышает скорость HDD. Помимо этого, SSD диски намного прочнее (поскольку в них отсутствуют движущиеся механизмы как в HDD), потребляют меньше энергии (HDD около 6 Вт, а SSD меньше 2Вт), бесшумны, намного легче по весу, меньше нагреваются.\n" +
                "\n" +
                "        Недостаток SSD – высокая стоимость. Например, диск SSD объёмом 120 Гб. может стоить около 6000 рублей, в то время как за эти же деньги можно купить диск HDD объёмом около 2-х терабайт :) Поэтому SSD диск целесообразнее покупать не очень небольшого размера (например, 120 Гб) и использовать его только для хранения операционной системы и установленных программ, а все нужные файлы (документы для работы, фильмы, фотки и прочее) хранить уже на HDD большого размера.\n" +
                "\n" +
                "        Ну и второй недостаток – число циклов перезаписи значительно меньше чем у HDD. А это значит, что SSD диски меньше служат. Но прогресс не стоит на месте и со временем эта проблема будет, я думаю, тоже решена.\n" +
                "\n" +
                "        Основная характеристика у HDD и SSD – объём для хранения данных. Чем он больше, тем, соответственно, больше вы сможете хранить на компьютере всякого барахла и важных документов :) На данный момент объёмы и тех, и других примерно уравниваются. Объёмы HDD для домашних компьютеров достигают уже 10 Тб. (терабайт). 10 Тб = 10 000 Гб. Это просто огромное пространство для хранения данных! Также не менее важной характеристикой для SDD является скорость записи / считывания. Чем она больше, тем лучше и хорошо если будет в районе 500 Мб/cек. Для HDD похожий параметр – скорость вращения шпинделя. Здесь вполне подойдут диски со скоростью 7200 оборотов в минуту."
        }
    val text: LiveData<String> = _text
}