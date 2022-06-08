package com.samohvalov.anybrousers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static String asd, ccc;
    SearchView SearchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SearchText = findViewById(R.id.search);
        ccc = "" + (SearchText.getQuery());
    }



    public void Yandex(View view) {
        ccc = "" + (SearchText.getQuery());
        asd = "https://yandex.ru/search/?lr=2&text=" + ccc;
        enter();
    }

    public void Google(View view) {
        ccc = "" + (SearchText.getQuery());
        asd = "https://www.google.com/search?q=" + ccc;
        enter();
    }

    public void YouTube(View view) {
        ccc = "" + (SearchText.getQuery());
        asd = "https://www.youtube.com/results?search_query=" + ccc;
        enter();
    }

    public void YandexMaps(View view) {
        ccc = "" + (SearchText.getQuery());
        asd = "https://yandex.ru/maps/2/rossiya/search/" + ccc;
        enter();
    }

    public void YandexMarket(View view) {
        ccc = "" + (SearchText.getQuery());
        asd = "https://market.yandex.ru/search?text=" + ccc;
        enter();
    }

    public void Steam(View view) {
        ccc = "" + (SearchText.getQuery());
        asd = "https://store.steampowered.com/search/?term=" + ccc;
        enter();
    }

    public void Dzen(View view) {
        ccc = "" + (SearchText.getQuery());
        asd = "https://zen.yandex.ru/search?query=" + ccc;
        enter();
    }

    public void Mailru(View view) {
        ccc = "" + (SearchText.getQuery());
        asd = "https://go.mail.ru/search?q=" + ccc;
        enter();
    }

    public void Vk(View view) {
        ccc = "" + (SearchText.getQuery());
        asd = "https://vk.com/search?c%5Bq%5D=" + ccc;
        enter();
    }

    public void KinoPoisk(View view) {
        ccc = "" + (SearchText.getQuery());
        asd = "https://kinopoisk.ru/index.php?kp_query=" + ccc;
        enter();
    }

    public void GooglePlay(View view) {
        ccc = "" + (SearchText.getQuery());
        asd = "https://play.google.com/store/search?q=" + ccc;
        enter();
    }

    public void Avito(View view) {
        ccc = "" + (SearchText.getQuery());
        asd = "https://www.avito.ru/sankt-peterburg?q=" + ccc;
        enter();
    }

    public void HelpMenu(View view) {
        Intent intent = new Intent(this, HelpMenu.class);
        startActivity(intent);
    }


    public void enter() {
        Intent intent = new Intent(this, Web.class);
        startActivity(intent);
    }
}