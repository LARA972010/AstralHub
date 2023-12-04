package com.example.astralhub.domain.model

import com.example.astralhub.R


sealed class HoroscopeInfo ( val img:Int,val name:Int){
    data object Aries:HoroscopeInfo(R.drawable.aries , R.string.aries);
    data object Taurus:HoroscopeInfo(R.drawable.tauro , R.string.taurus);
    data object Gemini:HoroscopeInfo(R.drawable.geminis , R.string.gemini);
    data object Cancer:HoroscopeInfo(R.drawable.cancer , R.string.cancer);
    data object Leo:HoroscopeInfo(R.drawable.leon , R.string.leo);
    data object Virgo:HoroscopeInfo(R.drawable.virgo , R.string.virgo);
    data object Libra:HoroscopeInfo(R.drawable.justicia , R.string.libra);
    data object Scorpio:HoroscopeInfo(R.drawable.escorpion , R.string.scorpio);
    data object Sagittarius:HoroscopeInfo(R.drawable.sagitario , R.string.sagittarius);
    data object Capricorn:HoroscopeInfo(R.drawable.capricornio , R.string.capricorn);
    data object Aquarius:HoroscopeInfo(R.drawable.acuario , R.string.aquarius);
    data object Pisces:HoroscopeInfo(R.drawable.piscis , R.string.pisces);


}